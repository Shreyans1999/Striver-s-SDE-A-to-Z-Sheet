// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        long ans = 0;
        long com = x;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans == com ? true: false;
    }
}
