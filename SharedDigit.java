public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 90));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 93));
        System.out.println(hasSharedDigit(77, 17));
    }


    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            firstNumber /= 10;
            secondNumber /= 10;
            int firstNumberFirstDigit = firstNumber;
            int secondNumberFirstDigit = secondNumber;
            System.out.println("Is there any shared digit in both given numbers?");
            return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit));
        }
        System.out.println("Invalid input.");
        return false;
    }
}
