package hangman;

import hangman.model.*;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 * Equivalence class:
 * OriginalScore
 *      (3 correct, 5 incorrect)
 *      Limit
 *          Minimal score = 0
 *          Maximum score = 100
 *
 * BonusScore
 *      (5 correct, 4 incorrect)
 *      Limit
 *          Minimal score = 0
 *          Maximum score = equal to the amount of letters * 10
 *
 * PowerBonusScore
 *      (4 correct, 4 incorrect)
 *      Limit
 *          Minimal score = 0
 *          Maximum score = 500
 */
public class GameScoreTest {
    OriginalScore originalScore = new OriginalScore();
    BonusScore bonusScore = new BonusScore();
    PowerBonusScore powerBonusScore = new PowerBonusScore();

    /**
     * Original score test
     */
    @Test
    public void originalScoreTest() {
        int result = originalScore.calculateScore(3, 5);

        assertTrue(result == 50);
    }

    /**
     * Original score minimum value test
     */
    @Test
    public void originalScoreMinimumTest() {
        int result = originalScore.calculateScore(3, 28);

        assertTrue(result == 0);
    }

    /**
     * Original score maximum value test
     */
    @Test
    public void originalScoreMaximumTest() {
        int result = originalScore.calculateScore(10, 0);

        assertTrue(result == 100);
    }

    /**
     * Bonus score test
     */
    @Test
    public void bonusScoreTest() {
        int result = bonusScore.calculateScore(5, 4);

        assertTrue(result == 30);
    }

    /**
     * Bonus score minimum value test
     */
    @Test
    public void bonusScoreMinimumTest() {
        int result = bonusScore.calculateScore(3, 28);

        assertTrue(result == 0);
    }

    /**
     * Bonus score maximum value test
     */
    @Test
    public void bonusScoreMaximumTest() {
        int result = bonusScore.calculateScore(14, 0);

        assertTrue( result == 140);
    }

    /**
     * Power Bonus score test
     */
    @Test
    public void powerBonusScoreTest() {
        int result = powerBonusScore.calculateScore(4, 4);

        assertTrue(result == 500);
    }

    /**
     * Power Bonus score minimum value test
     */
    @Test
    public void powerBonusScoreMinimumTest() {
        int result = powerBonusScore.calculateScore(3, 28);

        assertTrue(result == 0);
    }

    /**
     * Power Bonus score maximum value test
     */
    @Test
    public void powerBonusScoreMaximumTest() {
        int result = powerBonusScore.calculateScore(14, 0);

        assertTrue(result == 500);
    }


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
