package hw7task1;

import java.util.Arrays;

public class MyList<T> {
    private Object[] container;

    private int capacity;
    private int index;

    public MyList() {
        capacity = 10;
        index = 0;
        container = new Object[capacity];
    }

    public void addElement(T element) {
        if (index == capacity - 1) {
            Object[] temp;
            temp = new Object[capacity + capacity/2];
            for (int i = 0; i < container.length; i++) {
                temp[i] = container[i];
            }
            container = temp;
        }
        container[index] = element;
        index++;
    }

    public T getElementByIndex(int indexToFind) {
        return indexToFind >= 0 && indexToFind <= index ? (T)container[indexToFind] : null;
    }

    public int getSize() {
        return index;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(container, index));
    }
}
