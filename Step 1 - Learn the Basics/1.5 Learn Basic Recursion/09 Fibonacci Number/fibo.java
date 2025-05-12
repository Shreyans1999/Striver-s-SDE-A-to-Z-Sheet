class Solution {
    public int fib(int n) {
        // Base cases for Fibonacci series
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive call for Fibonacci
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example: Get the 10th Fibonacci number
        int result = solution.fib(10);
        System.out.println("The 10th Fibonacci number is: " + result); // Output: 55
    }
}
