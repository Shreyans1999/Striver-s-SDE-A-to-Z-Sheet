# https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

class Solution:
    
    def print_nto1(self, n):
        # Base condition
        if n == 0:
            return
        print(n, end=" ")
        self.print_nto1(n - 1)

# Example usage
solution = Solution()
solution.print_nto1(5)  # Prints: 1 2 3 4 5 
