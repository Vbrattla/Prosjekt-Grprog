package prosjekt;
import java.awt.*;
import javax.swing.*;


public class Main {
    
 

    public static void main(String[] args) {
        
        JFrame frame = new JFrame ("Læringsunivers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1400, 800));
        
        JPanel hovedmeny = new JPanel();
        
       
        JButton b1 = new JButton("Astronomi");
        JButton b2 = new JButton("Matematikk");
        JButton b3 = new JButton("Diverse");
        
        
        hovedmeny.add(b1, BorderLayout.WEST);
        b1.setPreferredSize(new Dimension(450, 800));
        hovedmeny.add(b2, BorderLayout.CENTER);
        b2.setPreferredSize(new Dimension(450, 800));
        hovedmeny.add(b3, BorderLayout.EAST);
        b3.setPreferredSize(new Dimension(450, 800));
        
        
        frame.getContentPane().add(hovedmeny);
        frame.pack();
        frame.setVisible(true);
        
}

    