package hw7task3;

public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<String> linkedList  = new ModernUnidirectionalLinkedList<>();

        linkedList.add("Alex");
        linkedList.add("Bob");
        linkedList.add("Max");

        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}
