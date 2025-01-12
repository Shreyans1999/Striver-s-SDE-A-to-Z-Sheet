# https://leetcode.com/problems/palindrome-number/

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        com = str(x)
        temp = str(x)[::-1]
        if com == temp:
            return True
        return False