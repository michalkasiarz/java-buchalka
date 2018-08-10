public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(9);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // a loop which prints a new line (a row)
            System.out.println();
            System.out.println();
            for (int i = 0; i < number; i++) {
                // a loop which prints * and a space
                for (int j = 0; j < number; j++) {

                    // i == 0 top
                    // (i == number - 1) bottom
                    // (j == number - 1) right
                    //  j == 0 left

                    if (i == 0 || (i == number - 1) || j == 0 || (j == number - 1) || (i == j) || ((j + 1) == number - (i + 1) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
