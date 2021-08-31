package hangman.model;

public interface GameScore {
    abstract int calculateScore(int correctCount, int incorrectCount);
}
