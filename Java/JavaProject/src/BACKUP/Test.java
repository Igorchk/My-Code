import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedList Linky = new LinkedList();
        try {
            String input;
            File file = new File("src/stooges.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                input = scan.nextLine();
                Linky.AddTail(input);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("\n" + Linky.ToString() + "\n");
        System.out.println(Linky.ToStringReverse() + "\n");
        System.out.println(Linky.IsEmpty() + "\n");
        Linky.RemoveHead();
        Linky.RemoveTail();
        Linky.AddHead("Curly");
        Linky.AddTail("Larry");
        System.out.println(Linky.ToString() + "\n");
        System.out.println(Linky.ToStringReverse() + "\n");
        System.out.println(Linky.IsEmpty() + "\n");
    }
}
