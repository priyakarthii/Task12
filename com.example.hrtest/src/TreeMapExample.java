import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee IDs and names to the TreeMap
        employeeMap.put(101, "priya");
        employeeMap.put(102, "sai");
        employeeMap.put(103, "naresh");
        employeeMap.put(104, "karthik");

        // Print out the names of all employees in alphabetical order
        System.out.println("Names of employees in alphabetical order:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}