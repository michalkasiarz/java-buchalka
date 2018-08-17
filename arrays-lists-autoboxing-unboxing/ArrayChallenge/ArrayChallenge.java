import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int[] integers = getIntegers(5);
        printArray(integers);
        sortIntegers(integers);
        printArray(integers);


    }

    public static int[] getIntegers(int input) {
        int[] enteredNumbers = new int[input];
        System.out.println("Enter " + enteredNumbers.length + " numbers:\r");

        for (int i = 0; i < enteredNumbers.length; i++) {
            enteredNumbers[i] = userInput.nextInt();
        }
        return enteredNumbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortIntegers(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
