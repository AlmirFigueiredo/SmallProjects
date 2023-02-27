package ContactListProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showMainOptions();
        int option = input.nextInt();
        while(option != '1' )


        input.close();
    }
    public static void showMainOptions() {
        System.out.println("(1)Show contact list\n(2)Add an contact\n(3)Remove an contact\n(4)Change information(s) about some contact");
        System.out.println("(5)Remove all empty and duplicated contacts\n(6)Exit program");
    }
    public static boolean isValidOption(int option, int quantityOfOptions) {
        for(int i = 1; i < quantityOfOptions+1; i++) {
            if(option == i) {
                return true;
            }
        }
        return false;
    }
    
    
}