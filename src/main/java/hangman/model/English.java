/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author 2106913
 */
public class English implements Language{

    @Override
    public String[] getFunctionControllerNames() {
        return new String[]{"Play","HighScores","Crédits"};
    }

    @Override
    public String getPointsNameLabel() {
        return "Points: ";
    }

    @Override
    public String getHangmanLabel() {
        return "Hangman";
    }

    @Override
    public String[] getBackSkypeButtonLabel() {
        return new String[]{"Back","Skip"};
    }

    @Override
    public String[] getAccesButton() {
        return new String[]{"Game Over!","New Game","Main Menu"};
    }

    @Override
    public String getFinalScorelabel() {
        return "Final Score: ";
    }
    
}
