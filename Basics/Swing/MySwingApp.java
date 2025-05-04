package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwingApp {

    public static void main(String[] args) {
        // Create a frame
        JFrame jFrame = new JFrame("My swing application");

        // Set frame size
        jFrame.setSize(800, 600);

        // Close Operation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set default layout
        jFrame.setLayout(null);

        // Username
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(50, 40, 100, 30);
        JTextField userField = new JTextField();
        userField.setBounds(50, 70, 250, 50);

        // Password
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(400, 40, 100, 30);
        JTextField passField = new JTextField();
        passField.setBounds(400, 70, 250, 50);

        // Fullname
        JLabel fullLabel = new JLabel("Fullname");
        fullLabel.setBounds(50, 150, 100, 30);
        JTextField fullField = new JTextField();
        fullField.setBounds(50, 180, 250, 50);

        // Phone Number
        JLabel phoneLabel = new JLabel("PhoneNumber");
        phoneLabel.setBounds(400, 150, 120, 30);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(400, 180, 250, 50);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50, 270, 200, 70);

        // Add all components
        jFrame.add(userLabel);
        jFrame.add(userField);
        jFrame.add(passLabel);
        jFrame.add(passField);
        jFrame.add(fullLabel);
        jFrame.add(fullField);
        jFrame.add(phoneLabel);
        jFrame.add(phoneField);
        jFrame.add(submitButton);

        // Set visibility
        jFrame.setVisible(true);
    }
}
