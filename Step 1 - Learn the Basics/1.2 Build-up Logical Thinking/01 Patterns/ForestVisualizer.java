
import java.util.Scanner;

public class ForestVisualizer {
    public static void main(String[] args) {
        // Create scanner object to get input
        Scanner scanner = new Scanner(System.in);

        // Input N
        int N = scanner.nextInt();
        
        // Loop to generate forest pattern
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}
