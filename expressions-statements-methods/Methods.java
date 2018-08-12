public class Methods {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score is " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Second final score is " + highScore);

        int highScorePosition = calculateHighScorePosition(1340);
        displayHighScorePosition("Michał", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Paweł", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Robert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Wojciech", highScorePosition);

        highScorePosition = calculateHighScorePosition(22);
        displayHighScorePosition("Olaf", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }


    // Challenge



    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        
            return 4;
    }
}
