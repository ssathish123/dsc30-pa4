/*
 * NAME: Sanjit Sathish
 * PID: A17804789
 */

import java.util.AbstractList;

/**
 *
 * @author Sanjit
 * @since 2024
 */
public class DoublyLinkedList<T> extends AbstractList<T> {

    /* DLL instance variables */
    private int nelems;
    private Node head;
    private Node tail;

    /**
     * Node for chaining together to create a linked list
     */
    protected class Node {

        /* Node instance variables */
        T data;
        Node next;
        Node prev;

        /**
         * Constructor to create singleton Node
         */
        private Node(T element) {
            data = element;
        }

        /**
         * Constructor to create singleton link it between previous and next
         *
         * @param element  Element to add, can be null
         * @param nextNode successor Node, can be null
         * @param prevNode predecessor Node, can be null
         */
        private Node(T element, Node nextNode, Node prevNode) {
            data = element;
            next = nextNode;
            prev = prevNode;
        }

        /**
         * Set the element
         *
         * @param element new element
         */
        public void setElement(T element) {
            data = element;
        }

        /**
         * Accessor to get the Nodes Element
         */
        public T getElement() {
            return data;
        }

        /**
         * Set the next node in the list
         *
         * @param n new next node
         */
        public void setNext(Node n) {
            next = n;
        }

        /**
         * Get the next node in the list
         *
         * @return the successor node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Set the previous node in the list
         *
         * @param p new previous node
         */
        public void setPrev(Node p) {
            prev = p;
        }


        /**
         * Accessor to get the prev Node in the list
         *
         * @return predecessor node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Remove this node from the list.
         * Update previous and next nodes
         */
        public void remove() {
            this.prev.next = this.next;
            this.next.prev = this.prev;
        }
    }

    /**
     * Creates a new, empty doubly-linked list.
     */
    public DoublyLinkedList() {
        nelems = 0;
        head = new Node(null);;
        tail = new Node(null);;
    }

    /**
     * Add an element to the end of the list
     *
     * @param element data to be added
     * @return whether or not the element was added
     * @throws NullPointerException if data received is null
     */
    @Override
    public boolean add(T element) throws NullPointerException {
        if (element == null){
            throw new NullPointerException();
        }

        Node node = new Node(element, null, null);
        tail.next = node;
        node.prev = tail;
        tail = node;
        nelems += 1;

        return true;
    }


    /**
     * Adds an element to a certain index in the list, shifting exist elements
     * create room. Does not accept null values.
     *
     *
     */
    @Override
    public void add(int index, T element)
            throws IndexOutOfBoundsException, NullPointerException {
        nelems += 1;

        if (nelems < index){
            throw new IndexOutOfBoundsException();
        }

        if (element == null){
            throw new NullPointerException();
        }

        Node currentNode = getNth(index-1);
        Node newNode = new Node(element);
        currentNode.next.prev = newNode;
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        newNode.prev = currentNode;

    }

    /**
     * Clear the linked list
     */
    @Override
    public void clear() {
        while (nelems != 0){
            remove(0);
        }
    }

    /**
     * Determine if the list contains the data element anywhere in the list.
     *
     *
     */
    @Override
    public boolean contains(Object element) {
        T data = (T) element;

        Node currentNode = head;
        for (int i = 0; i < nelems; i++){
            currentNode = currentNode.next;
            if (currentNode.data == data){
                return true;
            }
        }

        return false;
    }

    /**
     * Retrieves the element stored with a given index on the list.
     *
     *
     */
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= nelems){
            throw new IndexOutOfBoundsException();
        }
        return getNth(index).data;
    }

    /**
     * Helper method to get the Nth node in our list
     *
     *
     */
    private Node getNth(int index) {
        if (index >= nelems){
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = head;
        for (int i = 0; i < index+1; i++){
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    /**
     * Determine if the list empty
     *
     *
     */
    @Override
    public boolean isEmpty() {
        if (nelems == 0){
            return true;
        }
        return false;
    }

    /**
     * Remove the element from position index in the list
     *
     *
     */
    @Override
    public T remove(int index) throws IndexOutOfBoundsException {

        Node currentNode = getNth(index);
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;

        nelems -= 1;

        return currentNode.data;
    }

    /**
     * Set the value of an element at a certain index in the list.
     *
     * TODO: javadoc comments
     */
    @Override
    public T set(int index, T element)
            throws IndexOutOfBoundsException, NullPointerException {

        if (nelems < index){
            throw new IndexOutOfBoundsException();
        }

        if (element == null){
            throw new NullPointerException();
        }
        Node current_Node = getNth(index);
        T old_data = current_Node.data;
        current_Node.data = element;

        return old_data;
    }

    /**
     * Retrieves the amount of elements that are currently on the list.
     *
     * TODO: javadoc comments
     */
    @Override
    public int size() {
        return nelems;
    }

    /**
     * String representation of this list in the form of:
     * "[(head) -> elem1 -> elem2 -> ... -> elemN -> (tail)]"
     *
     *
     */
    @Override
    public String toString() {
        String listString = "[(head) -> ";
        for (int i =0; i < nelems; i++){
            listString += get(i);
            listString += "-> ";
        }
        listString += "(tail)]";

        return listString;
    }

    /* ==================== EXTRA CREDIT ==================== */

    /**
     * Mimic Python list slicing, modify list in place
     *
     * TODO: javadoc comments
     */
    public void slice(int start, int end, int step) {
        // TODO: complete implementation       
    }

    /**
     * Recursively swaps halves of list for n recursive layers
     *
     * TODO: javadoc comments
     */
    public void swapHalves(int n, int start, int end) {
        // TODO: complete implementation
    }

}
