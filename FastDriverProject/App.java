package FastDriverProject;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to fastDrivers! do you have an account?[y/n]");
        char accountOption = input.next().toLowerCase().trim().charAt(0);
        if(accountOption != 'y' && accountOption != 'n') {
            System.out.println("Invalid option!");
            System.exit(0);
        }


        input.close();
    }

    public static void showMainOptions() {
        System.out.println("(1)Ride \n(2)Exit");
    }
}
