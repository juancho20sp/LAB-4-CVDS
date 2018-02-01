/***************************************************************
* file: SplashPanel.java
* author: Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the view for an application's splash screen
*
****************************************************************/
package hangman.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashPanel extends JPanel {
    
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel teamLabel;

    public SplashPanel() {
        initComponents();
    }
               
    //method: initComponents
    //purpose: create view components for a splash screen
    private void initComponents() {
        setLayout(new BorderLayout());
        
        titleLabel = new JLabel("Placeholder");
        titleLabel.setFont(new java.awt.Font("Georgia", 0, 42));
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 0, 0, 0));
        this.add(titleLabel, BorderLayout.PAGE_START);
        
        teamLabel = new JLabel("Placeholder");
        teamLabel.setFont(new java.awt.Font("Georgia", 0, 36));
        teamLabel.setForeground(new java.awt.Color(255, 255, 255));
        teamLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 25, 0));
        this.add(teamLabel, BorderLayout.PAGE_END);
        
        setBackground(Color.BLACK);
    }             
    
    //method: setTitle
    //purpose: set title label text
    public void setTitle(String newTitle){
        titleLabel.setText(newTitle);
    }
    
    //method: setTeam
    //purpose: set team label text
    public void setTeam(String newTeam){
        teamLabel.setText("By: Team " + newTeam);
    }
    
    //method: setBackgroundColor
    //purpose: set background color
    public void setBackgroundColor(Color newColor){
        setBackground(newColor);
    }                 
}
