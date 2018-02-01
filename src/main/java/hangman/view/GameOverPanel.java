/*************************************************************** 
*file: GameOverPanel.java 
* author: Jazmin Guerrero, Omar Rodriguez, Marc Deaso 
* class: CS 245 - Programming Graphical User Interfaces
* 
* 
* assignment: Swing Project 1 
* date last modified: 10/06/2016
* 
* purpose: This class is the view representation of a gameover screen
* 
****************************************************************/ 

package hangman.view;

import com.google.inject.Inject;
import hangman.model.Language;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class GameOverPanel extends JPanel {
    private JLabel gameOverLabel;
    private JLabel scoreLabel;
    private JButton button1;
    private JButton button2;
    
    
    private Language lan;
    
    private static final Font BUTTON_FONT = new Font("Arial Black", Font.BOLD, 32);
    private static final Border BUTTON_BORDER = BorderFactory.
            createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,5),
                    BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE,Color.GRAY));
    
    public GameOverPanel(Language lan) {
        this.lan=lan;
        this.initComponents();
    }

    //method: initComponents
    //initializes and attaches components in a gameoverpanel view, and sets
    //default values
    private void initComponents() {
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBackground(Color.BLACK);

        
        gameOverLabel = new JLabel();
        gameOverLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        gameOverLabel.setText(lan.getAccesButton()[0]);
        gameOverLabel.setFont(new java.awt.Font("Arial Black", 0, 36));
        gameOverLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.add(gameOverLabel);
        
        scoreLabel = new JLabel();
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scoreLabel.setText(lan.getFinalScorelabel()+"Placeholder");
        scoreLabel.setFont(new java.awt.Font("Arial", 0, 24));
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.add(this.scoreLabel);
        
        JPanel spacer = new JPanel();
        spacer.setBackground(Color.BLACK);
        this.add(spacer);
        
        button1 = new JButton(lan.getAccesButton()[1]);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setFont(BUTTON_FONT);
        button1.setBorder(BUTTON_BORDER);
        this.add(button1);
        
        button2 = new JButton(lan.getAccesButton()[2]);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFont(BUTTON_FONT);
        button2.setBorder(BUTTON_BORDER);
        this.add(button2);
    }

    //method: getResetButton
    //purpose: return reference to reset JButton
    public JButton getResetButton() {
        return this.button1;
    }
    
    //method: getMenuButton
    //purpose: return reference to menu JButton
    public JButton getMenuButton() {
        return this.button2;
    }
    
    //method: getGameOverLabel
    //purpose: return reference to main header label
    public JLabel getGameOverLabel() {
        return gameOverLabel;
    }

    //method: setGameOverLabel
    //purpose: set main header label
    public void setGameOverLabel(JLabel gameOverLabel) {
        this.gameOverLabel = gameOverLabel;
    }

    //method: getScoreLabel
    //purpose: get reference to score label
    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    //method setScoreLabel
    //purpose set score label
    public void setScoreLabel(JLabel scoreLabel) {
        this.scoreLabel = scoreLabel;
    }
    
    //method getButton1
    //purpose: get reference to first button on gameover panel
    public JButton getButton1() {
        return button1;
    }

    //method: setButton1
    //purpose: set first button
    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    //method; getButton2
    //purpose: return reference to second button
    public JButton getButton2() {
        return button2;
    }

    //method: setButton2
    //purpose: set second button
    public void setButton2(JButton button2) {
        this.button2 = button2;
    }
    
}
