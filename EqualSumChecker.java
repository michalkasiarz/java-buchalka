public class Main {

    public static void EqualSumChecker(String[] args) {
	hasEqualSum(2, 3, 4);
	hasEqualSum(2, 2, 4);
    }

    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber) {
        if((firstNumber + secondNumber) == thirdNumber) {
            return true;
        } else {
            return false;
        }
    }
}
