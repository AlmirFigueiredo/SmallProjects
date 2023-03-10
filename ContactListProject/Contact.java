package ContactListProject;
public class Contact {
    private String name;
    private String email;
    private String address;
    private String phone;

    //Constructors:
    public Contact(){};
    
    public Contact(String name, String email, String address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    //Methods:
    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(!(other instanceof Contact)) {
            return false;
        }
        Contact otherObj = (Contact)other;
        return ((otherObj.name.equals(this.name))&&(otherObj.email.equals(this.email))
        &&(otherObj.address.equals(this.address)&&(otherObj.phone.equals(this.phone))));
    }
    @Override
    public String toString() {
        String res = "";
        res += "|Name: " + this.name + " |Email: " + this.email;
        res += "|Adress: " + this.address + " |Phone: " + this.phone;
        return res;
    }

    //Getters:
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    //Setters:
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
