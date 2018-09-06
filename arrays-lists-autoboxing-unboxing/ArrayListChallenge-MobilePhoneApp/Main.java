public class Main {

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        myPhone.addContact("Janusz", "123123");
        myPhone.addContact("Zachar", "6654332");
        myPhone.addContact("Jędrzej", "74322");

        myPhone.printContacts();

    }
}
