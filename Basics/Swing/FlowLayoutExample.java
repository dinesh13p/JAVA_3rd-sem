package Swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing event handeling");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton button1 = new JButton("Submit");
        // button1.setBounds(100, 200, 100, 70);
        frame.add(button1);

        JButton button2 = new JButton("Submit");
        // button2.setBounds(100, 300, 100, 70);
        frame.add(button2);

        JButton button3 = new JButton("Submit");
        // button3.setBounds(100, 400, 100, 70);
        frame.add(button3);

        frame.setVisible(true);
    }
    
}

