import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static LinkedList Linky = new LinkedList();

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("About: " + Linky.About());
        readFile("src/stooges.txt");
        System.out.println(Linky.ToStringReverse());
        String question = "What do you want to do: \n0. Quit \n1. Print Linked List \n2. Print Linked List in Reverse \n3. Add Head \n4. Remove Head \n5. Add Tail \n6. Remove Tail \n7. Check if List is Empty";
        System.out.println(question);
        Scanner scanInt = new Scanner(System.in);
        int inputInt = scanInt.nextInt();
        Scanner scanString = new Scanner(System.in);
        ;
        while (inputInt != 0) {
            switch (inputInt) {
                case 1:
                    System.out.println("\n" + Linky.ToString() + "\n");
                    break;

                case 2:
                    System.out.println("\n" + Linky.ToStringReverse() + "\n");
                    break;

                case 3:
                    System.out.println("Input what you want to add to the head:");
                    scanString.nextLine();
                    String newHead = scanString.nextLine();
                    Linky.AddHead(newHead);
                    System.out.println("\n" + Linky.ToString() + "\n");
                    break;

                case 4:
                    Linky.RemoveHead();
                    System.out.println("\n" + Linky.ToString() + "\n");
                    break;

                case 5:
                    System.out.println("Input what you want to add to the tail:");
                    scanString.nextLine();
                    String newTail = scanString.nextLine();
                    Linky.AddTail(newTail);
                    System.out.println("\n" + Linky.ToString() + "\n");
                    break;

                case 6:
                    Linky.RemoveTail();
                    System.out.println("\n" + Linky.ToString() + "\n");
                    break;

                case 7:
                    if (Linky.IsEmpty()) {
                        System.out.println("\n" + "List is Empty" + "\n");
                    } else {
                        System.out.println("\n" + "List is not Empty" + "\n");
                    }
                    break;

                default:
                    System.out.println("Invalid Input" + "\n");
                    break;
            }
            System.out.println(question);
            inputInt = scanString.nextInt();
        }
    }

    public static void readFile(String myFile) throws FileNotFoundException {
        String input;
        File file = new File(myFile);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            input = scan.nextLine();
            Linky.AddTail(input);
        }
    }
}