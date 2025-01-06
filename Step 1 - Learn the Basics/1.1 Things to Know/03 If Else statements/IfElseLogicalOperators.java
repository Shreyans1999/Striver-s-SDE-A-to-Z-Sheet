public class IfElseLogicalOperators {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;

        // Using logical operators (AND, OR)
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("At least one number is positive");
        } else {
            System.out.println("Neither number is positive");
        }
    }
}
