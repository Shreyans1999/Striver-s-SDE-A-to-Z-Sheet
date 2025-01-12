
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentNames = new HashMap<>();
        studentNames.put(101, "John");
        studentNames.put(102, "Alice");
        studentNames.put(103, "Bob");

        // Accessing value by key
        System.out.println("Student with ID 102: " + studentNames.get(102));

        // Printing all key-value pairs
        System.out.println("Student records: " + studentNames);
    }
}
