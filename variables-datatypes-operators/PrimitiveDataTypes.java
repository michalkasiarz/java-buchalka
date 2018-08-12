public class PrimitiveDataTypes {

    public static void main(String[] args) {


        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        int liczba = 1000 + 10 * (10 + 20 + 50);
        System.out.println(liczba);
    }
}
