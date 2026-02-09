import java.util.Scanner;

public class AddNumbers {
    public static void addTwoNumbers(Scanner scanner ) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Result: " + sum);
    }
}
