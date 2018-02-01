/*************************************************************** 
*file: GameOverModel.java 
* author: Jazmin Guerrero, Omar Rodriguez, Marc Deaso 
* class: CS 245 - Programming Graphical User Interfaces
* 
* 
*assignment: Swing Project 1 
* date last modified: 10/06/2016
* 
* purpose: this class is the model containing the business logic 
* for a game over screen
* 
****************************************************************/ 
package hangman.model;

import com.google.inject.Inject;

public class GameOverModel {
    private int score;
    public  String GAME_OVER_TEXT = "Game Over!";
    private String newGameButtonText;
    private String menuButtonText;
    
    private Language lan;
    
    
 
    
    public GameOverModel(Language lan) {
        this.lan=lan;
        this.score = -1;
        newGameButtonText = lan.getAccesButton()[1];
        menuButtonText = lan.getAccesButton()[2];
        GAME_OVER_TEXT = lan.getAccesButton()[0];
    }
    
    //method: getScore
    //purpose: get final game score
    public int getScore(){
        return score;
    }
    
    //method: setScore
    //purpose: set final game score
    public void setScore(int gameScore) {
        this.score = gameScore;
    }

    //method: getNewGameButtonText
    //purpose: return text that belongs on the new game button
    public String getNewGameButtonText() {
        return newGameButtonText;
    }
    
    //method: setNewGameButtonText
    //purpose: set text that belongs on new game button
    public void setNewGameButtonText(String newGameButtonText) {
        this.newGameButtonText = newGameButtonText;
    }

    //method: getMenuButtonText
    //purpose: return text that belongs on the 'back to menu' button
    public String getMenuButtonText() {
        return menuButtonText;
    }

    //method: setMenuButtonText
    //purpose: set text that belongs on the 'back to menu' button
    public void setMenuButtonText(String menuButtonText) {
        this.menuButtonText = menuButtonText;
    }
    
}
