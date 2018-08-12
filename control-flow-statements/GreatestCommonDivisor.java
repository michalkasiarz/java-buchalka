public class GreatestCommonDivisor {


    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            // finds the smaller number of the two given and then ascribes that value to int smallerNumber
            int smallerNumber = Math.min(first, second);
            // iterates by gcd and checks if modulo operations by it are equal to 0
            for (int gcd = smallerNumber; gcd > 0; gcd--) {
                if ((first % gcd == 0) && (second % gcd == 0)) {
                    return gcd;
                }
            }
        }
        return -1;
    }
}

