package hangman.model;

public class PowerBonusScore implements GameScore {
    private int score = 0;

    /**
     *
     * @param correctCount Amount of correct letters given by the user
     * @param incorrectCount Amount of incorrect letters given by the user
     * @return The final score of the user
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int bonus = 0;

        for (int i = 1; i <= correctCount; i++){
            bonus += (int)Math.pow(5, i);
        }

        int penalty = 8 * incorrectCount;

        this.score += bonus;
        this.score -= penalty;

        if (this.score < 0){
            this.score = 0;
        }

        if (this.score > 500){
            this.score = 500;
        }

        return score;
    }
}
