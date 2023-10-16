package hw7task2;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();

        myDictionary.put(1, "Alex");
        myDictionary.put(2, "Bob");
        myDictionary.put(3, "Mitch");
        System.out.println(myDictionary);

        System.out.println(myDictionary.getSize());

        myDictionary.put(4, "Sarah");
        System.out.println(myDictionary);

        System.out.println(myDictionary.getSize());

        System.out.println(myDictionary.getValueByKey(2));
    }
}
