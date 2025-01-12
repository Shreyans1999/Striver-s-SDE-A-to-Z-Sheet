class Solution:
    @staticmethod
    def gcd(a: int, b: int) -> int:
        # Method to calculate GCD using the Euclidean Algorithm
        while b != 0:
            a, b = b, a % b
        return a

    @staticmethod
    def lcm(a: int, b: int) -> int:
        # Method to calculate LCM using the formula
        # LCM(a, b) = |a * b| / GCD(a, b)
        return (a * b) // Solution.gcd(a, b)

    @staticmethod
    def lcm_and_gcd(a: int, b: int) -> list:
        # Calculate GCD using Euclidean algorithm
        gcd_value = Solution.gcd(a, b)

        # Calculate LCM
        lcm_value = Solution.lcm(a, b)

        # Return results as a list [LCM, GCD]
        return [lcm_value, gcd_value]


# Example usage
solution = Solution()
a, b = 12, 15
result = solution.lcm_and_gcd(a, b)
print(f"LCM: {result[0]}, GCD: {result[1]}")
