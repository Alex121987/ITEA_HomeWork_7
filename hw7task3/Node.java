package hw7task3;

public class Node<T> {
    private Node<T> nextNode;
    private T value;
    private int indexOfNode;

    public Node(T value, Node<T> nextNode, int indexOfNode) {
        this.nextNode = nextNode;
        this.value = value;
        this.indexOfNode = indexOfNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getIndexOfNode() {
        return indexOfNode;
    }

    public void setIndexOfNode(int indexOfNode) {
        this.indexOfNode = indexOfNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", indexOfNode=" + indexOfNode +
                '}';
    }
}
