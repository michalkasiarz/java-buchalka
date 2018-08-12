import java.util.Scanner;

// training exercise
public class UserInputTraining {

    public static void main(String[] args) {
        int enteredNumbers = 0;
        int sum = 0;

        System.out.println("How many number would you like to enter?");
        Scanner scanner = new Scanner(System.in);

        int numbersToEnter = scanner.nextInt();

        while (enteredNumbers < numbersToEnter) {
            int counter = enteredNumbers + 1;
            System.out.println("Enter the number #" + counter);

            boolean isValidInt = scanner.hasNextInt();

            if (isValidInt) {
                int number = scanner.nextInt();
                enteredNumbers++;
                sum += number;
            } else {
                System.out.println("Invalid input.");
            }
            scanner.nextLine(); // handling enter key
        }
        System.out.println("The sum of the " + numbersToEnter + " entered numbers is " + sum + ".");
        scanner.close();
    }
}
