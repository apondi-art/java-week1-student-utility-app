import java.util.Scanner;

public class StudentUtilityApp {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner inputScanner = new Scanner(System.in);
        int option = 0;

        // Loop to keep showing the menu until the user chooses to exit
        do{
            Menu.showMenu();
            option = inputScanner.nextInt();

            // Handle user choice using switch statement
            switch(option){
                case 1:
                AddNumbers.addTwoNumbers(inputScanner);
                break;
                case 2:
                    EvenAndOdd.checkEvenOrOdd(inputScanner);
                    break;
                case 3:
                    PrintNumbers.printNumbersN(inputScanner);
                    break;
                case 4:
                    PrintDayOfWeek.printDayOfWeek(inputScanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the app");
                    break;
            }

        }while (option != 5);




    }
}
