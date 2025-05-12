public class factorial {

    public static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5)); // Output: 120
    }
}
