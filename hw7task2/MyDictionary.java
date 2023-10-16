package hw7task2;

import java.util.Arrays;

public class MyDictionary <Type1, Type2> {

    private Node[] container;
    private int capacity;
    private int size;

    public MyDictionary() {
        // create empty MAP with 10 empty elements
        capacity = 10;
        size = 0;
        container = new Node[capacity];
    }

    public void put(Type1 key, Type2 value) {
        if (size == capacity - 1) {
            Node[] temp;
            temp = new Node[capacity + capacity/2];
            System.arraycopy(container, 0, temp, 0, container.length);
            container = temp;
        }

        if (size == 0 || (size > 0 && !mapContainsKey(key))) {
            container[size] = new Node(key, value);
            size++;
        }

        if (mapContainsKey(key)) {
            for (Node node : container) {
                if (node.getKey() == key) {
                    node.setValue(value);
                    break;
                }
            }
        }
    }

    public Type2 getValueByKey(Type1 key) {
        for (Node node: container) {
            if (node.getKey() == key) {
                return (Type2)node.getValue();
            }
        }
        return null;
    }

    private boolean mapContainsKey(Type1 key) {
        boolean contains = false;
        for (int i = 0; i < size; i++) {
            if (container[i].getKey() == key) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(container, size));
    }
}
