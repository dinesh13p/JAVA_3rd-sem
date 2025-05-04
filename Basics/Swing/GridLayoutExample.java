package Swing;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutExample {
    public static void main(String[] args) {
        
        JFrame jFrame = new JFrame("Grid Layout Example");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(new GridLayout(2, 3));
        
        for(int i = 1; i<= 10; i++){
            jFrame.add(new JButton("Button"+ i));
        }

        jFrame.setVisible(true);
    }
    
}
