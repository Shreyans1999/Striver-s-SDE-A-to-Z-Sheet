// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

// User function Template for Java

class Solution {

    public void printNos(int n) {
        // Your code here
        if(n==0)
            return;
        printNos(n-1);
        System.out.print(n+" ");
    }
}
