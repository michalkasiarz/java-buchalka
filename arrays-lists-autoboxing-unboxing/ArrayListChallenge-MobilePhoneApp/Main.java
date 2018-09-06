public class Main {

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("900500300");
        myPhone.addContact("Janusz", "123123");
        myPhone.addContact("Zachar", "6654332");
        myPhone.addContact("Jędrzej", "74322");

        System.out.println();

        myPhone.printContacts();

        System.out.println();

        myPhone.updateContact("Zachar", "Piotrek", "123");

        System.out.println();

        myPhone.printContacts();

        System.out.println();

        myPhone.updateContact("Paweł", "Gaweł", "12412111");

        System.out.println();

        myPhone.queryContactName("Piotrek");

        System.out.println();

        myPhone.removeContact("Olgierd");

        System.out.println();

        myPhone.removeContact("Piotrek");

        System.out.println();

        myPhone.printContacts();


    }
}
