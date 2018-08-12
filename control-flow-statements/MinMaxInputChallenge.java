import java.util.Scanner;

public class MinMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {

            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int input = scanner.nextInt();

                if(first) {
                    first = false;
                    min = input;
                    max = input;
                }

                if (max < input) {
                    max = input;
                }

                if (min > input) {
                    min = input;
                }

            } else {
                break;
            }
            scanner.nextLine(); // handling end of the line
        }
        System.out.println("Maximum entered number: " + max);
        System.out.println("Minimum entered number: " + min);
        scanner.close();
    }
}
