// Build an Address Book Management System that stores contact details such as name, phone number, and email address.
// Design the application using multiple Java Collections to achieve efficient storage, searching, and duplicate prevention.
// Your program should support the following functionalities: I Store all contacts in an ArrayList to maintain an ordered list. 
// Use a HashMap<String, Contact> for quick lookup of contacts by name.
// Use a HashSet String> to ensure that duplicate phone numbers cannot be added.
// Implement functionality to add, search, delete, and display contacts.
// Display all contacts sorted alphabetically by name using Collections.sort().
// Ensure that whenever a contact is added or deleted, all three collections remain synchronized and contain consistent data.

import java.util.ArrayList;

class Contact{
    String name;
    long phone;
    String email;

    public Contact(String name, long phone, String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    public ArrayList<Object> ret(Contact c) {
        ArrayList<Object> contactDetails = new ArrayList<>();
        contactDetails.add(c.name);
        contactDetails.add(c.phone);
        contactDetails.add(c.email);
        return contactDetails;
    }
}
public class AddressBookManagement extends Contact{

    public static void main(String[] args) {
        Co
    }
}