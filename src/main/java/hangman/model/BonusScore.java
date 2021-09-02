package hangman.model;

public class BonusScore implements GameScore{
    /**
     *
     * @param correctCount Amount of correct letters given by the user
     * @param incorrectCount Amount of incorrect letters given by the user
     * @return The final score of the user
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 0;

        int bonus = 10 * correctCount;
        int penalty = 5 * incorrectCount;

        score += bonus;
        score -= penalty;

        if (score < 0){
            score = 0;
        }

        return score;
    }

    @Override
    public int getInitialScore() {
        return 0;
    }
}
