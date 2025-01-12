
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Removing elements (LIFO order)
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Remaining stack: " + stack);
    }
}
