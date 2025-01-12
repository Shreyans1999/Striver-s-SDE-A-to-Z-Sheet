# https://leetcode.com/problems/reverse-integer/description/

def reverse(self, x):
    neg = x < 0
    string = str(x)[::-1] if not neg else str(x)[:0:-1]
    result = int(string)
    if neg:
        result = -result
    if result < -2**31 or result > 2**31 - 1:
        return 0
    return result

# Test the function
x = 123  # Change input here for testing
print(f"Reversed: {reverse(x)}")
