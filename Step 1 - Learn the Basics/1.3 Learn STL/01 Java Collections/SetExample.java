
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple");  // Duplicate element, will not be added

        // Printing unique elements
        System.out.println("Unique fruits: " + uniqueFruits);
    }
}
