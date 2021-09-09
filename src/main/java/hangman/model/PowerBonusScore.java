package hangman.model;

public class PowerBonusScore implements GameScore {
    /**
     * @param correctCount Amount of correct letters given by the user
     * @param incorrectCount Amount of incorrect letters given by the user
     * @return The final score of the user
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 0;
        double bonus = 0;

        for (int i = 1; i <= correctCount; i++){
            bonus += Math.pow(5, i);
        }

        double penalty = 8 * incorrectCount;
        score += bonus;
        score -= penalty;

        if (score < (double)0){
            score = 0;
        }

        if (score > (double)500){
            score = 500;
        }

        return score;
    }

    @Override
    public int getInitialScore() {
        return 0;
    }
}
