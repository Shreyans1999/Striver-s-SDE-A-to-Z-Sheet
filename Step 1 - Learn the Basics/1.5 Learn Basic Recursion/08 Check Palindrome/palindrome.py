class Solution(object):
    def helper(self, s, start, end):
        bool_store = False
        if(start>=end):
            bool_store = True
            return bool_store
        if s[start] == s[end]:
            bool_store = self.helper(s , start+1, end-1)
        return bool_store

    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s=s.lower()
        s = list((i for i in s if i.isalnum()))
        s = "".join(s)
        boo = self.helper(s, 0, len(s)-1)
        return boo
        