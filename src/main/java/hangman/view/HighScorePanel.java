/***************************************************************
* file: HighScorePanel.java
* author: Nahid Enayatzadeh
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the view for an application's highscore screen
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

public class HighScorePanel extends JPanel{
    private javax.swing.JLabel highScoreLabel;
    
    //Getting the name of members in array
    private javax.swing.JLabel[] membersLabels = new JLabel[CONTRIBUTORS.length];
    private JButton backButton;
    
    //Declaring the font,bold and size of button text
    private static final Font BUTTON_FONT = new Font("Arial Black", Font.BOLD, 15);
    
    //Declareing the button border withe specific size, color
    private static final Border BUTTON_BORDER = BorderFactory.
            createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,5),
                    BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE,Color.GRAY));
    
    public HighScorePanel() {
        initComponents();
    }
        //Method: getBackButton
        //Purpose: Having access to Backbutton 
        public JButton getBackButton(){
        return this.backButton;
        }
        
        //geting the color of cackground as prameter and modyfing it
        private void initComponents() {
        this.setBackground(Color.BLACK);
           
        this.setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        
        /*Giving values to set up font, color, Horizontal and vertical Alignment
        and creat empty border size
        */
        highScoreLabel = new JLabel("Placeholder");
        highScoreLabel.setFont(new java.awt.Font("Arial Black", 0, 36));
        highScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        highScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highScoreLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        highScoreLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        this.add(highScoreLabel, gc);
        
        //for loop makes all member name lable looks like each other
        for(int i = 0; i < CONTRIBUTORS.length; i++) {
            membersLabels[i] = new JLabel("Placeholder");
            membersLabels[i].setFont(new java.awt.Font("Arial", 0, 24));
            membersLabels[i].setForeground(new java.awt.Color(255, 255, 255));
            membersLabels[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            
           gc.fill = GridBagConstraints.BOTH;
            gc.gridx = 1;
            gc.gridy = i + 1;
            gc.gridwidth = 1;
            gc.gridheight = 1;
            gc.weightx = .5;
           
            //Display it on the screen
           this.add(membersLabels[i], gc);
        }
        
        //Set up the button for specifiec color and dimension size, font and border
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
        
        //Display back button on screen
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
       //Purpose: Modyfing tilte name
       public void setTitle(String newTitle){
        this.highScoreLabel.setText(newTitle);
    }
    //Method: setMember
    //Purpose: Modyfing the member names 
    public void setMembers(String[] newMembers){
        for(int i = 0; i < CONTRIBUTORS.length; i++){
                this.membersLabels[i].setText(newMembers[i]);
        }
    }
    
    //Method: setBackgroundColor
    //Purpose: Modyfing the back ground color
    public void setBackgroundColor(Color newColor){
        this.setBackground(newColor);
    }
}
