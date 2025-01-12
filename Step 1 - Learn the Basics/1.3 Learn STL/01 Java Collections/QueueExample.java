
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Removing elements (FIFO order)
        System.out.println("Removed from queue: " + queue.poll());
        System.out.println("Remaining queue: " + queue);
    }
}
