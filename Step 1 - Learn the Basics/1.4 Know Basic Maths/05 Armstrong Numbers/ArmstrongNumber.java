import java.lang.Math;

public class ArmstrongNumber {

    // Function to check if the number is Armstrong or not
    public static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0;
        double sum = 0;

        // Assigning n into a temp variable
        temp = n;

        // Count the number of digits in the number
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Reset temp to the original number
        temp = n;

        // Calculate the sum of digits raised to the power of the number of digits
        while (temp > 0) {
            last = temp % 10; // Extract the last digit
            sum += Math.pow(last, digits); // Add the digit raised to the power of digits
            temp = temp / 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        return n == sum;
    }
}
