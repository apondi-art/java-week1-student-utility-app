import java.util.Scanner;

public class StudentUtilityApp {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int option = 0;
        do{
            Menu.showMenu();
            option = inputScanner.nextInt();

        }while (option != 5);




    }
}
