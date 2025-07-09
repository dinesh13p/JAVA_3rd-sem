import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Create components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Greet");
        JLabel outputLabel = new JLabel();

        // Add event handling for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText().trim();
                if (!name.isEmpty()) {
                    outputLabel.setText("Hello, " + name + "!");
                } else {
                    outputLabel.setText("Please enter your name.");
                }
            }
        });

        // Layout management
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(label);
        inputPanel.add(textField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(button);

        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(outputLabel);

        // Add panels to the frame
        frame.setLayout(new BorderLayout());
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(outputPanel, BorderLayout.SOUTH);

        // Show the frame
        frame.setVisible(true);
    }
}
