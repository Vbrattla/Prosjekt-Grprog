/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prosjekt;
import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout.*;

/**
 *
 * @author Vegard
 */
public class BorderPanel {
    
    public BorderPanel(){
        
      
        
        JButton b1 = new JButton("Astronomi");
        JButton b2 = new JButton("Matematikk");
        JButton b3 = new JButton("Diverse");
        
        add (b1, BorderLayout.LINE_START);
        add (b2, BorderLayout.CENTER);
        add (b3, BorderLayout.LINE_END);
    }
}
