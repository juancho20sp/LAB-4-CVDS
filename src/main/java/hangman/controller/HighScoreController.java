/***************************************************************
* file: HighScoreController.java
* author: Nahid Enayatzadeh
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the controller that controls the communication
* between the highscore screen model and view
*
****************************************************************/ 
package hangman.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hangman.GUI;
import hangman.SwingProject;
import hangman.model.HighScoreModel;
import hangman.view.HighScorePanel;

public class HighScoreController {
    private HighScorePanel panel;
    private HighScoreModel model;
    private MainFrameController rootController;
    
    public HighScoreController(HighScorePanel panel, HighScoreModel model, MainFrameController rootController) {
        this.panel = panel;
        this.model = model;
        this.rootController = rootController;       
        this.setup();
    }
    
    //Method: setup
    //Purpose: Modifing variables title name, members name, background color and back button
    private void setup() {
        panel.setTitle(model.getHighScoreTitle());
        panel.setMembers(model.getMembers());
        panel.setBackgroundColor(model.getBackgroundColor());
        panel.getBackButton().setText(model.getBackButtonText());
        
        panel.getBackButton().addActionListener(new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
               rootController.changeVisibleCard(GUI.FUNCTION_KEY);
         }   
        });
    }
    
    //Method: getPanel
    //Purpose: Having access to panel variable
    public HighScorePanel getPanel() {
        return this.panel;
    }
    
    //Method: setPanel
    //Purpose: Modyfing the panel of HighScore
    public void setPanel(HighScorePanel panel) {
        this.panel = panel;
    }
    
    //Method: getModel
    //Purpose: Having access to model variable
    public HighScoreModel getModel() {
        return this.model;
    }
    
    //Method: setModel
    //Purpose: Modyfing the Model variable
    public void setModel(HighScoreModel model) {
        this.model = model;
    }

}
