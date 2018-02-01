/***************************************************************
* file: FunctionModel.java
* author: Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the model that contains the business logic for the
* function screen
*
****************************************************************/ 
package hangman.model;

import java.awt.Color;

public class FunctionModel {
    private Color backgroundColor;
    private String button1;
    private String button2;
    private String button3;
    
    public FunctionModel(Color bg,String btn1, String btn2, String btn3){
        backgroundColor = bg;
        button1 = btn1;
        button2 = btn2;
        button3 = btn3;
    }

    //method: getBackgroundColor
    //purpose: get value for screen background color
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    //method: setBackgroundColor
    //purpose: set value for screen background color
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    //method: getButton1
    //purpose: get text value for button1
    public String getButton1() {
        return button1;
    }

    //method: setButton1
    //purpose: set text value for button1
    public void setButton1(String button1) {
        this.button1 = button1;
    }

    //method: getButton2
    //purpose: get text value for button2
    public String getButton2() {
        return button2;
    }

    //method: setButton2
    //purpose: set text value for button2
    public void setButton2(String button2) {
        this.button2 = button2;
    }

    //method: getButton3
    //purpose: get text value for button3
    public String getButton3() {
        return button3;
    }

    //method: setButton3
    //purpose: set text value for button3
    public void setButton3(String button3) {
        this.button3 = button3;
    }
    
}
