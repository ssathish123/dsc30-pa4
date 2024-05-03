import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @BeforeEach
    public void LinkedList(){
        DoublyLinkedList listName = new DoublyLinkedList();
    }

    @Test
    public void addTest(){
        DoublyLinkedList listName = new DoublyLinkedList();
        assertEquals(true, listName.add(3));
        assertEquals(3,listName.get(0));
        listName.add(4);
        assertEquals(4,listName.get(1));
    }

    @Test
    public void addIndexTest(){
        DoublyLinkedList listName = new DoublyLinkedList();
        listName.add(4);
        listName.add(4);
        listName.add(1, 3);
        assertEquals(3,listName.get(1));
        listName.add(0, 3);
        assertEquals(3,listName.get(0));
        listName.add(2, 4);
        assertEquals(4,listName.get(2));
    }

    @Test
    public void isEmpty(){
        DoublyLinkedList listName = new DoublyLinkedList();
        assertEquals(true, listName.isEmpty());
        listName.add(4);
        assertEquals(false, listName.isEmpty());
        listName.add(3);
        listName.add(3);
        assertEquals(false, listName.isEmpty());
    }

    @Test
    public void sizeTest(){
        DoublyLinkedList listName = new DoublyLinkedList();
        assertEquals(0, listName.size());
        listName.add(4);
        assertEquals(1, listName.size());
        listName.add(3);
        listName.add(3);
        assertEquals(3, listName.size());
    }

    @Test
    public void getTest(){
        DoublyLinkedList listName = new DoublyLinkedList();
        listName.add(1);
        listName.add(1);
        listName.add(1, 2);
        assertEquals(2,listName.get(1));
        listName.add(0, 3);
        assertEquals(3,listName.get(0));
        assertEquals(2,listName.get(2));
    }

    @Test
    public void containsTest(){
        DoublyLinkedList listName = new DoublyLinkedList();
        listName.add(1);
        listName.add(1);
        assertEquals(true,listName.contains(1));
        assertEquals(false,listName.contains(2));
        listName.add(2);
        assertEquals(true,listName.contains(2));
    }

    @Test
    public void set(){
        DoublyLinkedList listName = new DoublyLinkedList();
        listName.add(1);
        listName.add(1);
        assertEquals(1,listName.set(1,2));
        assertEquals(2,listName.set(1,3));
        listName.add(3);
        assertEquals(3,listName.set(2,3));
    }

    @Test
    public void remove(){
        DoublyLinkedList listName = new DoublyLinkedList();
        listName.add(1);
        listName.add(1);
        listName.add(1);
        assertEquals(1,listName.remove(1));
        listName.add(2);
        assertEquals(1,listName.remove(1));
        listName.add(2);
        assertEquals(2,listName.remove(1));
    }

}
