/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.view;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Omar
 */
public class MainFrame extends JFrame{
    private JPanel container;
    public MainFrame(){
        setTitle("PLACEHOLDER");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        container = new JPanel(new CardLayout());
        this.add(container);
    }
    
    public void addPanel(JPanel panel,String key){
        container.add(panel,key);
    }

    public JPanel getContainer() {
        return container;
    }

    public void setContainer(JPanel container) {
        this.container = container;
    }
    
    
}