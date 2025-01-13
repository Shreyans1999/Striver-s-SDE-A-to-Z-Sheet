# https://www.geeksforgeeks.org/problems/print-gfg-n-times/1

class Solution:
    def printName(self, name, n):
        # Base case to terminate recursion
        if n == 0:
            return
        print(name)
        self.printName(name, n - 1)

# Example usage
solution = Solution()
solution.printName("Shreyans", 5)

