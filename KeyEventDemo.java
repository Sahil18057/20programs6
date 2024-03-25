
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class KeyEventDemo extends JFrame {
    JTextField textField;
    String str = "";

    public KeyEventDemo() {
        setLayout(new FlowLayout());
        textField = new JTextField(10); 
        add(textField);

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                str = "Key Typed: " + e.getKeyChar();
                repaint();
            }

            public void keyPressed(KeyEvent e) {
                str = "Key Pressed: " + e.getKeyChar();
                repaint();
            }

            public void keyReleased(KeyEvent e) {
                str = "Key Released: " + e.getKeyChar();
                repaint();
            }
        });

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(str, 50, 100);
    }

    public static void main(String args[]) {
        new KeyEventDemo();
    }
}
