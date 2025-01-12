// https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

class Solution 
{
    // Method to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using the formula
    public static int lcm(int a, int b)
    {
        // LCM(a, b) = |a * b| / GCD(a, b)
        return (a * b) / gcd(a, b);
    }

    // Method to calculate both LCM and GCD and return them as an array
    public static int[] lcmAndGcd(int a, int b)
    {
        int[] result = new int[2]; // Array to store LCM and GCD

        // Calculate GCD using Euclidean algorithm
        int gcdValue = gcd(a, b);

        // Calculate LCM
        int lcmValue = lcm(a, b);

        // Store results in the array
        result[0] = lcmValue;  // LCM
        result[1] = gcdValue;  // GCD

        return result;  // Return the result array
    }
}