import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Lab2 {
    static Queue<Integer> queue0 = new LinkedList<>();
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    static Queue<Integer> queue3 = new LinkedList<>();
    static Queue<Integer> queue4 = new LinkedList<>();
    static Queue<Integer> queue5 = new LinkedList<>();
    static Queue<Integer> queue6 = new LinkedList<>();
    static Queue<Integer> queue7 = new LinkedList<>();
    static Queue<Integer> queue8 = new LinkedList<>();
    static Queue<Integer> queue9 = new LinkedList<>();
    static LinkedList Linky = new LinkedList<>();

    public static void main(String[] args) {
        ;
        try {
            String input;
            File file = new File("src/TestText/Lab2Numbers.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                input = scan.nextLine();
                Linky.add(input);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        while (!Linky.isEmpty()) {
            String input = (String) Linky.getFirst();
            Integer num = Integer.parseInt(input);
            findFirstDigit(num);
            Linky.removeFirst();
        }
        emptyQueue();
    }

    public static void findFirstDigit(Integer num) {
        int firstDigit = Math.abs(num);
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        switch (firstDigit) {
            case 0:
                queue0.add(num);
                break;
            case 1:
                queue1.add(num);
                break;
            case 2:
                queue2.add(num);
                break;
            case 3:
                queue3.add(num);
                break;
            case 4:
                queue4.add(num);
                break;
            case 5:
                queue5.add(num);
                break;
            case 6:
                queue6.add(num);
                break;
            case 7:
                queue7.add(num);
                break;
            case 8:
                queue8.add(num);
                break;
            case 9:
                queue9.add(num);
                break;
        }
    }

    public static void findSecondDigit(int num) {
        int secondDigit = (num / 10) % 10;
        switch (secondDigit) {
            case 0:
                queue0.add(num);
                break;
            case 1:
                queue1.add(num);
                break;
            case 2:
                queue2.add(num);
                break;
            case 3:
                queue3.add(num);
                break;
            case 4:
                queue4.add(num);
                break;
            case 5:
                queue5.add(num);
                break;
            case 6:
                queue6.add(num);
                break;
            case 7:
                queue7.add(num);
                break;
            case 8:
                queue8.add(num);
                break;
            case 9:
                queue9.add(num);
                break;
        }

    }

    public static void findThirdDigit(int num) {
        int thirdDigit = (num / 100) % 10;
        switch (thirdDigit) {
            case 0:
                queue0.add(num);
                break;
            case 1:
                queue1.add(num);
                break;
            case 2:
                queue2.add(num);
                break;
            case 3:
                queue3.add(num);
                break;
            case 4:
                queue4.add(num);
                break;
            case 5:
                queue5.add(num);
                break;
            case 6:
                queue6.add(num);
                break;
            case 7:
                queue7.add(num);
                break;
            case 8:
                queue8.add(num);
                break;
            case 9:
                queue9.add(num);
                break;
        }

    }

    public static void emptyQueue() {
        while (!queue0.isEmpty()) {
            Integer next = queue0.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue0: " + next);
        }
        while (!queue1.isEmpty()) {
            Integer next = queue1.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue1: " + next);
        }
        while (!queue2.isEmpty()) {
            Integer next = queue2.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue2: " + next);
        }
        while (!queue3.isEmpty()) {
            Integer next = queue3.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue3: " + next);
        }
        while (!queue4.isEmpty()) {
            Integer next = queue4.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue4: " + next);
        }
        while (!queue5.isEmpty()) {
            Integer next = queue5.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue5: " + next);
        }
        while (!queue6.isEmpty()) {
            Integer next = queue6.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue6: " + next);
        }
        while (!queue7.isEmpty()) {
            Integer next = queue7.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue7: " + next);
        }
        while (!queue8.isEmpty()) {
            Integer next = queue8.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue8: " + next);
        }
        while (!queue9.isEmpty()) {
            Integer next = queue9.remove();
            Linky.addFirst(next);
            System.out.println("Printed from queue9: " + next);
        }
        while (!Linky.isEmpty()) {
            System.out.println(Linky.remove());
        }
    }
}