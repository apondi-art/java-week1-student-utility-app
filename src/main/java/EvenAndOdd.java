import java.util.Scanner;

public class EvenAndOdd {
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter a number to check if it's EVEN or ODD: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(number + " is " + result + ".");
    }
}