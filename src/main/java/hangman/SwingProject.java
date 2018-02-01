/*******************************************************************************
*  file:SwingProject
*  author:Omar Rodriguez
          Nahid Enayatzadeh
          Marc Deaso
          Christopher Santos
          Jazmin Guerrero
*   class: CS245 - Programming Graphical User Interfaces
* 
*  assignment: Swing ProjectV1
*  date last modified: October/06/2016
* 
* Purpose: This program implements the traditional game of Hangman
* Program working with following functions:
* 1)Centered the screen on 600 x 400 pixel window
* 2)Program will have a start up screen which display group name for 3 second
* 3)After showing three function buttons, play, High Score and credit on new screen
* 4)By clicking on each button take us to the new page 
* 5)Must display current time and date
* 6)This game a random word will be selected from the following list(abstract,
* cemetery, nurse,pharmacy,climbing). user may click on one of the alphabet 
* button to guess the letter which may be in selected word of guessing, the line 
* makes by the lines and the button will be display. if the guessing is not found
* it will give us alert
* 
*/
package hangman;


import com.google.inject.Guice;
import com.google.inject.Injector;

import hangman.setup.factoryMethod.HangmanDefaultFactoryMethod;
import hangman.setup.guice.HangmanFactoryServices;

public class SwingProject {

    public static final String CONTRIBUTORS[] = {
            "Omar Rodriguez, 008796203",
            "Nahid Enayatzadeh, 010164622",
            "Marc Deaso, 011179285",
            "Christopher Santos, ",
            "Jazmin Guerrero, 009007193"};

    public static final String PROJECT_NAME = "CS 245 - Swing Project v1";

    public static GUI createGUIUsingFactoryMethod() {
        return new GUI(new HangmanDefaultFactoryMethod());
    }

    public static GUI createGUIUsingGuice() {
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(GUI.class);
    }

    //method: main
    //purpose: the entry-point to our application
    public static void main(String[] args) {
        createGUIUsingFactoryMethod().play();
    }

}
