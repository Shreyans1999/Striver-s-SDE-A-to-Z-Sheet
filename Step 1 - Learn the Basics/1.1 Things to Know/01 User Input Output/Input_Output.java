import java.util.Scanner;

public class UserIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Displaying user output
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
