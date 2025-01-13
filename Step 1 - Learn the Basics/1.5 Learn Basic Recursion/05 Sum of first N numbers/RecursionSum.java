// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

class RecursionSum {

    // Recursive function to calculate sum of series 1^3 + 2^3 + ... + n^3
    public static int sumOfSeries(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return (n * n * n) + sumOfSeries(n - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example usage
        System.out.println("Sum of series for n=5: " + RecursionSum.sumOfSeries(5)); // Output: 225
        System.out.println("Sum of series for n=7: " + RecursionSum.sumOfSeries(7)); // Output: 784
    }
}
