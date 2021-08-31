package hangman.model;

public class OriginalScore implements GameScore{
    private int score = 100;

    /**
     *
     * @param correctCount Amount of correct letters given by the user
     * @param incorrectCount Amount of incorrect letters given by the user
     * @return The final score of the user
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int penalty = 10 * incorrectCount;

        this.score -= penalty;

        if (this.score < 0){
            this.score = 0;
        }

        return score;
    }
}
