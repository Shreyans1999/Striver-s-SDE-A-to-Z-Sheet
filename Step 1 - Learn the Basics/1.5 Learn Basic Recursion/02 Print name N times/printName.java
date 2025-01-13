// https://www.geeksforgeeks.org/problems/print-gfg-n-times/1

class Solution {

    public void printName(String name, int n) {
        // Base case to stop recursion
        if (n == 0)
            return;
        System.out.println(name);
        printName(name, n - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printName("Shreyans", 5);
    }
}
