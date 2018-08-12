public class SumOddRange {

    public static void main(String[] args) {
        // program returns the sum of the odd numbers between a given range or -1 if the input is invalid
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sumOfTheOddNumbers = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfTheOddNumbers = sumOfTheOddNumbers + i;
                }
            }
            return sumOfTheOddNumbers;
        } else {
            return -1;
        }
    }
}
