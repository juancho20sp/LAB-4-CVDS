/***************************************************************
* file: LetterBlankPanel.java
*           Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the view component for displaying the blanks of a hangman game
*
****************************************************************/ 
package hangman.view;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class LetterBlankPanel extends JPanel{
    private String letter;
    
    public LetterBlankPanel(){
        letter = "";
    }
    
    //method: paint
    //purpose: paint the panel with the blanks of a hangman game, depending on 
    // the length of the given word
    @Override
    public void paint(Graphics g){
        super.paint(g);
        ((Graphics2D)g).setStroke(new BasicStroke(5));
        g.setFont(new Font("Arial",Font.BOLD, 16));
        
        int availableWidth = this.getWidth() - 10;
        int drawAtHeight = this.getHeight() / 2;
        int letterDrawX = this.getWidth() / 2;
        int letterDrawY = (this.getHeight() / 2) + -15;
        
        g.drawString(letter, letterDrawX, letterDrawY);
        g.drawLine(5,drawAtHeight,availableWidth,drawAtHeight);
        
    }

    //method getLetter
    //purpose: return letter currently painted on this panel
    public String getLetter() {
        return letter;
    }

    //method: setLetter
    //purpose: set letter to be painted to panel
    public void setLetter(String letter) {
        this.letter = letter;
    }
     
}
