package hw7task2;

import java.util.Arrays;

public class MyDictionary<K, V> {

    private Node[] container;
    private int capacity;
    private int index;

    public MyDictionary() {
        // create empty MAP with 10 empty elements
        capacity = 10;
        index = 0;
        container = new Node[capacity];
    }

    public void put(K key, V value) {
        if (index == capacity - 1) {
            Node[] temp;
            temp = new Node[capacity + capacity/2];
            System.arraycopy(container, 0, temp, 0, container.length);
            container = temp;
        }

        if (index == 0 || (index > 0 && !mapContainsKey(key))) {
            container[index] = new Node(key, value);
            index++;
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

    public V getValueByKey(K key) {
        for (Node node: container) {
            if (node.getKey() == key) {
                return (V)node.getValue();
            }
        }
        return null;
    }

    private boolean mapContainsKey(K key) {
        for (int i = 0; i < index; i++) {
            if (container[i].getKey() == key) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return index;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(container, index));
    }
}
