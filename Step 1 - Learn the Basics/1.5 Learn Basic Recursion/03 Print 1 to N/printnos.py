class Solution:
    
    def printNos(self, n):
        # Base condition
        if n == 0:
            return
        self.printNos(n - 1)
        print(n, end=" ")

# Example usage
solution = Solution()
solution.printNos(5)  # Prints: 1 2 3 4 5 
