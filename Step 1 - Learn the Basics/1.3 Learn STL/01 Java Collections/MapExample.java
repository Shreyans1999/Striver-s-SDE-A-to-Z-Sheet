/**
 * Map Collection Example
 * 
 * Key Characteristics:
 * 1. Key-Value Pairs: Each element consists of a key and its associated value
 * 2. Unique Keys: Each key can appear only once
 * 3. Multiple null values allowed, but only one null key
 * 4. No guaranteed order (for HashMap)
 * 
 * Common Implementations:
 * - HashMap: No ordering, O(1) operations
 * - TreeMap: Sorted by keys, O(log n) operations
 * - LinkedHashMap: Maintains insertion order
 * 
 * Best Used When:
 * - Need to associate values with unique keys
 * - Need fast lookups by key
 * - Need to create dictionaries or lookup tables
 * - Need to count occurrences (using values as counters)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        // Example 1: HashMap
        System.out.println("=== HashMap Example ===");
        // Output: === HashMap Example ===
        
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Adding elements
        hashMap.put(101, "John");
        hashMap.put(102, "Alice");
        hashMap.put(103, "Bob");
        hashMap.put(104, "Alice");  // Duplicate values are allowed
        
        // Checking map state
        System.out.println("Map size: " + hashMap.size());
        // Output: Map size: 4
        
        System.out.println("Is map empty? " + hashMap.isEmpty());
        // Output: Is map empty? false
        
        // Accessing elements
        System.out.println("Value for key 102: " + hashMap.get(102));
        // Output: Value for key 102: Alice
        
        System.out.println("Contains key 101? " + hashMap.containsKey(101));
        // Output: Contains key 101? true
        
        System.out.println("Contains value 'Bob'? " + hashMap.containsValue("Bob"));
        // Output: Contains value 'Bob'? true
        
        // Getting all keys and values
        Set<Integer> keys = hashMap.keySet();
        System.out.println("All keys: " + keys);
        // Output: All keys: [101, 102, 103, 104]
        
        Collection<String> values = hashMap.values();
        System.out.println("All values: " + values);
        // Output: All values: [John, Alice, Bob, Alice]
        
        // Iterating through entries
        System.out.println("\nIterating through entries:");
        // Output: Iterating through entries:
        
        for (Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Output: (order may vary)
        // Key: 101, Value: John
        // Key: 102, Value: Alice
        // Key: 103, Value: Bob
        // Key: 104, Value: Alice
        
        // Updating values
        hashMap.put(101, "Johnny");  // Updates existing key
        System.out.println("\nAfter updating key 101: " + hashMap.get(101));
        // Output: After updating key 101: Johnny
        
        // Removing elements
        hashMap.remove(103);
        System.out.println("After removing key 103: " + hashMap);
        // Output: After removing key 103: {101=Johnny, 102=Alice, 104=Alice}
        
        // Example 2: TreeMap (Sorted by keys)
        System.out.println("\n=== TreeMap Example ===");
        // Output: === TreeMap Example ===
        
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1);
        treeMap.put("Apple", 2);
        treeMap.put("Banana", 3);
        
        System.out.println("TreeMap (sorted by keys): " + treeMap);
        // Output: TreeMap (sorted by keys): {Apple=2, Banana=3, Zebra=1}
        
        // Example 3: LinkedHashMap (Maintains insertion order)
        System.out.println("\n=== LinkedHashMap Example ===");
        // Output: === LinkedHashMap Example ===
        
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("First", 1);
        linkedHashMap.put("Second", 2);
        linkedHashMap.put("Third", 3);
        
        System.out.println("LinkedHashMap (maintains order): " + linkedHashMap);
        // Output: LinkedHashMap (maintains order): {First=1, Second=2, Third=3}
        
        // Map operations
        System.out.println("\n=== Map Operations ===");
        // Output: === Map Operations ===
        
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        
        // Merging maps
        map1.putAll(map2);
        System.out.println("After merging: " + map1);
        // Output: After merging: {A=1, B=3, C=4}
        
        // Clearing the map
        hashMap.clear();
        System.out.println("\nMap after clearing: " + hashMap);
        // Output: Map after clearing: {}
    }
}

/**
 * Map Methods Summary Table:
 * 
 * | Category    | Method                    | Description                                    | Time Complexity | Throws Exception |
 * |-------------|---------------------------|------------------------------------------------|-----------------|------------------|
 * | Adding      | put(K key, V value)       | Adds key-value pair                            | O(1) HashMap    | No               |
 * |             | putAll(Map<?,?>)         | Adds all mappings from map                     | O(n) HashMap    | Yes              |
 * | Removing    | remove(Object key)        | Removes mapping for key                        | O(1) HashMap    | No               |
 * |             | clear()                   | Removes all mappings                           | O(n)            | No               |
 * | Viewing     | get(Object key)           | Returns value for key                          | O(1) HashMap    | No               |
 * |             | getOrDefault(K, V)        | Returns value or default if key absent         | O(1) HashMap    | No               |
 * | Checking    | containsKey(Object)       | Checks if key exists                           | O(1) HashMap    | No               |
 * |             | containsValue(Object)     | Checks if value exists                         | O(n) HashMap    | No               |
 * | Utility     | size()                    | Returns number of mappings                     | O(1)            | No               |
 * |             | isEmpty()                 | Checks if map is empty                         | O(1)            | No               |
 * |             | keySet()                  | Returns set of keys                            | O(1)            | No               |
 * |             | values()                  | Returns collection of values                   | O(1)            | No               |
 * |             | entrySet()                | Returns set of key-value pairs                 | O(1)            | No               |
 * 
 * Implementation-Specific Notes:
 * 
 * 1. HashMap
 *    - Fastest implementation (O(1) operations)
 *    - No ordering guarantee
 *    - Uses hashCode() and equals() for keys
 *    - Best for general-purpose use
 * 
 * 2. TreeMap
 *    - Maintains natural ordering of keys
 *    - Slower operations (O(log n))
 *    - Keys must be Comparable
 *    - Best for sorted data
 * 
 * 3. LinkedHashMap
 *    - Maintains insertion order
 *    - Slightly slower than HashMap
 *    - Uses more memory
 *    - Best when order matters
 * 
 * Common Use Cases:
 * 1. Dictionaries and Lookup Tables
 *    - Word definitions
 *    - Configuration settings
 *    - User profiles
 * 
 * 2. Counting and Frequency
 *    - Word frequency counting
 *    - Character counting
 *    - Event tracking
 * 
 * 3. Caching
 *    - Result caching
 *    - Object pooling
 *    - Resource management
 */
