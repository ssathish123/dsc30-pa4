/*
    Name: Sanjit
    PID:  A17804789
 */

/**
 *
 *
 * @author Sanjit
 * @since 2024
 */

public class MyQueue<T> {
    
    /* instance variables, feel free to add if you need */
    DoublyLinkedList<T> queue;
    /* ===separation=== */

    public MyQueue() {
        queue  = new DoublyLinkedList<>();
    }

    public boolean isEmpty() {
        if (queue.size() == 0){
            return true;
        }
        return false;
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        T removed = queue.remove(0);
        return removed;
    }

    public T peek() {
        return queue.get(queue.size()-1);
    }

    @Override
    public String toString(){
        return queue.toString();
    }
}
