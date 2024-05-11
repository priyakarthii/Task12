import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        System.out.println("Original ArrayList: " + stringList);

        // Remove all elements from the ArrayList
        stringList.clear();

        System.out.println("ArrayList after removing all elements: " + stringList);
    }
}

