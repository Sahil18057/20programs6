import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocusEventDemo extends JFrame implements FocusListener {
    JTextField textField;
    JTextArea textArea;

    public FocusEventDemo() {
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField = new JTextField(30);
        textField.addFocusListener(this);
        textArea = new JTextArea(5, 20);
        textArea.addFocusListener(this);
        setLayout(new FlowLayout());
        add(textField);
        add(textArea);

        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        if (e.getSource() == textField) {
            textField.setText("Focus gained here");
        } else if (e.getSource() == textArea) {
            textArea.setText("Focus gained here");
        }
    }

    public void focusLost(FocusEvent e) {
        if (e.getSource() == textField) {
            textField.setText("Focus lost here");
        } else if (e.getSource() == textArea) {
            textArea.setText("Focus lost here");
        }
    }

    public void focusFirst(FocusEvent e) {
        System.out.println("Focus first: " + e.getComponent().getClass().getSimpleName());
    }

    public void focusLast(FocusEvent e) {
        System.out.println("Focus last: " + e.getComponent().getClass().getSimpleName());
    }

    public static void main(String args[]) {
        new FocusEventDemo();
    }

}
