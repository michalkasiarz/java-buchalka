public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(-2);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
