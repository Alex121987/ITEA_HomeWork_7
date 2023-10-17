package hw7task3;

public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<String> linkedList  = new ModernUnidirectionalLinkedList<>();

        linkedList.add(1,"Alex");
        linkedList.add("Alex");
        linkedList.add("Bob");
        linkedList.add("Max");
        linkedList.add("Lora");

        System.out.println(linkedList.size());
        System.out.println(linkedList);

        linkedList.add(1, "Mary");

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.add(1, "Sarah");
        System.out.println(linkedList);
        System.out.println(linkedList.size());

    }
}
