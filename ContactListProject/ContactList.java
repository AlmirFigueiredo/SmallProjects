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
    public int isThereContact(Contact removeContact) {
        for(int i = 0; i < this.quantityOfContacts; i++) {
            if(list[i].equals(removeContact)) {
                return i;
            }
        }
        System.out.println("Contact not found!");
        return -1;
    }
    public void removeContact(Contact removeContact) {
        int isThereContact = isThereContact(removeContact);
        if(isThereContact == -1) {
            System.out.println("Error, contact not found!");
        }

    }

    
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