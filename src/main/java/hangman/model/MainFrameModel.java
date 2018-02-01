/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

import javax.swing.JComponent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Omar
 */
public class MainFrameModel extends FrameModel{
    
    public MainFrameModel(){
        this.title = "Default Title";
        this.windowWidth = 600;
        this.windowHeight = 400;
        this.positionReference = null;
        this.actionOnClose = EXIT_ON_CLOSE;
    }
    
    public MainFrameModel(String title,int windowWidth,int windowHeight,
            JComponent positionReference,int actionOnClose){
        this.title = title;
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.positionReference = positionReference;
        this.actionOnClose = actionOnClose;
        
    }
}
