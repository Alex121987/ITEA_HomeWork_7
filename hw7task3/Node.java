package hw7task3;

public class Node<T> {
    private Node nextNode;
    private T value;
    private int indexOfNode = 0;

    public Node(Node nextNode, T value) {
        this.nextNode = nextNode;
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
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
}
