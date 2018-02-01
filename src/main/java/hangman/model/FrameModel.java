/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

import javax.swing.JComponent;

/**
 *
 * @author Omar
 */
abstract public class FrameModel {
    public String title;
    public int windowWidth;
    public int windowHeight;
    public JComponent positionReference;
    public int actionOnClose;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public JComponent getPositionReference() {
        return positionReference;
    }

    public void setPositionReference(JComponent positionReference) {
        this.positionReference = positionReference;
    }

    public int getActionOnClose() {
        return actionOnClose;
    }

    public void setActionOnClose(int actionOnClose) {
        this.actionOnClose = actionOnClose;
    }
}
