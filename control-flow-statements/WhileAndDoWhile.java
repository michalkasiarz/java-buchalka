public class WhileAndDoWhile {

    public static void main(String[] args) {
        // while loop
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\n\n");

        count = 1; // re-setting the value of count to 1
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\n\n");

        // do-while loop
        count = 1; // re-setting the value of count to 1
        do { // do-while executes at least once!
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("\n\n");

        // Challenge: prints first five even number between a given range (4-20), print them, sum them up and print the result as well

        int number = 4;
        int startingNumber = number;
        int finishNumber = 20;
        int sumOfEvenNumbers = 0;
        int foundNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            sumOfEvenNumbers = sumOfEvenNumbers + number;
            foundNumbers++;
            if (foundNumbers == 5) {
                break;
            }
        }
        System.out.println("Found " + foundNumbers + " even numbers.");
        System.out.println("Sum of the first " + foundNumbers + " even numbers within the range of " + startingNumber + "-" + finishNumber + " is " + sumOfEvenNumbers + ".");
    }

    // method that checks whether a given number is an even number
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
