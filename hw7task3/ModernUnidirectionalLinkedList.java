package hw7task3;

public class ModernUnidirectionalLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    private int index;

    public ModernUnidirectionalLinkedList() {
        first = null;
        last = null;
        size = 0;
        index = 0;
    }
    //************************************************
    public int size() {
        return size;
    }
    public void add(final T element) {
        if (first == null && last == null) {
            first = new Node<>(element, null, index);
            last = first;
            size++;
            index++;
        } else {
            Node<T> node = new Node<>(element, null, index);
            last.setNextNode(node);
            last = node;
            size++;
            index++;
        }
     }
    public void add(final int index, final T data) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index in method:".toUpperCase() + "add(final int index, final T data)!");
        }

        if (size == 0) {
            first = new Node<>(data, null, index);
            last = first;
            size++;
            this.index++;
        } else if (index == 0) {
            insertHead(data);
        } else {
            Node<T> prevNode = first;
            Node<T> currentNode = first.getNextNode();

            while(currentNode.getIndexOfNode() != index) {
                prevNode = currentNode;
                currentNode = currentNode.getNextNode();
            }

            prevNode.setNextNode(new Node<T>(data, currentNode, index));
            prevNode.getNextNode().setNextNode(currentNode);
            size++;

            while(currentNode != null) {
                currentNode.setIndexOfNode(currentNode.getIndexOfNode() + 1);
                currentNode = currentNode.getNextNode();
            }
        }
    }
    public void remove(int index) {

    }
    public void remove(T data) {

    }
    public void insertHead(T data) {
        Node<T> currentNode = first;
        Node<T> node = new Node<>(data, first, 0);
        first = node;
        size++;

        while(currentNode != null) {
            currentNode.setIndexOfNode(currentNode.getIndexOfNode() + 1);
            currentNode = currentNode.getNextNode();
        }
    }
    //**************************************************
    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        Node<T> node = first;
        while(node != null) {
            result.append(node.getValue()).append(" ");
            node = node.getNextNode();
        }
        return result.toString();
    }
}
