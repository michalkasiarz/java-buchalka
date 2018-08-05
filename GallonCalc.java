public class GallonCalc {

    public static void main(String[] args) {
	toQuartsAndGallons(32);
    }

    public static double toQuartsAndGallons (double USLiquidQuart, double imperialQuart) {
        double USLiquidGallon = USLiquidQuart / 4;
        double imperialGallon = imperialQuart / 4;
        System.out.println(USLiquidQuart + " US liquid quarts is " + USLiquidGallon + " US liquid gallons.");
        System.out.println(imperialQuart + " imperial quarts is " + imperialGallon + " imperial gallons.");
        return USLiquidGallon;
    }

    public static double toQuartsAndGallons (double litres) {
        if (litres >= 0) {
            double USLiquidQuart = litres * 0.946d;
            double imperialQuart = litres * 1.136d;
            System.out.println(litres + " litres is " + USLiquidQuart + " US liquid quarts.");
            System.out.println(litres + " litres is " + imperialQuart + " imperial quarts.");
            return toQuartsAndGallons(USLiquidQuart, imperialQuart);
        } else {
            System.out.println("Invalid input.");
            return -1;
        }
    }
}
