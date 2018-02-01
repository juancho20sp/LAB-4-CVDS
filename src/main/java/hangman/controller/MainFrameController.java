/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.controller;

import java.awt.CardLayout;
import javax.swing.JPanel;
import hangman.model.MainFrameModel;
import hangman.view.MainFrame;


/**
 *
 * @author Omar
 */
public class MainFrameController{
    private MainFrameModel model;
    private MainFrame frame;
    
    
    public MainFrameController(MainFrameModel model,MainFrame frame){
        this.model = model;
        this.frame = frame;
        setup();
    }
    
    private void setup(){
        frame.setTitle(model.getTitle());
        frame.setSize(model.getWindowWidth(),model.getWindowHeight());
        frame.setLocationRelativeTo(model.getPositionReference());
        frame.setDefaultCloseOperation(model.getActionOnClose());
    }
    
    public void changeVisibleCard(String key){
        ((CardLayout)frame.getContainer().getLayout()).show(frame.getContainer(),key);
    }
    
    public void addPanel(JPanel panel, String key){
        frame.getContainer().add(panel, key);
    }

    public MainFrameModel getModel() {
        return model;
    }

    public void setModel(MainFrameModel model) {
        this.model = model;
    }

    public MainFrame getFrame() {
        return frame;
    }

    public void setFrame(MainFrame frame) {
        this.frame = frame;
    }
    
    public void setWindowTitle(String newTitle){
        model.setTitle(newTitle);
        frame.setTitle(model.getTitle());
    }
}
