public class LinkedList {
    private Node head;
    private Node tail;

    // Inner class representing a node in the linked list
    public class Node {
        public Field value;
        public Node next;
        public Node prev;

        Node(Field value) {
            this.value = value;
        }
    }

    // Method returning information about the author
    public String About() {
        return "Igor Romantsov a Computer Science Major";
    }

    // Method to add a new node at the head of the linked list
    public void AddHead(Field item) {
        Node node = new Node(item); // Create a new node
        if (head == null) { // If the list is empty, set the new node as the head and tail
            head = node;
            tail = node;
        } else { // If the list is not empty, set the new node as the head and update pointers
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Method to add a new node at the tail of the linked list
    public void AddTail(Field item) {
        Node node = new Node(item); // Create a new node
        if (tail == null) { // If the list is empty, set the new node as the head and tail
            head = node;
            tail = node;
        } else { // If the list is not empty, set the new node as the tail and update pointers
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    // Method to remove the head node of the linked list
    public Field RemoveHead() {
        if (head == null) { // If the list is empty, return null
            return null;
        } else { // If the list is not empty, remove the head node and update pointers
            Field value = head.value;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return value;
        }
    }

    // Method to remove the tail node of the linked list
    public Field RemoveTail() {
        if (tail == null) { // If the list is empty, return null
            return null;
        } else { // If the list is not empty, remove the tail node and update pointers
            Field value = tail.value;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            return value;
        }
    }

    // Method to check if the linked list is empty
    public Boolean IsEmpty() {
        if (head == null && tail == null) {
            return true;
        } else {
            return false;
        }
    }

    // Method to print the linked list from head to tail
    public String ToString() {
        StringBuilder string = new StringBuilder();
        Node current = head;
        while (current != null) {
            string.append(current.value.Value + " Key: " + current.value.Key);
            if (current.next != null) {
                string.append("\n");
            }
            current = current.next;
        }
        return string.toString();
    }

    // Method to print the linked list from tail to head
    public String ToStringReverse() {
        StringBuilder string = new StringBuilder();
        Node current = tail;
        while (current != null) {
            string.append(current.value);
            if (current.prev != null) {
                string.append(", ");
            }
            current = current.prev;
        }
        return string.toString();
    }
}