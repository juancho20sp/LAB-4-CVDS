package hangman.model;

public class OriginalScore implements GameScore{
    //private int score = 100;

    /**
     *
     * @param correctCount Amount of correct letters given by the user
     * @param incorrectCount Amount of incorrect letters given by the user
     * @return The final score of the user
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 100;
        int penalty = 10 * incorrectCount;

        score -= penalty;

        if (score < 0){
            score = 0;
        }

        return score;
    }

    @Override
    public int getInitialScore() {
        return 100;
    }
}
