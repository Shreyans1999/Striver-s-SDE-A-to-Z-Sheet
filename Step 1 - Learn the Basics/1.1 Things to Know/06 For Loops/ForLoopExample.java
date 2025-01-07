// For loops in Java
public class ForLoopExample {
    public static void main(String[] args) {
        // Simple for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Enhanced for loop (for-each loop)
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Array Element: " + num);
        }
    }
}
