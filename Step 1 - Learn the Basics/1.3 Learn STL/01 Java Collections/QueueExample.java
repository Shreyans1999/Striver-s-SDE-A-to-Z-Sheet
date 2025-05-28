/**
 * Queue Collection Example
 * 
 * Key Characteristics:
 * 1. FIFO (First-In-First-Out): First element added is the first one to be removed
 * 2. Interface implemented by various classes
 * 3. Supports both linear queues and priority queues
 * 
 * Main Operations:
 * - add()/offer(): Add element to end
 * - remove()/poll(): Remove and return first element
 * - element()/peek(): View first element without removing
 * 
 * Common Implementations:
 * - LinkedList: Standard FIFO queue
 * - PriorityQueue: Elements processed by priority
 * - ArrayDeque: Double-ended queue, more efficient than LinkedList
 * 
 * Best Used When:
 * - Need FIFO behavior
 * - Need to process elements in order of arrival
 * - Need to implement breadth-first algorithms
 * - Need to buffer or cache data
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Iterator;

public class QueueExample {
    public static void main(String[] args) {
        // Example 1: Using LinkedList as Queue
        System.out.println("=== LinkedList Queue Example ===");
        // Output: === LinkedList Queue Example ===
        
        Queue<String> linkedListQueue = new LinkedList<>();
        
        // Adding elements
        linkedListQueue.add("First");
        linkedListQueue.offer("Second");    // Same as add() but returns false if capacity full
        linkedListQueue.add("Third");
        
        // Checking queue state
        System.out.println("Queue size: " + linkedListQueue.size());
        // Output: Queue size: 3
        
        System.out.println("Is queue empty? " + linkedListQueue.isEmpty());
        // Output: Is queue empty? false
        
        System.out.println("Contains 'Second'? " + linkedListQueue.contains("Second"));
        // Output: Contains 'Second'? true
        
        // Viewing elements without removing
        System.out.println("First element (peek): " + linkedListQueue.peek());
        // Output: First element (peek): First
        
        System.out.println("First element (element): " + linkedListQueue.element());
        // Output: First element (element): First
        
        // Removing elements (FIFO order)
        System.out.println("Removed from queue (poll): " + linkedListQueue.poll());
        // Output: Removed from queue (poll): First
        
        System.out.println("Removed from queue (remove): " + linkedListQueue.remove());
        // Output: Removed from queue (remove): Second
        
        // Iterating through queue
        System.out.println("\nIterating through queue:");
        // Output: Iterating through queue:
        
        Iterator<String> iterator = linkedListQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Output: Third
        
        // Example 2: Using PriorityQueue
        System.out.println("\n=== PriorityQueue Example ===");
        // Output: === PriorityQueue Example ===
        
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        
        // Adding elements (will be automatically sorted)
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        
        System.out.println("PriorityQueue elements (sorted):");
        // Output: PriorityQueue elements (sorted):
        
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        // Output: 1
        // Output: 2
        // Output: 5
        // Output: 8
        
        // Example 3: Using ArrayDeque as Queue
        System.out.println("\n=== ArrayDeque Queue Example ===");
        // Output: === ArrayDeque Queue Example ===
        
        Queue<String> arrayDequeQueue = new ArrayDeque<>();
        
        // Adding elements
        arrayDequeQueue.offer("First");
        arrayDequeQueue.offer("Second");
        arrayDequeQueue.offer("Third");
        
        // Removing elements
        System.out.println("Removed from ArrayDeque: " + arrayDequeQueue.poll());
        // Output: Removed from ArrayDeque: First
        
        System.out.println("Remaining ArrayDeque: " + arrayDequeQueue);
        // Output: Remaining ArrayDeque: [Second, Third]
        
        // Clearing the queue
        arrayDequeQueue.clear();
        System.out.println("Queue after clearing: " + arrayDequeQueue);
        // Output: Queue after clearing: []
    }
}

/**
 * Queue Methods Summary Table:
 * 
 * | Category    | Method                    | Description                                    | Time Complexity | Throws Exception | Returns null/false |
 * |-------------|---------------------------|------------------------------------------------|-----------------|-------------------|-------------------|
 * | Adding      | add(E e)                  | Adds element to queue                          | O(1)            | Yes               | No                |
 * |             | offer(E e)                | Adds element to queue                          | O(1)            | No                | Yes               |
 * | Removing    | remove()                  | Removes and returns first element              | O(1)            | Yes               | No                |
 * |             | poll()                    | Removes and returns first element              | O(1)            | No                | Yes               |
 * | Viewing     | element()                 | Returns first element without removing         | O(1)            | Yes               | No                |
 * |             | peek()                    | Returns first element without removing         | O(1)            | No                | Yes               |
 * | Utility     | size()                    | Returns number of elements                     | O(1)            | No                | No                |
 * |             | isEmpty()                 | Checks if queue is empty                       | O(1)            | No                | No                |
 * |             | contains(Object o)        | Checks if element exists                       | O(n)            | No                | No                |
 * |             | clear()                   | Removes all elements                           | O(n)            | No                | No                |
 * 
 * Common Queue Implementations:
 * 
 * 1. LinkedList
 *    - Pros: Flexible, implements both List and Queue
 *    - Cons: Higher memory overhead
 *    - Best for: General purpose queue operations
 * 
 * 2. PriorityQueue
 *    - Pros: Automatic sorting, efficient priority-based operations
 *    - Cons: Not strictly FIFO, higher memory usage
 *    - Best for: Priority-based processing
 * 
 * 3. ArrayDeque
 *    - Pros: More efficient than LinkedList, better memory usage
 *    - Cons: Fixed capacity, no null elements
 *    - Best for: High-performance queue operations
 */
