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

                case 2: input.nextLine();
                        System.out.println("Enter the name of the contact:");
                        String name = input.nextLine();
                        System.out.println("Enter the email of the contact:");
                        String email = input.nextLine();
                        System.out.println("Enter the address of the contact:");
                        String address = input.nextLine();
                        System.out.println("Enter the phone of the contact:");
                        String phone = input.nextLine();
                        Contact newContact = new Contact(name, email, address, phone);
                        list.addContact(newContact);
                        break;
                case 3: showContactList(list);
                        System.out.println("Enter the number that represents the contact that you want to remove:");
                        input.nextLine();
                        int positionToRemove = input.nextInt();
                        positionToRemove--;
                        list.removeContactIndex(positionToRemove);
                        break;
                case 4: showContactList(list);
                        System.out.println("Enter the number that represents the contact that you want to change any information:");
                        int positionToChange = input.nextInt();
                        positionToChange--;
                        System.out.println("Which information do you want to change?");
                        System.out.println("(1)Name\n(2)Email\n(3)Address\n(4)Phone");
                        int changeOption = input.nextInt();
                        input.nextLine();
                        if(changeOption == 1) {
                            System.out.println("Choose the new name:");
                            String newName = input.nextLine();
                            list.getList()[positionToChange].setName(newName);
                        } else if(changeOption == 2) {
                            System.out.println("Choose the new email:");
                            String newEmail = input.nextLine();
                            list.getList()[positionToChange].setEmail(newEmail);
                        } else if(changeOption == 3) {
                            System.out.println("Choose the new Address:");
                            String newAddress = input.nextLine();
                            list.getList()[positionToChange].setAddress(newAddress);
                        } else if(changeOption == 4) {
                            System.out.println("Choose the new phone number:");
                            String newPhone = input.nextLine();
                            list.getList()[positionToChange].setPhone(newPhone);
                        } else {
                            System.out.println("Option not found!");
                        }
                        break;
                

                default: System.out.println("ERROR");

            }
            showMainOptions();
            option = input.nextInt();
            isValid = isValidOption(option, 6);
            while(!isValid) {
                option = input.nextInt();
                isValid = isValidOption(option, 6);
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
        if(quantityOfContacts == 0) {
            System.out.println("The contact list is empty!!");
        } else {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("======================================ContactList=======================================");
            for(int i = 0; i < quantityOfContacts; i++) {
                String formatString = list.formatContactList()[i];
                System.out.printf("\t(%d) %s\n", (i+1), formatString);
    
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }

}