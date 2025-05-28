/**
 * LinkedList Example
 * 
 * Key Characteristics:
 * 1. Doubly-linked list implementation
 * 2. Better for frequent insertions and deletions
 * 3. Can be used as a List, Queue, or Deque
 * 4. Non-synchronized (not thread-safe)
 * 5. Allows null elements
 * 
 * Performance:
 * - add/remove: O(1) when position is known
 * - random access: O(n)
 * - memory usage: higher (stores prev/next references)
 */

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Adding elements
        linkedList.add("First");
        linkedList.addFirst("Start");      // Adds at beginning
        linkedList.addLast("End");         // Adds at end
        linkedList.add(1, "Middle");       // Adds at specific position
        
        // Printing initial list
        System.out.println("Initial LinkedList: " + linkedList);
        // Output: Initial LinkedList: [Start, First, Middle, End]
        
        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("Element at index 2: " + linkedList.get(2));
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Is list empty? " + linkedList.isEmpty());
        
        // Checking elements
        System.out.println("Contains 'Middle'? " + linkedList.contains("Middle"));
        System.out.println("Index of 'Middle': " + linkedList.indexOf("Middle"));
        System.out.println("Last index of 'Middle': " + linkedList.lastIndexOf("Middle"));
        
        // Removing elements
        linkedList.removeFirst();          // Removes from beginning
        linkedList.removeLast();           // Removes from end
        linkedList.remove("Middle");       // Removes specific element
        linkedList.remove(0);              // Removes element at index
        
        // Using as a Queue
        linkedList.offer("New End");       // Adds to end (Queue operation)
        linkedList.poll();                 // Removes from beginning (Queue operation)
        linkedList.peek();                 // Retrieves but doesn't remove first element
        
        // Using as a Deque
        linkedList.offerFirst("New Start"); // Adds to beginning
        linkedList.offerLast("New End");    // Adds to end
        linkedList.peekFirst();             // Retrieves first element
        linkedList.peekLast();              // Retrieves last element
        
        // Iterating through the list
        System.out.println("\nIterating using for-each:");
        for (String element : linkedList) {
            System.out.println(element);
        }
        
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\nIterating using ListIterator (forward):");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        
        System.out.println("\nIterating using ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        
        // Converting to array
        String[] array = linkedList.toArray(new String[0]);
        
        // Clearing the list
        linkedList.clear();
        
        // Final state
        System.out.println("\nFinal state: " + linkedList);
    }
}

/**
 * LinkedList Methods Summary Table:
 * 
 * | Category    | Method                    | Description                                    | Time Complexity |
 * |-------------|---------------------------|------------------------------------------------|-----------------|
 * | Adding      | add(E e)                  | Adds element to end                            | O(1)            |
 * |             | addFirst(E e)             | Adds element to beginning                      | O(1)            |
 * |             | addLast(E e)              | Adds element to end                            | O(1)            |
 * |             | add(int index, E e)       | Adds element at specified position             | O(n)            |
 * |             | offer(E e)                | Adds element to end (Queue operation)          | O(1)            |
 * |             | offerFirst(E e)           | Adds element to beginning (Deque operation)    | O(1)            |
 * |             | offerLast(E e)            | Adds element to end (Deque operation)          | O(1)            |
 * | Removing    | remove()                  | Removes first element                          | O(1)            |
 * |             | removeFirst()             | Removes first element                          | O(1)            |
 * |             | removeLast()              | Removes last element                           | O(1)            |
 * |             | remove(int index)         | Removes element at specified position          | O(n)            |
 * |             | remove(Object o)          | Removes first occurrence of specified element  | O(n)            |
 * |             | poll()                    | Retrieves and removes first element            | O(1)            |
 * |             | pollFirst()               | Retrieves and removes first element            | O(1)            |
 * |             | pollLast()                | Retrieves and removes last element             | O(1)            |
 * | Accessing   | get(int index)            | Returns element at specified position          | O(n)            |
 * |             | getFirst()                | Returns first element                          | O(1)            |
 * |             | getLast()                 | Returns last element                           | O(1)            |
 * |             | peek()                    | Returns first element without removing         | O(1)            |
 * |             | peekFirst()               | Returns first element without removing         | O(1)            |
 * |             | peekLast()                | Returns last element without removing          | O(1)            |
 * | Searching   | indexOf(Object o)         | Returns index of first occurrence              | O(n)            |
 * |             | lastIndexOf(Object o)     | Returns index of last occurrence               | O(n)            |
 * |             | contains(Object o)        | Checks if element exists                       | O(n)            |
 * | Utility     | size()                    | Returns number of elements                     | O(1)            |
 * |             | isEmpty()                 | Checks if list is empty                        | O(1)            |
 * |             | clear()                   | Removes all elements                           | O(n)            |
 * |             | toArray()                 | Converts list to array                         | O(n)            |
 */ 