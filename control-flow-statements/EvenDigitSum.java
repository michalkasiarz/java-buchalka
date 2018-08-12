public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.println("The sum of even digits within a number " + originalNumber + " is equal to:");
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid input:");
        return -1;
    }
}
