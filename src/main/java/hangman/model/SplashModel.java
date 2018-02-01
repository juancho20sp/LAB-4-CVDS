/***************************************************************
* file: SplashModel.java
* author: Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the model that contains the business logic for the
* splash screen
*
****************************************************************/ 
package hangman.model;

import java.awt.Color;

/**
 *
 * @author Omar
 */
public class SplashModel {
    private String splashTitle;
    private String teamName;
    private Color backgroundColor;
    private int splashTime;
    
    public SplashModel(){
        splashTitle = "PLACEHOLDER";
        teamName = "PLACEHOLDER";
        backgroundColor = Color.BLACK;
        splashTime = 3000;
    }
    
    public SplashModel(String title, String team, Color color, int time){
        splashTitle = title;
        teamName = team;
        backgroundColor = color;
        splashTime = time;
    }

    //method: getSplashTitle
    //purpose: get value for top header
    public String getSplashTitle() {
        return splashTitle;
    }

    //method: setSplashTitle
    //purpose: set value for top header
    public void setSplashTitle(String splashTitle) {
        this.splashTitle = splashTitle;
    }

    //method: getTeamName
    //purpose: get value for bottom header
    public String getTeamName() {
        return teamName;
    }
    
    //method: setTeamName
    //purpose: set value for bottom header
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    //method: getBackgroundColor
    //purpose: get value for background color
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    //method: setBackgroundColor
    //purpose: set value for background color
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    //method: getSplashTime
    //purpose: get value for length of splash screen
    public int getSplashTime() {
        return splashTime;
    }

    //method: setSplashTime
    //purpose: set value for length of splash screen
    public void setSplashTime(int splashTime) {
        this.splashTime = splashTime;
    }
}
