/**
 * Iterator Interface Example
 * 
 * Key Characteristics:
 * 1. Universal way to access elements in a collection
 * 2. Provides sequential access to elements
 * 3. Supports element removal during iteration
 * 
 * Main Operations:
 * - hasNext(): Check if more elements exist
 * - next(): Get next element
 * - remove(): Remove last element returned by next()
 * 
 * Advantages:
 * - Consistent way to traverse different collections
 * - Safe way to modify collection during iteration
 * - Doesn't expose internal structure of collection
 * 
 * Best Used When:
 * - Need to traverse collection elements sequentially
 * - Need to remove elements during traversal
 * - Need collection-independent traversal code
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Using Iterator to loop through the list
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /* Output:
         * Apple
         * Banana
         * Mango
         */
    }
}
