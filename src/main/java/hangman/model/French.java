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
public class French implements Language{

    @Override
    public String[] getFunctionControllerNames() {
        return new String[]{"Jouer","Score Èlevé","Crédits"};
    }

    @Override
    public String getPointsNameLabel() {
        return "Points: ";
    }

    @Override
    public String getHangmanLabel() {
        return "Bourreau";
    }

    @Override
    public String[] getBackSkypeButtonLabel() {
        return new String[]{"Arrière","Sauter"};
    }

    @Override
    public String[] getAccesButton() {
        return new String[]{"Jeu terminé!","Nouveau Jeu","Menu principal"};
    }

    @Override
    public String getFinalScorelabel() {
        return "Score Final: ";
    }
    
}
