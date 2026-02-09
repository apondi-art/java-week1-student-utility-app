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
                case 2:
                    EvenAndOdd.checkEvenOrOdd(inputScanner);
                case 3:
                    PrintNumbers.printNumbersN(inputScanner);
                case 4:
                    PrintDayOfWeek.printDayOfWeek(inputScanner);

            }

        }while (option != 5);




    }
}
