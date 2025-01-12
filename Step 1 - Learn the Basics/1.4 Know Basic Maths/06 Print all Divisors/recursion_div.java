// https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        if(n==1){
            return 1;
        }
        int ans =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans+=i;
            }
        }
        return ans+sumOfDivisors(n-1);
    }
}