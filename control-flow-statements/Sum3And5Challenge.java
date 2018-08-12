public class Sum3And5Challenge {

    public static void main(String[] args) {

        long sumOfTheNumbers = 0;
        int count = 0;
        System.out.println("Here's the list of the first five numbers divisible by 3 and 5 (starting from 1):");
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sumOfTheNumbers = sumOfTheNumbers + i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("And the sum of all of them is " + sumOfTheNumbers + ".");
    }
}
