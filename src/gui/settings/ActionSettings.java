/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.settings;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ActionSettings {
    
    public static void setVisible(JFrame oldFrame, JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
    
}
