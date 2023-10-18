package hw7task3;

public class ModernUnidirectionalLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    private int indexOfNode;

    public ModernUnidirectionalLinkedList() {
        first = null;
        last = null;
        size = 0;
        indexOfNode = 0;
    }
    //************************************************
    public int size() {
        return size;
    }
    public void add(final T element) {
        if (size == 0) {
            insertHead(element);
        } else {
            Node<T> node = new Node<>(element, null, size);
            last.setNextNode(node);
            last = node;
            size++;
        }
    }
    public void add(final int position, final T data) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("WRONG INDEX!");
        }

        if (position == 0) {
            insertHead(data);
        } else {
            Node<T> previousNode = first;
            Node<T> currentNode = first;

            while (currentNode.getIndexOfNode() != position) {
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
            }

            Node<T> newNode = new Node<>(data, currentNode, position);
            previousNode.setNextNode(newNode);

            while (currentNode != null) {
                currentNode.setIndexOfNode(currentNode.getIndexOfNode() + 1);
                currentNode = currentNode.getNextNode();
            }

            size++;
        }
    }
    public void remove(int position) throws ListIsEmptyException {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("WRONG INDEX!");
        }

        if (!listIsEmpty()) {
            if (position == 0) {
                removeFirstElement();
            } else if (position == size - 1) {
                removeLastElement();
            } else {
                Node<T> current = first.getNextNode();
                Node<T> previous = first;

                while(current.getIndexOfNode() != position) {
                    previous = current;
                    current = current.getNextNode();
                }

                previous.setNextNode(current.getNextNode());
                current.setNextNode(null);

                current = previous.getNextNode();
                while (current != null) {
                    current.setIndexOfNode(current.getIndexOfNode() - 1);
                    current = current.getNextNode();
                }

                size--;
            }
        } else {
            throw new ListIsEmptyException("List is empty!!!");
        }
    }

    public void remove(T data) throws ListIsEmptyException {
        Node<T> current = first;

        try {
            while (!current.getValue().toString().equals(data)) {
                current = current.getNextNode();
            }
        } catch (NullPointerException e) {
            System.out.println("No such element " + data + " in collection");
        }

        int position = current.getIndexOfNode();

        if (current == first) {
            removeFirstElement();
        } else if (current == last) {
            removeLastElement();
        } else {
            remove(position);
        }

    }
    public void insertHead(T data) {
        if (size == 0) {
            first = new Node<>(data, null, 0);
            last = first;
            size++;
        } else {
            Node<T> newNode = new Node<>(data, first, 0);
            first = newNode;
            Node<T> temp = first.getNextNode();
            while(temp != last.getNextNode()) {
                temp.setIndexOfNode(temp.getIndexOfNode() + 1);
                temp = temp.getNextNode();
            }
            size++;
        }
    }

    private void removeFirstElement() {
        first = first.getNextNode();
        Node<T> current = first;

        while (current != null) {
            current.setIndexOfNode(current.getIndexOfNode() - 1);
            current = current.getNextNode();
        }
        size--;
    }

    private void removeLastElement() {
        Node<T> current = first;

        while (current.getNextNode() != last) {
            current = current.getNextNode();
        }
        current.setNextNode(null);
        last = current;
        size--;
    }

    private boolean listIsEmpty() {
        return first == null && last == null;
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

    public int getIndexOfNode() {
        return indexOfNode;
    }

    public void setIndexOfNode(int indexOfNode) {
        this.indexOfNode = indexOfNode;
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
