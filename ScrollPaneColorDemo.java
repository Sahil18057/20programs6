import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class ScrollPaneColorDemo {

     static Container cp;
    public static void main(String args[]) {

        JFrame frm = new JFrame("Color Choice");
        cp = frm.getContentPane( );
        cp.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        cp.add(scrollPane, BorderLayout.CENTER);

        JButton button = new JButton("Select Color");
        cp.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog(frm,"Choose a color", Color.white);
                scrollPane.setBackground(c);
                textArea.setBackground(c);
            }
        });

        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
