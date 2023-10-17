package hw7task3;

public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<String> linkedList  = new ModernUnidirectionalLinkedList<>();

        // add by index
        linkedList.add(0,"Alex");
        //linkedList.remove(0);

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        //simple add
        linkedList.add("Alex");
        linkedList.add("Bob");
        linkedList.add("Max");
        linkedList.add("Lora");

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        // add by index
        linkedList.add(1, "Mary");

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        // add by index
        linkedList.add(1, "Sarah");
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        // remove by index
        linkedList.remove(1);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}
