public class BarkingDog {

    public static void main(String[] args) {
        bark(true, 1);
        bark(false, 2);
        bark(true, 8);
        bark(true, -1);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking && hourOfDay >= 0 && hourOfDay <= 23) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                System.out.println("true");
                return true;
            }
            System.out.println("false");
            return false;
        } else {
            System.out.println("false");
            return false;

        }
    }
}
