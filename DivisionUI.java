import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DivisionUI {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 5, 5));
        // Components
        JLabel label1 = new JLabel("Num1:");
        JTextField num1Field = new JTextField();
        JLabel label2 = new JLabel("Num2:");
        JTextField num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);
        JButton divideButton = new JButton("Divide");
        // Button Action
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Error: Please enter valid integers!",
                            "Number Format Error",
                            JOptionPane.ERROR_MESSAGE);

                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Error: Division by zero is not allowed!",
                            "Arithmetic Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        // Add components to frame
        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(new JLabel()); // spacer
        frame.add(divideButton);
        // Show frame
        frame.setVisible(true);
    }
}
