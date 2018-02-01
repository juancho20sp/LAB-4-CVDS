/***************************************************************
* file: FunctionController.java
* author: Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the controller that controls the communication
* between the function screen model and view
*
****************************************************************/ 
package hangman.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import hangman.GUI;
import hangman.SwingProject;
import hangman.model.FunctionModel;
import hangman.view.FunctionPanel;


public class FunctionController {
    private GameController gameControllerReference;
    private FunctionPanel panel;
    private FunctionModel model;
    private MainFrameController rootController;
    
    public FunctionController(FunctionPanel panel, FunctionModel model,MainFrameController rootController){
        this.model = (FunctionModel) model;
        this.panel = (FunctionPanel) panel;
        this.rootController = rootController;
        setup();
    }
    
    //method: setup
    //purpose: set contents of model to be reflected in the view, as well as
    // sets a listener to change the size of the image depending on the size
    // of the panel. Also adds listeners to buttons to switch screens.
    private void setup(){
        panel.setBackground(model.getBackgroundColor());
        panel.getPlayButton().setText(model.getButton1());
        panel.getHighScoresButton().setText(model.getButton2());
        panel.getCreditsButton().setText(model.getButton3());
        
        panel.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                int currentSize = panel.getHeight() * panel.getWidth();
                if(currentSize<360000){
                    panel.changeImageSize(3);
                } else if(currentSize<1160000){
                    panel.changeImageSize(2);
                } else {
                    panel.changeImageSize(1);
                }
            }

            @Override
            public void componentMoved(ComponentEvent e) {
            }

            @Override
            public void componentShown(ComponentEvent e) {
            }

            @Override
            public void componentHidden(ComponentEvent e) {
            }
        });
        panel.getPlayButton().addActionListener((ActionEvent e) -> {
            gameControllerReference.resetGame();
            rootController.changeVisibleCard(GUI.GAME_KEY);
        });
        panel.getHighScoresButton().addActionListener((ActionEvent e) -> {
            rootController.changeVisibleCard(GUI.HIGH_SCORE_KEY);
        });
        panel.getCreditsButton().addActionListener((ActionEvent e) -> {
            rootController.changeVisibleCard(GUI.CREDITS_KEY);
        });
    }
    
    //method: setGameControllerReference
    //purpose: used to set a reference to the game screen controller, 
    // used in order to reset the game.
    public void setGameControllerReference(GameController gameControllerReference) {
        this.gameControllerReference = gameControllerReference;
    }
    
    //method: getPanel
    //purpose: return the panel associated with this screen (FunctionPanel)
    public FunctionPanel getPanel(){
        return panel;
    }
    
}
