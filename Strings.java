public class Strings {

    public static void main(String[] args) {
	String myString = "This is a String";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2018";
        System.out.println(myString);
    }
}
