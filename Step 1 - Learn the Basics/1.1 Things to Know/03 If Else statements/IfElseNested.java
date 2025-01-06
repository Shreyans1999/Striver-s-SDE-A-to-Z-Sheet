public class IfElseNested {
    public static void main(String[] args) {
        int num = 10;

        // Nested if statement
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Number is positive and even");
            } else {
                System.out.println("Number is positive and odd");
            }
        } else {
            System.out.println("Number is negative or zero");
        }
    }
}
