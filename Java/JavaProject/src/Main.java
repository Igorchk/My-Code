
// Import necessary libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    // Initialize a FieldQueue and an integer to hold the number of digits in the
    // keyz
    static FieldQueue queue = new FieldQueue();
    static public Integer keyz;

    public static void main(String[] args) throws FileNotFoundException {
        readFile("pokemon.txt");
        Sort();
        System.out.println(queue.ToString());
    }

    public static void Sort() {
        // Initialize an array of FieldQueues to act as buckets for sorting
        FieldQueue[] input = new FieldQueue[10];
        for (int i = 0; i < 10; i++) {
            input[i] = new FieldQueue();
        }
        // Perform radix sort
        for (int pass = 0; pass < keyz; pass++) {
            // Distribute the items from the queue to the buckets
            while (!queue.IsEmpty()) {
                Field current = queue.Dequeue();
                String curDigit = "0"; // Default to "0"
                // Get the current digit of the key
                if (pass < current.Key.length()) {
                    curDigit = String.valueOf(current.Key.charAt(current.Key.length() - 1 - pass));
                }
                // Add the item to the appropriate bucket
                input[Integer.parseInt(curDigit)].Enqueue(current);
            }

            // Clear the original queue
            queue = new FieldQueue();
            // Collect the items from the buckets back to the queue
            for (FieldQueue fq : input) {
                while (!fq.IsEmpty()) {
                    queue.Enqueue(fq.Dequeue());
                }
            }
        }
    }

    public static void readFile(String myFile) throws FileNotFoundException {
        File file = new File(myFile);
        Scanner scan = new Scanner(file);
        // Read the first line to get the number of digits in the key
        String count = scan.nextLine();
        keyz = Integer.valueOf(count);
        // Read the rest of the file
        while (scan.hasNextLine()) {
            String key = scan.nextLine();
            // Break if the key is "0"
            if (key == "0") {
                break;
            }
            // Read the value and add the key-value pair to the queue
            if (scan.hasNextLine()) {
                String value = scan.nextLine(); // Check if there's another line for the value
                Field field = new Field();
                field.Key = key;
                field.Value = value;
                queue.Enqueue(field);
            }
        }
        scan.close();
    }
}