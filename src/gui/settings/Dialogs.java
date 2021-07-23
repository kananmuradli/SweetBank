/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.settings;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Dialogs {
    
    public static void notEmptyMessage(JFrame frame){
        JOptionPane.showMessageDialog(frame, "All fields must be filled");
    }
    
    public static void showSpecialMessage(JFrame frame, String message){
        JOptionPane.showMessageDialog(frame, message);
    }
  
}
