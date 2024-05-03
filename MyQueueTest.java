import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    public void isEmpty(){
        MyQueue queue = new MyQueue<>();
        assertEquals(true, queue.isEmpty());
        queue.enqueue(1);
        assertEquals(false, queue.isEmpty());
        queue.enqueue(2);
        assertEquals(false, queue.isEmpty());
    }

    @Test
    public void size(){
        MyQueue queue = new MyQueue<>();
        assertEquals(0, queue.size());
        queue.enqueue(1);
        assertEquals(1, queue.size());
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void enqueueTest(){
        MyQueue queue = new MyQueue<>();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
        queue.enqueue(2);
        assertEquals(2, queue.peek());
        queue.enqueue(3);
        assertEquals(3, queue.peek());
    }

    @Test
    public void dequeueTest(){
        MyQueue queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(2, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(1, queue.dequeue());
    }

    @Test
    public void peekTest(){
        MyQueue queue = new MyQueue<>();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
        queue.enqueue(2);
        assertEquals(2, queue.peek());
        queue.dequeue();
        assertEquals(1, queue.peek());
    }


}
