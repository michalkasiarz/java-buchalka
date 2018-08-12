public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(55555));
        System.out.println(isPalindrome(334433));

    }

    public static boolean isPalindrome(int number) {
        int input = number;
        int originalNumber = number;
        int reversedNumber = 0;
        int lastDigit;
        if (number < 0) {
            number = number * (-1);
            originalNumber = originalNumber * (-1);
        }
        while (number > 0) {
            // extracting the last digit
            lastDigit = number % 10;
            // increasing the place value and adding last digit
            reversedNumber = reversedNumber * 10 + lastDigit;
            // removing last digit from number
            number /= 10;
        }
        System.out.println("Is a given number of " + input + " a palindrome?");
        return reversedNumber == originalNumber;
    }
}
