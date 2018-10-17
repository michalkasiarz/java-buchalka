import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a String\n" +
                "0 to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            // assigns the value of scanner to a variable "choice"
            int choice = scanner.nextInt();
            // consuming last newline character
            scanner.nextLine();

            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    // assigns the value of scanner to a variable "stringInput"
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }
}
