package hangman.model;

public class BonusScore implements GameScore{
    private int score = 0;

    /**
     *
     * @param correctCount Amount of correct letters given by the user
     * @param incorrectCount Amount of incorrect letters given by the user
     * @return The final score of the user
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int bonus = 10 * correctCount;
        int penalty = 5 * incorrectCount;

        this.score += bonus;
        this.score -= penalty;

        if (this.score < 0){
            this.score = 0;
        }

        return this.score;
    }
}
