/**
 * Vector Example
 * 
 * Key Characteristics:
 * 1. Dynamic array implementation (like ArrayList)
 * 2. Synchronized methods (thread-safe)
 * 3. Legacy class, but still useful in thread-safe scenarios
 * 4. Grows by doubling size (whereas ArrayList grows by 50%)
 * 5. Allows null elements
 * 
 * Performance:
 * - add/remove at end: O(1) amortized
 * - add/remove at middle: O(n)
 * - random access: O(1)
 * - memory usage: moderate (contiguous memory)
 */

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        
        // Adding elements
        vector.add("First");
        vector.add("Second");
        vector.add("Third");
        
        // Adding element at specific index
        vector.add(1, "Inserted");
        
        // Printing initial vector
        System.out.println("Initial Vector: " + vector);
        // Output: Initial Vector: [First, Inserted, Second, Third]
        
        // Vector specific methods
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        // Output: Size: 4
        // Output: Capacity: 10 (default initial capacity)
        
        // Using Enumeration (legacy way to iterate)
        System.out.println("\nUsing Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        /* Output: Using Enumeration:
         * First
         * Inserted
         * Second
         * Third
         */
        
        // Thread-safe operations
        vector.setElementAt("Modified", 1);
        System.out.println("\nAfter modification: " + vector);
        // Output: After modification: [First, Modified, Second, Third]
        
        // Removing elements
        vector.removeElementAt(1);
        vector.remove("Third");
        
        // Final state
        System.out.println("Final state: " + vector);
        // Output: Final state: [First, Second]
    }
} 