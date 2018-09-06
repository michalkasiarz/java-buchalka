import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    public String myNumber;
    public List<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public void printContacts() {
        System.out.println("Contact list of " + myNumber + ":");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(myContacts.get(i).getName());
        }
    }

    public void addContact(String name, String number) {
        Contact contact = new Contact(name, number);
        myContacts.add(contact);
        System.out.println("New contact added.");
    }

    public void updateContact(String oldName, String newName, String number) {
        int queryResult = queryContact(oldName);
        if(queryResult > 0) {
            Contact updatedContact = new Contact(newName, number);
            myContacts.set(queryResult, updatedContact);
            System.out.println("Contact " + oldName + " has been replaced with " + newName + " (phone: " + number + ").");
        } else {
            System.out.println("Operation error. Contact " + oldName + " was not found on your contact list, so contact was not updated.");
        }
    }

    public int queryContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if(contactName.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return 0;
    }
}
