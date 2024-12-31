import java.util.Scanner;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeNodesWithTimestamp() {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.data.matches("^\\d{1,2}:\\d{2}.*$")) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lines of text (enter 'exit' to stop):");
        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            list.insert(input);
            input = scanner.nextLine();
        }

        System.out.println("Contents of the linked list before removing nodes with timestamp:");
        list.printList();

        list.removeNodesWithTimestamp();

        System.out.println("Contents of the linked list after removing nodes with timestamp:");
        list.printList();
    }
}
