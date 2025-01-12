# https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

def sum_of_divisors(n):
    """
    Function to calculate the sum of divisors of all numbers from 1 to n.

    Args:
        n (int): The number up to which the sum of divisors is calculated.

    Returns:
        int: The total sum of divisors for all numbers from 1 to n.
    """
    if n == 1:
        return 1

    # Calculate the sum of divisors for n
    sum_div = sum(i for i in range(1, n + 1) if n % i == 0)

    # Add it to the result of the recursive call for n-1
    return sum_div + sum_of_divisors(n - 1)

# Example usage
if __name__ == "__main__":
    num = int(input("Enter the number up to which the sum of divisors is calculated: "))
    print(f"The sum of divisors from 1 to {num} is: {sum_of_divisors(num)}")
