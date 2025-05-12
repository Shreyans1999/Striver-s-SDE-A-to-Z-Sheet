def factorial(n):
    # Base case
    if n == 0:
        return 1
    # Recursive case
    return n * factorial(n - 1)

# Main function
if __name__ == "__main__":
    print("Factorial of 5:", factorial(5))  # Output: 120
