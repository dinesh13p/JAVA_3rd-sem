package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutExample {
   
    
    public static void main(String[] args) {
        
        JFrame jFrame = new JFrame("Border Layout Example!!");
        jFrame.setSize(600, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(new BorderLayout());

        jFrame.setVisible(true);

        jFrame.add(new JButton("NORTH"), BorderLayout.NORTH);
        jFrame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        jFrame.add(new JButton("EAST"), BorderLayout.EAST);
        jFrame.add(new JButton("WEST"), BorderLayout.WEST);




    }
}

  
