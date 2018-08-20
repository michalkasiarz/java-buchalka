import java.util.Scanner;

public class ResizingArrayWithNewValues {

    private static Scanner scanner = new Scanner(System.in);
    // initial size of an array set to 3
    private static int[] baseData = new int[3];

    public static void main(String[] args) {

        // prints initial values of an array, i.e. zeros
        System.out.println("Array initialized with zeros:");
        printArray(baseData);
        // get input from the user and saves it into the array
        getInput();
        // prints the values stored in the array, after user's input
        System.out.println("Array filled with user's input:");
        printArray(baseData);
        System.out.println("OK, fine. Now, enter 5 numbers:");
        // resizes the array
        resizeArray();
        // get user's input again
        getInput();
        // prints the array after resizing ang getting input for the second time
        printArray(baseData);

    }

    // iterates through all elements of an array and sets new values from scanner
    private static void getInput() {
        System.out.println("Please enter " + baseData.length + " numbers:");
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    // prints the values stored in an array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // resizes an array to size 5
    private static void resizeArray() {
        int[] originalArray = baseData;

        baseData = new int[5];
        for (int i = 0; i < originalArray.length; i++) {
            baseData[i] = originalArray[i];
        }
    }
}
