/** *************************************************************
 * file: HangmanPanel.java
 *           Omar Rodriguez
 * class: CS 245 - Programming Graphical User Interfaces
 *
 * assignment: Swing Project v1.0
 * date last modified: 10/11/2016
 *
 * purpose: This is the view component for displaying a hangman game
 *
 *************************************************************** */
package hangman.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class HangmanNoviolentoPanel extends HangmanPanel {

    int incorrectCount;

    public HangmanNoviolentoPanel() {
        incorrectCount = 0;
    }

    //method: incrementIncorrectGuesses
    //purpose: increase the number of incorrect guesses from the player
    public void incrementIncorrectGuesses() {
        incorrectCount++;
    }

    //method: setIncorrectGuesses
    //purpose: manually setting number of incorrect guesses
    public void setIncorrectGuesses(int incorrectGuesses) {
        this.incorrectCount = incorrectGuesses;
    }

    //method: paint
    //purpose: paint the panel with the features of a hangman game, depending on 
    // how many incorrect guesses by the player
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight();

        g.setColor(Color.blue);

        g.drawLine((panelWidth / 5), (panelHeight / 6) - 25, (panelWidth / 5) + 15, (panelHeight / 6));
        g.drawLine((panelWidth / 5) + 25, (panelHeight / 6) - 35, (panelWidth / 5) + 32, (panelHeight / 6) - 5);
        g.drawLine((panelWidth / 5) + 60, (panelHeight / 6) - 35, (panelWidth / 5) + 50, (panelHeight / 6) - 5);
        g.drawLine((panelWidth / 5) + 80, (panelHeight / 6) - 27, (panelWidth / 5) + 68, (panelHeight / 6) - 1);

        if (incorrectCount > 0) {
            g.fillOval((panelWidth / 4) + 10 - (panelHeight / 12), (panelHeight / 6), panelHeight / 6, panelHeight / 6); // Head
        }
        if (incorrectCount > 1) {
            g.drawOval((panelWidth / 4) - 5, ((panelHeight / 6) * 2) + 5, (panelWidth / 18), (panelHeight / 4));
        }
        if (incorrectCount > 2) {
            g.drawLine((panelWidth / 4), ((panelHeight / 6) * 2) + (panelHeight / 18), ((panelWidth / 4) + 10) - (panelHeight / 6),
                    (((panelHeight / 6) * 2) + (panelHeight / 18)) - (panelHeight / 12)); // Left Arm
        }
        if (incorrectCount > 3) {
            g.drawLine((panelWidth / 4) + 25, ((panelHeight / 6) * 2) + (panelHeight / 18), ((panelWidth / 4) + 10) + (panelHeight / 6),
                    (((panelHeight / 6) * 2) + (panelHeight / 18)) - (panelHeight / 12)); // Right Arm
        }
        if (incorrectCount > 4) {
            g.drawLine((panelWidth / 4) + 25, (panelHeight / 6) * 3 + 20, ((panelWidth / 4) + 10) + (panelHeight / 6),
                    (((panelHeight / 6) * 3) + (panelHeight / 18)) + (panelHeight / 12)); // Left Leg

        }
        if (incorrectCount > 5) {
            g.drawLine((panelWidth / 4), (panelHeight / 6) * 3 + 20, ((panelWidth / 4) + 10) - (panelHeight / 6),
                    (((panelHeight / 6) * 3) + (panelHeight / 18)) + (panelHeight / 12)); // Right Leg
        }
    }
}
