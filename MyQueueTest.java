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


}
