import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredNumbers = 0;
        int sumOfEnteredNumbers = 0;


        while (enteredNumbers < 10) {
            int inputOrder = enteredNumbers + 1;
            System.out.println("Enter the number #" + inputOrder + ":");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                enteredNumbers++;
                sumOfEnteredNumbers += number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handling end of the line
        }
        System.out.println("Sum of entered numbers " + sumOfEnteredNumbers);
        scanner.close();
    }
}
