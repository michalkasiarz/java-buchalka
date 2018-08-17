public class Arrays {

    public static void main(String[] args) {
        // decalaration & initialization of an array
        int[] myIntArray = new int[18];
        // setting the value of an integer with index 5 in myIntArray to 50
        myIntArray[5] = 50;
        // declaration & initialization of myDoubleArray
        double[] myDoubleArray = new double[10];
        // printing the value with index 5 from myIntArray
        System.out.println(myIntArray[5]);
        // declaration & initialization myIntArray2 with specified content
        int[] myIntArray2 = {5, 3, 7, 2, 10};
        // printing the value with index 3 from myIntArray2
        System.out.println(myIntArray2[3]);
        // for loop that assigns values into myIntArray in an order
        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        // for loop that reads the index of an element and print it
        for(int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }
}
