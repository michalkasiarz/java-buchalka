public class FactorsPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number >= 1) {
            for (int i = number; i > 0; i--) {
                int factor = number / i;
                if (number % i == 0) {
                    System.out.println(factor);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
