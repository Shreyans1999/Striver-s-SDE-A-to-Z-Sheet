def is_armstrong(n):
    """
    Function to check if a number is an Armstrong number.

    Args:
        n (int): The number to check.

    Returns:
        bool: True if the number is an Armstrong number, False otherwise.
    """
    # Convert the number to a string to count digits
    digits = len(str(n))

    # Calculate the sum of digits raised to the power of the number of digits
    sum_of_powers = sum(int(digit) ** digits for digit in str(n))

    # Return True if the sum matches the original number, else False
    return n == sum_of_powers

# Example usage
if __name__ == "__main__":
    num = int(input("Enter a number to check if it's an Armstrong number: "))
    if is_armstrong(num):
        print(f"{num} is an Armstrong number.")
    else:
        print(f"{num} is not an Armstrong number.")
