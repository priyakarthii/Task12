import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Convert List to Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (String item : stringArray) {
            System.out.println(item);
        }
    }
}