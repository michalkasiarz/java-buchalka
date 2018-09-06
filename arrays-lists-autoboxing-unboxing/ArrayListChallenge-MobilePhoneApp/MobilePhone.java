import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    public String myNumber;
    public List<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
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
        if (queryResult >= 0) {
            Contact updatedContact = new Contact(newName, number);
            myContacts.set(queryResult, updatedContact);
            System.out.println("Contact " + oldName + " has been replaced with " + newName + " (phone: " + number + ").");
        } else {
            System.out.println("Operation error. Contact " + oldName + " was not found on your contact list, so was not updated.");
        }
    }

    public int queryContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contactName.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public void queryContactName(String contactName) {
        int contactIndex = queryContact(contactName);
        if (contactIndex >= 0) {
            System.out.println("Contact " + contactName + " was found on index " + contactIndex + " on your contact list.");
        } else {
            System.out.println("Contact " + contactName + " was not found on your contact list.");
        }
    }

    public void removeContact(String contactName) {
        int contactIndex = queryContact(contactName);
        if (contactIndex >= 0) {
            myContacts.remove(contactIndex);
            System.out.println("Contact " + contactName + " successfully removed from your contact list.");
        } else {
            System.out.println("Contact " + contactName + " was not found on your contact list, so not deleted.");
        }
    }
}
