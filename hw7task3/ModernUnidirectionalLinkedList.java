package hw7task3;

public class ModernUnidirectionalLinkedList<T> {
    private Node first;
    private Node last;
    private int size;

    public ModernUnidirectionalLinkedList() {
        first = null;
        last = null;
        size = 0;
    }
    //************************************************
    public int size() {
        return size;
    }
    public void add(final T o) {

    }
    public void add(final int index, final T data) {

    }
    public void remove(int index) {

    }
    public void remove(T data) {

    }
    public void insertHead(T data) {

    }
    //**************************************************
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
