/***************************************************************
* file: GamePanel.java
* author:   Christopher Santos
*           Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the view component for the game screen
*
****************************************************************/ 
package hangman.view;

import com.google.inject.Inject;
import hangman.model.Language;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    private JButton skipButton;
    private JLabel gameNameLabel;
    private JLabel dateTimeLabel;
    private JLabel points;
    private JPanel keyboard;
    
    
    private HangmanPanel hmPanel;
    private Language lan;
    
    private JPanel blanksHolder;
    private JButton[] keyboardButtonArray;
    private ArrayList<LetterBlankPanel> blanksArrayList;
    private List<Character> characterSet;
    
    
    public GamePanel(List<Character> characterSet,HangmanPanel hmPanel,Language lan) {
        this.hmPanel=hmPanel;
        this.lan=lan;
        blanksHolder = new JPanel();
        blanksArrayList = new ArrayList<>();
        keyboardButtonArray = new JButton[characterSet.size()];
        gameNameLabel = new JLabel("Placeholder");
        gameNameLabel.setForeground(new Color(30,144,255));
        gameNameLabel.setFont(new Font("Impact", Font.PLAIN,24));
        dateTimeLabel =  new JLabel("Placeholder");
        points  = new JLabel("Placeholder");
        skipButton = new JButton(lan.getBackSkypeButtonLabel()[1]);
        this.characterSet = characterSet;
        initComponents();
    }
                        
    //initComponents
    //purpose: set up game button and graphics display arrangement
    private void initComponents() {
        
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        //top field
        JPanel topContainer = new JPanel();
        topContainer.setLayout(new BoxLayout(topContainer, BoxLayout.X_AXIS));
        topContainer.add(gameNameLabel);
        topContainer.add(new JPanel());
        topContainer.add(dateTimeLabel);
        this.add(topContainer, BorderLayout.PAGE_START);
        
        //center field
        this.add(hmPanel, BorderLayout.CENTER);
        
        //left field
        this.add(points,BorderLayout.LINE_START);
        
        //right field
        JPanel rightContainer = new JPanel();
        rightContainer.setLayout(new BoxLayout(rightContainer,BoxLayout.Y_AXIS));
        rightContainer.add(skipButton);
        this.add(rightContainer, BorderLayout.LINE_END);
        
        //bottom field
        JPanel bottomContainer = new JPanel();
        bottomContainer.setLayout(new GridLayout(2,1));
        
        blanksHolder.setLayout(new GridLayout(1,8));
        bottomContainer.add(blanksHolder);
        
        JPanel keyboard = new JPanel();
        keyboard.setLayout(new GridLayout(3,1));
        int i = 0;
        for(char c : characterSet){
            keyboardButtonArray[i] = new JButton(Character.toString(c));
            keyboard.add(keyboardButtonArray[i]);
            i++;
        }
        bottomContainer.add(keyboard);
        
        this.add(bottomContainer, BorderLayout.PAGE_END);
    }

    //method: setDateTime
    //purpose; set date label text
    public void setDateTime(String dateTime){
        dateTimeLabel.setText(dateTime);
    }

    //method: getSkipButton
    //purpose: return reference to skip button
    public JButton getSkipButton() {
        return skipButton;
    }
    
    //method: getKeyboardButtonArray
    //purpose: return reference to array of key buttons
    public JButton[] getKeyboardButtonArray() {
        return keyboardButtonArray;
    }

    //method: getPoints
    //purpose return reference to points label
    public JLabel getPoints() {
        return points;
    }

    //method: setPoints
    //purpose: set points label
    public void setPoints(JLabel points) {
        this.points = points;
    }

    //method: getGameNameLabel
    //purpose return reference to game name label
    public JLabel getGameNameLabel() {
        return gameNameLabel;
    }
    
    //method: getBlanksArrayList
    //purpose return reference to arraylist containing references to line blank 
    // panels
    public ArrayList<LetterBlankPanel> getBlanksArrayList() {
        return blanksArrayList;
    }

    //method: addBlanks
    //purpose: add the desired number of blanks to the blanks panel
    public void addBlanks(int numberOfBlanks){
        blanksHolder.removeAll();
        blanksArrayList.removeAll(blanksArrayList);
        for(int i = 0; i<numberOfBlanks; i++){
            LetterBlankPanel blank = new LetterBlankPanel();
            blanksHolder.add(blank);
            blanksArrayList.add(blank);
        }
    }

    //method: getHmPanel
    //purpose: return reference to HangmanPanel
    public HangmanPanel getHmPanel() {
        return hmPanel;
    }
    
}