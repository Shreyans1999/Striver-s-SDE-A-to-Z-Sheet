// https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

// User function Template for Java

class Solution {

    public void print_nto1(int n) {
        // Your code here
        if(n==0)
            return;
        System.out.print(n+" ");
        print_nto1(n-1);
        
    }
}
