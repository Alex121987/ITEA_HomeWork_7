package hw7task2;

public class Node <Type1, Type2> {
    private Type1 key;
    private Type2 value;

    public Node(Type1 key, Type2 value) {
        this.key = key;
        this.value = value;
    }

    public Type1 getKey() {
        return key;
    }

    public void setKey(Type1 key) {
        this.key = key;
    }

    public Type2 getValue() {
        return value;
    }

    public void setValue(Type2 value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + ", "+ value + "]";
    }
}
