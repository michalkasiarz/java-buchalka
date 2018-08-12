public class TeenNumberChecker {

    public static void main(String[] args) {
	hasTeen(9,99,19);
	hasTeen(23,15,42);
	hasTeen(22,23,24);
    }

    public static boolean hasTeen (int firstNumber, int secondNumber, int thirdNumber) {
        if(firstNumber >= 13 && firstNumber <= 19) {
            return true;
        } else if (secondNumber >= 13 && secondNumber <=19) {
            System.out.println("True");
            return true;
        } else if (thirdNumber >= 13 && thirdNumber <=19) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
