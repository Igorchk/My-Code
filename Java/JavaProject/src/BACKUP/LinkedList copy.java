public class LinkedList {
    private Node head;
    private Node tail;

    private class Node {
        String value;
        Node next;
        Node prev;

        Node(String Value) {
            this.value = Value;
        }
    }

    public String About() {
        return "Igor Romantsov a Computer Science Major";
    }

    public void AddHead(String value) {
        Node node = new Node(value);
        if (head == null) { // Checks if list is empty, if so, sets head and tail to new node
            head = node;
            tail = node;
        } else { // If not empty, make new node the head and set pointers
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void AddTail(String value) {
        Node node = new Node(value);
        if (tail == null) { // Checks if list is empty, if so, sets head and tail to new node
            head = node;
            tail = node;
        } else { // If not empty, make new node the tail and set pointers
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    public String RemoveHead() {
        if (head == null) { // If list is empty, return empty string
            return "";
        } else { // If not empty, remove head and set new head
            String value = head.value;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return value;
        }
    }

    public String RemoveTail() {
        if (tail == null) { // If list is empty, return empty string
            return "";
        } else { // If not empty, remove tail and set new tail
            String value = tail.value;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            return value;
        }
    }

    public Boolean IsEmpty() { // Checks if list is empty
        if (head == null && tail == null) {
            return true;
        } else {
            return false;
        }
    }

    public String ToString() { // Prints list from head to tail
        StringBuilder string = new StringBuilder();
        Node current = head;
        while (current != null) {
            string.append(current.value);
            if (current.next != null) {
                string.append(", ");
            }
            current = current.next;
        }
        return string.toString();
    }

    public String ToStringReverse() { // Prints list from tail to head
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