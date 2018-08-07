public class DigitSumChallenge {
// counts a sum of digits of a given number
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number 12 is " + sumDigits(12));
        System.out.println("The sum of the digits in number 932 is " + sumDigits(932));
        System.out.println("The sum of the digits in number 25 is " + sumDigits(25));
        System.out.println("The sum of the digits in number -1 is " + sumDigits(-1));
        System.out.println("The sum of the digits in number 10 is " + sumDigits(10));
        System.out.println("The sum of the digits in number 1223124 is " + sumDigits(1223124));
    }

    private static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                // extract the least-significant digit
                int digit = number % 10;
                sum += digit;

                // drop the least-significant digit
                number /= 10; // same as number = number / 10;
            }
            return sum;
        }
        return -1;
    }
}
