/**
 * List Collection Example
 * 
 * Key Characteristics:
 * 1. Ordered Collection: Maintains insertion order of elements
 * 2. Index-based: Elements can be accessed using index (0-based)
 * 3. Allows Duplicates: Same element can be stored multiple times
 * 4. Dynamic Size: Can grow or shrink in size
 * 
 * Common Implementations:
 * - ArrayList: Backed by dynamic array, better for random access
 * - LinkedList: Backed by doubly-linked list, better for insertions/deletions
 * 
 * Best Used When:
 * - Need to maintain insertion order
 * - Need index-based access to elements
 * - Need to allow duplicate elements
 * - Size of collection may change
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {
        // String List Example
        System.out.println("=== String List Example ===");
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Mango");
        
        System.out.println("String List: " + stringList);
        // Output: String List: [Apple, Banana, Orange, Mango]

        // Integer List Example
        System.out.println("\n=== Integer List Example ===");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        
        System.out.println("Integer List: " + integerList);
        // Output: Integer List: [10, 20, 30, 40]

        // Double List Example
        System.out.println("\n=== Double List Example ===");
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        System.out.println("Double List: " + doubleList);
        // Output: Double List: [1.1, 2.2, 3.3, 4.4]

        // List Operations
        System.out.println("\n=== List Operations ===");
        
        // 1. Adding elements
        stringList.add(1, "Grape");  // Add at specific index
        System.out.println("After adding Grape at index 1: " + stringList);
        // Output: After adding Grape at index 1: [Apple, Grape, Banana, Orange, Mango]

        // 2. Removing elements
        stringList.remove("Banana");  // Remove by object
        stringList.remove(0);         // Remove by index
        System.out.println("After removing Banana and first element: " + stringList);
        // Output: After removing Banana and first element: [Grape, Orange, Mango]

        // 3. Checking elements
        System.out.println("Contains Orange? " + stringList.contains("Orange"));
        System.out.println("Index of Mango: " + stringList.indexOf("Mango"));
        // Output: Contains Orange? true
        // Output: Index of Mango: 2

        // 4. Iterating using different methods
        System.out.println("\n=== Different Ways to Iterate ===");
        
        // Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (Integer num : integerList) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Output: 10 20 30 40

        // Using iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // Output: 10 20 30 40

        // Using forEach method (Java 8+)
        System.out.println("\nUsing forEach method:");
        integerList.forEach(num -> System.out.print(num + " "));
        System.out.println();
        // Output: 10 20 30 40

        // 5. Sorting
        System.out.println("\n=== Sorting Examples ===");
        Collections.sort(stringList);  // Natural ordering
        System.out.println("Sorted String List: " + stringList);
        // Output: Sorted String List: [Grape, Mango, Orange]

        Collections.sort(integerList, Collections.reverseOrder());  // Reverse ordering
        System.out.println("Reverse Sorted Integer List: " + integerList);
        // Output: Reverse Sorted Integer List: [40, 30, 20, 10]

        // 6. Sublist
        List<Integer> subList = integerList.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);
        // Output: Sublist from index 1 to 3: [30, 20]

        // 7. Bulk Operations
        System.out.println("\n=== Bulk Operations ===");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        
        // Union
        List<Integer> union = new ArrayList<>(list1);
        union.addAll(list2);
        System.out.println("Union: " + union);
        // Output: Union: [1, 2, 3, 4, 3, 4, 5, 6]

        // Intersection
        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection: " + intersection);
        // Output: Intersection: [3, 4]

        // Difference
        List<Integer> difference = new ArrayList<>(list1);
        difference.removeAll(list2);
        System.out.println("Difference: " + difference);
        // Output: Difference: [1, 2]

        // 8. Converting array to List and vice versa
        System.out.println("\n=== Array Conversions ===");
        String[] array = {"One", "Two", "Three"};
        List<String> arrayToList = Arrays.asList(array);
        System.out.println("Array to List: " + arrayToList);
        
        String[] listToArray = stringList.toArray(new String[0]);
        System.out.println("List to Array: " + Arrays.toString(listToArray));
        // Output: Array to List: [One, Two, Three]
        // Output: List to Array: [Grape, Mango, Orange]
    }

    /*
     * =====================================================
     * Commonly Used List Methods Reference
     * =====================================================
     * 
     * Essential Operations (Used Very Frequently):
     * -----------------------------------------
     * Method                  | Description                           | Example
     * add(element)           | Adds element to end                   | list.add("Apple")
     * add(index, element)    | Adds element at index                 | list.add(0, "Banana")
     * get(index)            | Returns element at index              | list.get(0)
     * remove(index)         | Removes element at index              | list.remove(0)
     * remove(object)        | Removes first occurrence              | list.remove("Apple")
     * size()               | Returns number of elements            | list.size()
     * clear()              | Removes all elements                  | list.clear()
     * isEmpty()            | Checks if list is empty              | list.isEmpty()
     * 
     * Search Operations (Used Often):
     * ----------------------------
     * Method                  | Description                           | Example
     * contains(object)       | Checks if element exists             | list.contains("Apple")
     * indexOf(object)        | Returns first index of element       | list.indexOf("Apple")
     * 
     * Iteration Methods (Used Often):
     * ----------------------------
     * 1. Enhanced for loop:  for (String item : list) { }
     * 2. Iterator:           Iterator<String> iter = list.iterator();
     * 3. forEach:           list.forEach(item -> System.out.println(item));
     * 
     * Common List Operations (Used Regularly):
     * ------------------------------------
     * Method                  | Description                           | Example
     * addAll(collection)     | Adds all elements from collection     | list1.addAll(list2)
     * Collections.sort(list) | Sorts list in natural order          | Collections.sort(list)
     * toArray()             | Converts list to array                | list.toArray()
     * subList(from, to)     | Gets portion of list                  | list.subList(1, 3)
     * 
     * ArrayList vs LinkedList (When to Use):
     * ----------------------------------
     * ArrayList (Most Common Choice):
     * - Use when you need frequent random access
     * - Use when adding/removing mostly at the end
     * - Use when you don't need many insertions/deletions in the middle
     * 
     * LinkedList:
     * - Use when you need frequent insertions/deletions at beginning/middle
     * - Use when implementing a Queue or Deque
     * 
     * Common Practices:
     * --------------
     * 1. Declaration: List<Type> list = new ArrayList<>();
     * 2. Initialization with elements: 
     *    List<Type> list = Arrays.asList(element1, element2, ...);
     *    List<Type> list = new ArrayList<>(Arrays.asList(element1, element2, ...));
     * 3. Safe iteration when removing elements:
     *    Iterator<Type> iter = list.iterator();
     *    while(iter.hasNext()) {
     *        if(condition) iter.remove();
     *    }
     */
}
