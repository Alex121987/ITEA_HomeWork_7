package hw7task2;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();

        myDictionary.put(1, "Alex");
        myDictionary.put(2, "Bob");
        myDictionary.put(3, "Mitch");
        myDictionary.put(4, "Sam");
        myDictionary.put(5, "Luke");
        myDictionary.put(6, "Marcus");
        myDictionary.put(7, "Mat");
        myDictionary.put(8, "Brad");
        myDictionary.put(9, "Pearce");
        myDictionary.put(10, "Robby");
        myDictionary.put(11, "Ien");
        myDictionary.put(12, "Ken");
        myDictionary.put(13, "Frank");
        myDictionary.put(14, "Freddy");
        myDictionary.put(15, "Antonio");
        System.out.println(myDictionary);

        System.out.println(myDictionary.getSize());

        myDictionary.put(4, "Sarah");
        System.out.println(myDictionary);

        System.out.println(myDictionary.getSize());

        System.out.println(myDictionary.getValueByKey(2));
    }
}
