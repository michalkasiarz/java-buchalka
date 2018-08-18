import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        reverse(array);
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[j] = array[i];
            j++;
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}
