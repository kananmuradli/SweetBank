/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.settings;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class IconSettings {
    
    private static Icon originalIcon;
    
    public static void changeIcon(JLabel label, String fileName){
        originalIcon = label.getIcon();
        label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("/gui/icons/" + fileName+".png")));
    }
    
    public static void setOriginalIcon(JLabel label){
        label.setIcon(originalIcon);
    }
    
}
