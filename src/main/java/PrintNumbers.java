import java.util.Scanner;

public class PrintNumbers {
    public static void printNumbersN(Scanner scanner) {
        System.out.print("Enter a number (N) to print numbers from 1 to N: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive number.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line after printing numbers
    }
}