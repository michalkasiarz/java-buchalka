public class Operators {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 10;
        boolean isCalculationTrue = false;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);

        System.out.println("Is calculation true yet? " + isCalculationTrue);

        int addingResult = a + b + c;
        System.out.println("The result of the addition of A, B and C is: " + addingResult);

        if (addingResult == 18)
            isCalculationTrue = true;
                if (isCalculationTrue == true) System.out.println("He DOES the math correctly, he IS an Alien! Save yourself and run!");


        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if (newValue == 50) System.out.println("This is true");

        // Challenge

        double myDouble = 20d;
        double mySecondDouble = 80d;
        double myMath = (myDouble + mySecondDouble) * 25;
        System.out.println(myMath);
        double remainder = myMath % 40;
        System.out.println(remainder);

        if(remainder <= 20)
            System.out.println("Total was over the limit");

    }
}
