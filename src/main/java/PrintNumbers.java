import java.util.Scanner;
public class PrintNumbers {
    public static void printNumbersN(Scanner scanner) {
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}
