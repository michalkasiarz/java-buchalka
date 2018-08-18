import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        findMin(readIntegers(5));

    }


    public static int[] readIntegers(int count) {
        int[] arrayWithEnteredNumbers = new int[count];
        System.out.println("Please enter " + count + " integers.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayWithEnteredNumbers.length; i++) {
            arrayWithEnteredNumbers[i] = scanner.nextInt();
        }
        scanner.close();
        return arrayWithEnteredNumbers;
    }

    public static int findMin(int[] array) {
        int minimumValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimumValue) {
                minimumValue = array[i];
            }
        }
        System.out.println(minimumValue);
        return minimumValue;
    }
}
