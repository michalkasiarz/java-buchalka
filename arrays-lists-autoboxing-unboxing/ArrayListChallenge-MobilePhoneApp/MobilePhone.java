import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    public String myNumber;
    public List<Contact> myContacts = new ArrayList<>();

    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(myContacts.get(i).getName());
        }
    }

    public void addContact(String name, String myNumber) {
        Contact contact = new Contact(name, myNumber);
        myContacts.add(contact);
    }
}
