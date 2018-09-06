import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("900500300");

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while(!quit) {

            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 0:
                    System.out.println("Quitting the program...");
                    quit = true;
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    System.out.println("New contact: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.nextLine();
                    myPhone.addContact(name, phoneNumber);
                    break;
                case 3:
                    System.out.println("Enter contact name to query:");
                    myPhone.queryContactName(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Enter contact name to be updated:");
                    String oldName = scanner.nextLine();
                    System.out.println("Enter new contact name:");
                    String newContactName = scanner.nextLine();
                    System.out.println("Enter new phone number:");
                    String newPhoneNumber = scanner.nextLine();
                    myPhone.updateContact(oldName, newContactName, newPhoneNumber);
                    break;
                case 5:
                    System.out.println("Enter contact name to be removed:");
                    myPhone.removeContact(scanner.nextLine());
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("\nYour options: \t1 - to print your contact list." +
                "\t2 - to add a new contact." +
                "\t3 - to query a contact." +
                "\t4 - to update a contact." +
                "\t5 - to remove a contact." +
                "\t0 - to quit the program.");
    }


}
