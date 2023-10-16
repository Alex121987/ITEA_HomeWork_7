package hw7task1;

import java.util.Arrays;

public class MyList<T> {
    private Object[] container;

    private int capacity;
    private int size;

    public MyList() {
        capacity = 10;
        size = 0;
        container = new Object[capacity];
    }

    public void addElement(T element) {
        if (size == capacity - 1) {
            Object[] temp;
            temp = new Object[capacity + capacity/2];
            for (int i = 0; i < container.length; i++) {
                temp[i] = container[i];
            }
            container = temp;
        }
        container[size] = element;
        size++;
    }

    public T getElementByIndex(int index) {
        return (T)container[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(container, size));
    }
}
