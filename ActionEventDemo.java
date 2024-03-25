import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventDemo extends JFrame {
    JButton button;
    int count;
    public ActionEventDemo() {
        button = new JButton("Click");
        count = 0;

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                repaint();
            }
        });
        add(button);
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Button clicked: " + count + " times", 50, 100);
    }

    public static void main(String args[]) {
        new ActionEventDemo();
    } 
}