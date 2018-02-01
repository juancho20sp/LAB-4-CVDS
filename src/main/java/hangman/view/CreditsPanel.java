/*************************************************************** 
* File: CreditsPanel.java 
* Author: Marc Deaso 
* Class: CS 245 - Programming Graphical User Interfaces
* 
* Assignment: Swing Project 1 
* Date last modified: 10/11/2016
* 
* Purpose: This class is the view representation of the credits screen. The page
* will display the names and ID numbers of the group members and have a back
* button to return to the function screen.
* 
****************************************************************/
package hangman.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import static hangman.SwingProject.CONTRIBUTORS;

public class CreditsPanel extends JPanel {
    
    //Declare instance variables.
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel[] membersLabels = new JLabel[CONTRIBUTORS.length];
    private JButton backButton;
    
    private static final Font BUTTON_FONT = new Font("Arial Black", Font.BOLD, 15);
    private static final Border BUTTON_BORDER = BorderFactory.
            createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,5),
                    BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE,Color.GRAY));
    
    //CreditsPanel default constructor.
    public CreditsPanel() {
        this.initComponents();
    }
    
    //Method: getBackButton
    //Returns the JButton used to return to the function screen.
    public JButton getBackButton() {
        return this.backButton;
    }
    
    //Method: initComponents
    //Primary method for the CreditsPanel class, sets up the panel with the
    //GridBagLayout layout manager, places components
    private void initComponents() {
        this.setBackground(Color.BLACK);

        this.setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        
        creditsLabel = new JLabel("Placeholder");
        creditsLabel.setFont(new java.awt.Font("Arial Black", 0, 36));
        creditsLabel.setForeground(new java.awt.Color(255, 255, 255));
        creditsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditsLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        creditsLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        this.add(creditsLabel, gc);
        
        //Add new JLabel for each group member.
        for(int i = 0; i < CONTRIBUTORS.length; i++) {
            membersLabels[i] = new JLabel("Placeholder");
            membersLabels[i].setFont(new java.awt.Font("Arial", 0, 24));
            membersLabels[i].setForeground(new java.awt.Color(255, 255, 255));
            membersLabels[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            //membersLabels[i].setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            //membersLabels[i].setBorder(BUTTON_BORDER/*javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0)*/);
            
            gc.fill = GridBagConstraints.BOTH;
            gc.gridx = 1;
            gc.gridy = i + 1;
            gc.gridwidth = 1;
            gc.gridheight = 1;
            gc.weightx = .5;
            //gc.weighty = ;
            this.add(membersLabels[i], gc);
        }
        
        backButton = new JButton("Placeholder");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setMaximumSize(new Dimension(100, 100));
        backButton.setFont(BUTTON_FONT);
        backButton.setBorder(BUTTON_BORDER);
        
        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = 0;
        gc.gridy = CONTRIBUTORS.length;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.weightx = .15;
        //gc.weighty = ;
        this.add(backButton, gc);
        
        JPanel placeHolder = new JPanel();
        placeHolder.setBackground(this.getBackground());
        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = 2;
        gc.gridy = 1;
        gc.gridwidth = 1;
        gc.gridheight = CONTRIBUTORS.length + 1;
        gc.weightx = .35;
        //gc.weighty = ;
        this.add(placeHolder, gc); 
    }
     
    //Method: setTitle
    //Sets the text for the large title label on the panel.
    public void setTitle(String newTitle){
        this.creditsLabel.setText(newTitle);
    }
    
    //Method: setMembers
    //Sets the text for each of the members labels.
    public void setMembers(String[] newMembers){
        for(int i = 0; i < CONTRIBUTORS.length; i++){
                this.membersLabels[i].setText(newMembers[i]);
        }
    }
    
    //Method: setBackgroundColor
    //Gives public access to the panels background color setting.
    public void setBackgroundColor(Color newColor){
        this.setBackground(newColor);
    }
}
