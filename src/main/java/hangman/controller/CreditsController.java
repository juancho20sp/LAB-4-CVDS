/*************************************************************** 
* File: CreditsController.java 
* Author: Marc Deaso 
* Class: CS 245 - Programming Graphical User Interfaces
* 
* Assignment: Swing Project 1 
* Date last modified: 10/11/2016
* 
* Purpose: This class is the controller representation of the credits screen.
* Facilitates communication between CreditsModel and CreditsView.
* 
****************************************************************/
package hangman.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hangman.GUI;
import hangman.SwingProject;
import hangman.model.CreditsModel;
import hangman.view.CreditsPanel;

public class CreditsController {
    
    //Declare instance variables.
    private CreditsPanel panel;
    private CreditsModel model;
    private MainFrameController rootController;

    //Contructor
    //Initializes instance variables and runs the setup method.
    public CreditsController(CreditsPanel panel, CreditsModel model, MainFrameController rootController) {
        this.panel = panel;
        this.model = model;
        this.rootController = rootController;
        
        this.setup();
    }
    
    //Method: setup
    //Sets panel's information from the model, adds action listener to back button.
    private void setup() {
        panel.setTitle(model.getCreditsTitle());
        panel.setMembers(model.getMembers());
        panel.setBackgroundColor(model.getBackgroundColor());
        panel.getBackButton().setText(model.getBackButtonText());
        
        panel.getBackButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                rootController.changeVisibleCard(GUI.FUNCTION_KEY);
            }
        });
    }
    
    //Method: getPanel
    //Returns the panel instance variable.
    public CreditsPanel getPanel() {
        return this.panel;
    }
    
    //Method: setPanel
    //Sets the panel instance variable.
    public void setPanel(CreditsPanel panel) {
        this.panel = panel;
    }
    
    //Method: getModel
    //Returns the model instance variable.
    public CreditsModel getModel() {
        return this.model;
    }
    
    //Method: setModel
    //Sets the model instance variable.
    public void setModel(CreditsModel model) {
        this.model = model;
    }
}
