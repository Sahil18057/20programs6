import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorChange extends JFrame {
    JButton button;
    public ColorChange() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        button = new JButton("Click");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BackgroundColor();
            }
        });

        add(button);
        setVisible(true);
    }

    public void BackgroundColor() {
        Random rand = new Random();
        Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        getContentPane().setBackground(randomColor);
    }

    public static void main(String args[]) {
                new ColorChange(); 
    }
}
