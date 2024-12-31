public class FieldQueue {
    // LinkedList instance to implement the queue
    private LinkedList linky = new LinkedList();

    // Method to add an item to the end of the queue
    public void Enqueue(Field item) {
        linky.AddTail(item);
    }

    // Method to remove an item from the front of the queue
    public Field Dequeue() {
        return linky.RemoveHead();
    }

    // Method to check if the queue is empty
    public boolean IsEmpty() {
        return linky.IsEmpty();
    }

    // Method to print the queue from front to back
    public String ToString() {
        return linky.ToString();
    }
}