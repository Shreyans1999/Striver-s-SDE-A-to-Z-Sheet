/**
 * Set Collection Example
 * 
 * Key Characteristics:
 * 1. Unique Elements: Does not allow duplicates
 * 2. At most one null element
 * 3. No guaranteed order (for HashSet)
 * 
 * Common Implementations:
 * - HashSet: Uses HashMap internally, no ordering, O(1) operations
 * - TreeSet: Sorted set, maintains natural order, O(log n) operations
 * - LinkedHashSet: Maintains insertion order, slightly slower than HashSet
 * 
 * Best Used When:
 * - Need to ensure element uniqueness
 * - Don't need to maintain element order (for HashSet)
 * - Need to quickly check if an element exists
 * - Need to eliminate duplicates from a collection
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        // Example 1: HashSet
        System.out.println("=== HashSet Example ===");
        // Output: === HashSet Example ===
        
        Set<String> hashSet = new HashSet<>();
        
        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // Duplicate element, will not be added
        hashSet.add("Orange");
        
        // Checking set state
        System.out.println("Set size: " + hashSet.size());
        // Output: Set size: 3
        
        System.out.println("Is set empty? " + hashSet.isEmpty());
        // Output: Is set empty? false
        
        System.out.println("Contains 'Banana'? " + hashSet.contains("Banana"));
        // Output: Contains 'Banana'? true
        
        // Iterating through set
        System.out.println("\nIterating through HashSet:");
        // Output: Iterating through HashSet:
        
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Output: (order may vary)
        // Apple
        // Banana
        // Orange
        
        // Removing elements
        hashSet.remove("Banana");
        System.out.println("\nAfter removing 'Banana': " + hashSet);
        // Output: After removing 'Banana': [Apple, Orange]
        
        // Example 2: TreeSet (Sorted)
        System.out.println("\n=== TreeSet Example ===");
        // Output: === TreeSet Example ===
        
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Apple");
        treeSet.add("Banana");
        
        System.out.println("TreeSet (sorted): " + treeSet);
        // Output: TreeSet (sorted): [Apple, Banana, Zebra]
        
        // Example 3: LinkedHashSet (Maintains insertion order)
        System.out.println("\n=== LinkedHashSet Example ===");
        // Output: === LinkedHashSet Example ===
        
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        
        System.out.println("LinkedHashSet (maintains order): " + linkedHashSet);
        // Output: LinkedHashSet (maintains order): [First, Second, Third]
        
        // Set operations
        System.out.println("\n=== Set Operations ===");
        // Output: === Set Operations ===
        
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        
        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");
        
        // Union
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
        // Output: Union: [A, B, C, D]
        
        // Intersection
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        // Output: Intersection: [B, C]
        
        // Difference
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
        // Output: Difference: [A]
        
        // Clearing the set
        hashSet.clear();
        System.out.println("\nSet after clearing: " + hashSet);
        // Output: Set after clearing: []
    }
}

/**
 * Set Methods Summary Table:
 * 
 * | Category    | Method                    | Description                                    | Time Complexity | Throws Exception |
 * |-------------|---------------------------|------------------------------------------------|-----------------|------------------|
 * | Adding      | add(E e)                  | Adds element if not present                    | O(1) HashSet    | No               |
 * |             | addAll(Collection<?>)     | Adds all elements from collection              | O(n) HashSet    | Yes              |
 * | Removing    | remove(Object o)          | Removes specified element                      | O(1) HashSet    | No               |
 * |             | removeAll(Collection<?>)  | Removes all elements in collection             | O(n) HashSet    | Yes              |
 * |             | retainAll(Collection<?>)  | Keeps only elements in collection              | O(n) HashSet    | Yes              |
 * |             | clear()                   | Removes all elements                           | O(n)            | No               |
 * | Viewing     | contains(Object o)        | Checks if element exists                       | O(1) HashSet    | No               |
 * |             | containsAll(Collection<?>)| Checks if all elements exist                   | O(n) HashSet    | Yes              |
 * | Utility     | size()                    | Returns number of elements                     | O(1)            | No               |
 * |             | isEmpty()                 | Checks if set is empty                         | O(1)            | No               |
 * |             | toArray()                 | Converts set to array                          | O(n)            | No               |
 * 
 * Implementation-Specific Notes:
 * 
 * 1. HashSet
 *    - Fastest implementation (O(1) operations)
 *    - No ordering guarantee
 *    - Uses hashCode() and equals() for uniqueness
 *    - Best for general-purpose use
 * 
 * 2. TreeSet
 *    - Maintains natural ordering
 *    - Slower operations (O(log n))
 *    - Elements must be Comparable
 *    - Best for sorted data
 * 
 * 3. LinkedHashSet
 *    - Maintains insertion order
 *    - Slightly slower than HashSet
 *    - Uses more memory
 *    - Best when order matters
 * 
 * Common Use Cases:
 * 1. Duplicate Removal
 *    - Removing duplicates from collections
 *    - Unique value tracking
 *    - Distinct element counting
 * 
 * 2. Membership Testing
 *    - Quick lookups
 *    - Element existence checking
 *    - Unique identifier storage
 * 
 * 3. Set Operations
 *    - Union of collections
 *    - Intersection of collections
 *    - Difference between collections
 */
