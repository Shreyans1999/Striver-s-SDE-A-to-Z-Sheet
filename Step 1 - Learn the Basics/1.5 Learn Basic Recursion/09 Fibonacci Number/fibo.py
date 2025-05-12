class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        # Base cases for Fibonacci series
        if n == 0:
            return 0
        if n == 1:
            return 1

        # Recursive call for Fibonacci
        return self.fib(n - 1) + self.fib(n - 2)