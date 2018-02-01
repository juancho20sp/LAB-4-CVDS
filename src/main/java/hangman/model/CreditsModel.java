/*************************************************************** 
* File: CreditsModel.java 
* Author: Marc Deaso 
* Class: CS 245 - Programming Graphical User Interfaces
* 
* Assignment: Swing Project 1 
* Date last modified: 10/11/2016
* 
* Purpose: This class is the model representation of the credits screen. Holds
* information that will be displayed by the CreditsPanel.
* 
****************************************************************/
package hangman.model;

import com.google.inject.Inject;
import java.awt.Color;
import static hangman.SwingProject.CONTRIBUTORS;

public class CreditsModel {
    
    //Declare instance variables.
    private String creditsTitle;
    private String[] teamMembers;
    private Color backgroundColor;
    private String backButtonText;
    
   
    private Language lan;
    
    //CreditsModel default constructor.
    
    public CreditsModel() {
        this.creditsTitle = "PLACEHOLDER";
        this.teamMembers = new String[CONTRIBUTORS.length];
        this.backgroundColor = Color.BLACK;
        this.backButtonText = lan.getBackSkypeButtonLabel()[0];
    }
    
    //Constructor
    //Initializes instance variables.
    public CreditsModel(String title, String[] members, Color color,Language lan) {
        this.lan=lan;
        this.creditsTitle = title;
        this.teamMembers = members;
        this.backgroundColor = color;
        this.backButtonText = lan.getBackSkypeButtonLabel()[0];
    }
    
    //Method getCreditsTitle
    //Returns a string that will be used as the title of the panel.
    public String getCreditsTitle() {
        return this.creditsTitle;
    }
    
    //Method setCreditsTitle
    //Sets the string that will be used as the title of the panel.
    public void setCreditsTitle(String creditsTitle) {
        this.creditsTitle = creditsTitle;
    }
    
    //Method: getMembers
    //Returns a string array that has the names and ID numbers of each member.
    public String[] getMembers() {
        return this.teamMembers;
    }
    
    //Method: setMembers
    //Sets the string array that will display each member's name on the panel.
    public void setMembers(String[] members) {
        this.teamMembers = members;
    }
    
    //Method: getBackgroundColor
    //Returns the instance variable backgroundColor.
    public Color getBackgroundColor() {
        return this.backgroundColor;
    }
    
    //Method: setBackgroundColor
    //Sets the instance variable backgroundColor.
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    //Method: getBackButtonText
    //Returns the string backButtonText ("Back").
    public String getBackButtonText() {
        return this.backButtonText;
    }
}
