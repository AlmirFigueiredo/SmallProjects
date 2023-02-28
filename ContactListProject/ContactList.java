package ContactListProject;

public class ContactList {
    private Contact[] list;
    private int sizeOfTheList;
    private int quantityOfContacts;

    //Default constructor:
    public ContactList(){
        this.quantityOfContacts = 0;
        this.sizeOfTheList = 10; //I guess is a good initial size for a new contactList
        this.list = new Contact[10];
    }
    //Methods:

    //Methods to add a new contact:
    public void addContact(Contact newContact) {
        boolean isFull = !(isThereSpace());
        if(isFull) {
            increaseSizeOfTheList();
        }
        this.list[this.quantityOfContacts] = newContact;
        this.quantityOfContacts++;
    }
    public boolean isThereSpace() {
        if(this.sizeOfTheList == quantityOfContacts) {
            return false;
        }
        return true;
    }
    public void increaseSizeOfTheList() {
        Contact[] temp = new Contact[2*this.sizeOfTheList];
        for(int i = 0; i < this.sizeOfTheList; i++) {
            temp[i] = this.list[i];
        }
        this.list = temp;
        this.sizeOfTheList *= 2;
    }

    //Methods to remove a contact:
    public int contactPosition(Contact removeContact) {
        for(int i = 0; i < this.quantityOfContacts; i++) {
            if(list[i].equals(removeContact)) {
                return i;
            }
        }
        System.out.println("Contact not found!");
        return -1; //If the return is equals -1 means that the position doesnt exist
    }
    public void removeContact(Contact removeContact) {
        int contactPosition = contactPosition(removeContact); //
        if(contactPosition == -1) {
            System.out.println("Error, contact not found!");
        } else {
            //It's necessary to create a temporary array to stores the contacts after the contact that will be elimate
            shiftLeft(contactPosition);
            System.out.println("Contact removed!");
            this.quantityOfContacts--;
        }

    }
    public void removeContactIndex(int position) {
        if(position == -1) {
            System.out.println("Error, contact not found!");
        } else {
            //It's necessary to create a temporary array to stores the contacts after the contact that will be elimate
            shiftLeft(position);
            System.out.println("Contact removed!");
            this.quantityOfContacts--;
        }
    }
    public void shiftLeft(int contactPosition) {
        Contact[] afterContacts = new Contact[this.quantityOfContacts-contactPosition]; //The size is equals all the contacts - the current position that will be exclude
        int j = 0;
        for(int i = contactPosition+1; i < quantityOfContacts; i++) {
            afterContacts[j] = this.list[i];
            j++;
        }
        j = 0;
        for(int i = contactPosition; i < quantityOfContacts; i++) {
            this.list[i] = afterContacts[j];
            j++;
        }
        this.list[this.quantityOfContacts-1] = null;
    }
    public String[] formatContactList() {
        String[] res = new String[this.quantityOfContacts];
        for(int i = 0; i < this.quantityOfContacts; i++) {
            res[i] = this.list[i].toString();
        }
        return res;
    }
    //Method to remove all empty contacts:
    public void removeAllEmptyContacts() {
        Contact[] temp = new Contact[this.quantityOfContacts];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = this.list[i];
        }
        this.list = temp;
        this.sizeOfTheList = this.quantityOfContacts;
    }
    //
    //Getters:
    public Contact[] getList() {
        return list;
    }
    public int getQuantityOfContacts() {
        return quantityOfContacts;
    }
    public int getSizeOfTheList() {
        return sizeOfTheList;
    }
    //Setters:
    public void setList(Contact[] list) {
        this.list = list;
    }
    public void setQuantityOfContacts(int quantityOfContacts) {
        this.quantityOfContacts = quantityOfContacts;
    }
    public void setSizeOfTheList(int sizeOfTheList) {
        this.sizeOfTheList = sizeOfTheList;
    }
}