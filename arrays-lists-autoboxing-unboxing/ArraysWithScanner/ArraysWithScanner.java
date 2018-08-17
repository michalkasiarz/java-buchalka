import java.util.Scanner;

public class ArraysWithScanner {

    // method of type Scanner that assigns the user input into a variable scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // array of a type of int which size is equal to a parameter of getInteger method called 'number'
        int[] myIntegers = getIntegers(5);
        // for loop that prints following values of an array that has been typed by the user
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    // method of type array-integers that gets the parameter of an int
    public static int[] getIntegers(int number) {
        // prints a message to the user with an information how many numbers he should enter
        System.out.println("Enter " + number + " integer values.\r");
        // creates an array of integers called 'values' and sets its size to the parameter of the method
        int[] values = new int[number];
        // for loop that allows the user to type values that are assigned to the following values of an array
        for (int i = 0; i < values.length; i++) {
            // each execution of the loop changer the value of the index to higher and assigns user's input there
            values[i] = scanner.nextInt();
        }
        // returns an array after the execution of the loop (i.e. filling it with user's input
        return values;
    }

    // method of type double that return the average value of the user's jnput
    public static double getAverage(int[] array) {
    // a variable sum stores the sum of the user's input
        int sum = 0;
        // for loop that adds user's input and assigns the result to the variable sum
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // method return casted value of sum into double, because the average value of the user's input may be a fraction
        return (double) sum / (double)array.length;
    }
}
