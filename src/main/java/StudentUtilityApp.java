import java.util.Scanner;

public class StudentUtilityApp {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int option = 0;
        do{
            Menu.showMenu();
            option = inputScanner.nextInt();
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

            }

        }while (option != 5);




    }
}
