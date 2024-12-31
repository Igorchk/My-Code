import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static LinkedList Linky = new LinkedList();
    static public Integer keyz;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("About: " + Linky.About());
        readFile("zipcodes.txt");
        Sort();
        System.out.println(Linky.ToString());
    }

    public static void Sort() {
        FieldQueue[] bucket = new FieldQueue[10];
        for (int i = 0; i < 10; i++) {
            bucket[i] = new FieldQueue();
        }

        for (int position = 0; position < keyz; position++) {
            while (!Linky.IsEmpty()) {
                Field field = Linky.RemoveHead();
                String key = field.Key;
                int digitPosition = key.length() - 1 - position; // Start from the least significant digit
                if (digitPosition >= 0) {
                    int digit = Character.getNumericValue(key.charAt(digitPosition));
                    bucket[digit].Enqueue(field);
                } else {
                    bucket[0].Enqueue(field); // If the position exceeds the length of the key, put it in the 0 bucket
                }
            }

            Linky = new LinkedList(); // Clear the original list
            for (FieldQueue queue : bucket) {
                while (!queue.IsEmpty()) {
                    Linky.AddTail(queue.Dequeue());
                }
            }
        }
    }

    public static void readFile(String myFile) throws FileNotFoundException {
        File file = new File(myFile);
        Scanner scan = new Scanner(file);
        String count = scan.nextLine();
        keyz = Integer.valueOf(count); // Changed from "Integer.valueOf(count) - 1"
        while (scan.hasNextLine()) {
            String key = scan.nextLine();
            if (key.equals("0")) { // Changed from "key == "0""
                break;
            }
            if (scan.hasNextLine()) {
                String value = scan.nextLine(); // Check if there's another line for the value
                Field field = new Field();
                field.Key = key;
                field.Value = value;
                Linky.AddTail(field);
            }
        }
        scan.close();
    }

}