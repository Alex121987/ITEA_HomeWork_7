package hw7task1;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.addElement("01");
        myList.addElement("02");
        myList.addElement("03");
        myList.addElement("04");
        myList.addElement("05");
        myList.addElement("06");
        myList.addElement("07");
        myList.addElement("08");
        myList.addElement("09");
        myList.addElement("10");
        myList.addElement("11");
        myList.addElement("12");

        System.out.println(myList.getSize());

        System.out.println(myList.getElementByIndex(0)); //

        System.out.println(myList);
    }
}
