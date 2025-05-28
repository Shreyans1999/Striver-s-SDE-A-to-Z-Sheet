/**
 * Stack Collection Example
 * 
 * Key Characteristics:
 * 1. LIFO (Last-In-First-Out): Last element added is the first one to be removed
 * 2. Extends Vector class
 * 3. Thread-safe (synchronized methods)
 * 
 * Main Operations:
 * - push(): Add element to top
 * - pop(): Remove and return top element
 * - peek(): View top element without removing
 * - empty(): Check if stack is empty
 * 
 * Best Used When:
 * - Need LIFO behavior
 * - Need to track state or operations that can be undone
 * - Need to process nested structures (like parsing expressions)
 * - Need to implement backtracking
 */

import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // Adding elements
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        
        // Checking stack state
        System.out.println("Stack size: " + stack.size());
        // Output: Stack size: 3
        
        System.out.println("Is stack empty? " + stack.isEmpty());
        // Output: Is stack empty? false
        
        System.out.println("Contains 'Second'? " + stack.contains("Second"));
        // Output: Contains 'Second'? true
        
        // Viewing elements without removing
        System.out.println("Top element (peek): " + stack.peek());
        // Output: Top element (peek): Third
        
        // Finding element position
        System.out.println("Position of 'Second': " + stack.search("Second"));
        // Output: Position of 'Second': 2
        
        // Removing elements (LIFO order)
        System.out.println("Popped from stack: " + stack.pop());
        // Output: Popped from stack: Third
        
        System.out.println("Remaining stack: " + stack);
        // Output: Remaining stack: [First, Second]
        
        // Iterating through stack
        System.out.println("\nIterating through stack (top to bottom):");
        // Output: Iterating through stack (top to bottom):
        
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Output: First
        // Output: Second
        
        // Using ListIterator for more control
        System.out.println("\nUsing ListIterator (bottom to top):");
        // Output: Using ListIterator (bottom to top):
        
        ListIterator<String> listIterator = stack.listIterator(stack.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        // Output: Second
        // Output: First
        
        // Vector operations (inherited from Vector class)
        System.out.println("\nVector operations:");
        // Output: Vector operations:
        
        stack.set(0, "New First");  // Replace element at index
        System.out.println("After set(0): " + stack);
        // Output: After set(0): [New First, Second]
        
        stack.add(1, "Inserted");   // Insert at specific position
        System.out.println("After add(1): " + stack);
        // Output: After add(1): [New First, Inserted, Second]
        
        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
        // Output: Stack after clearing: []
    }
}

/**
 * Stack Methods Summary Table:
 * 
 * | Category    | Method                    | Description                                    | Time Complexity | Throws Exception |
 * |-------------|---------------------------|------------------------------------------------|-----------------|------------------|
 * | Adding      | push(E e)                 | Adds element to top of stack                   | O(1)            | No               |
 * |             | add(E e)                  | Adds element to end (Vector method)            | O(1)            | No               |
 * |             | add(int index, E e)       | Inserts element at position (Vector method)    | O(n)            | Yes              |
 * | Removing    | pop()                     | Removes and returns top element                | O(1)            | Yes              |
 * |             | remove(int index)         | Removes element at position (Vector method)    | O(n)            | Yes              |
 * |             | clear()                   | Removes all elements                           | O(n)            | No               |
 * | Viewing     | peek()                    | Returns top element without removing           | O(1)            | Yes              |
 * |             | get(int index)            | Returns element at position (Vector method)    | O(1)            | Yes              |
 * | Searching   | search(Object o)          | Returns 1-based position from top              | O(n)            | No               |
 * |             | contains(Object o)        | Checks if element exists                       | O(n)            | No               |
 * | Utility     | size()                    | Returns number of elements                     | O(1)            | No               |
 * |             | isEmpty()                 | Checks if stack is empty                       | O(1)            | No               |
 * |             | set(int index, E e)       | Replaces element at position (Vector method)   | O(1)            | Yes              |
 * 
 * Important Notes:
 * 1. Stack extends Vector, so it inherits all Vector methods
 * 2. All methods are synchronized (thread-safe)
 * 3. search() returns 1-based position from top (1 is the top element)
 * 4. Vector methods (add, remove, set) can break LIFO principle
 * 5. For strict LIFO behavior, stick to push(), pop(), and peek()
 * 
 * Common Use Cases:
 * 1. Expression Evaluation
 *    - Postfix notation evaluation
 *    - Parenthesis matching
 *    - Operator precedence parsing
 * 
 * 2. Backtracking Algorithms
 *    - Depth-first search
 *    - Maze solving
 *    - Game state management
 * 
 * 3. Undo Operations
 *    - Text editor undo/redo
 *    - Browser history
 *    - Command pattern implementation
 */
