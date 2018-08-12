public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 300;
        int levelCompleted = 5;
        int bonus = 100;

        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            int secondFinalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Final score was " + finalScore + ", and second final score was " + secondFinalScore);
        }


        if(score < 5000 && score>1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
}
