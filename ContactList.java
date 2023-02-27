public class ContactList {
    private Contact[] list;
    private int sizeOfTheList;
    private int quantityOfContacts;

    //Default constructor:
    public ContactList(){
        this.quantityOfContacts = 0;
        this.sizeOfTheList = 10; //I guess is a good size for a new contactList
        this.list = new Contact[10];
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