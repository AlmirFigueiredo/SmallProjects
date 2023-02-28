package ContactListProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContactList list = new ContactList();
        showMainOptions();
        int option = input.nextInt();
        boolean isValid = isValidOption(option, 6);
        while(!isValid) {
            option = input.nextInt();
            isValid = isValidOption(option, 6);
        }
        while(option != 6) {
            switch(option) {
                case 1: showContactList(list);
                        break; 

                case 2: System.out.println("Enter the name of the contact:");
                        String name = input.nextLine();
                        System.out.println("Enter the email of the contact:");
                        String email = input.nextLine();
                        System.out.println("Enter the address of the contact:");
                        String address = input.nextLine();
                        System.out.println("Enter the phone of the contact:");
                        String phone = input.nextLine();
                        Contact newContact = new Contact(name, email, address, phone);
                        list.addContact(newContact);

                default: System.out.println("ERROR");
            }
        }


        
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
    public static void showContactList(ContactList list) {
        int quantityOfContacts = list.getQuantityOfContacts();
        for(int i = 0; i < quantityOfContacts; i++) {
            String formatString = list.formatContactList()[i];
            System.out.printf("(%d) %s\n", i, formatString);
        }
    }
}