import java.util.Scanner;
public class EvenAndOdd {
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
