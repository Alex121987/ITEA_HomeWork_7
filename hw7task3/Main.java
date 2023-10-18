package hw7task3;

public class Main {
    public static void main(String[] args) throws ListIsEmptyException {
        ModernUnidirectionalLinkedList<String> linkedList  = new ModernUnidirectionalLinkedList<>();

        linkedList.insertHead("Alex");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.add("John");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.add("Luke");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.add(0,"Mat");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.add(3,"Louis");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.remove(0);
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.remove(linkedList.getSize() - 1);
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.add("Marla");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.remove(1);
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.remove("Alex");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        linkedList.add("Ann");
        System.out.print(linkedList + " ");
        System.out.println(linkedList.size());

        Node node = linkedList.getFirst();
        while(node != null) {
            System.out.print(node.getIndexOfNode() + " ");
            node = node.getNextNode();
        }
    }
}
