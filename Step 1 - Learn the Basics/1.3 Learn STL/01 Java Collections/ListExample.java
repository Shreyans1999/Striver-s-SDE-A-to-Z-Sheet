
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Printing all elements
        System.out.println("List of fruits: " + fruits);
    }
}
