import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SelectionEventDemo extends JFrame implements ListSelectionListener {
    JList<String> list;
    JLabel label;
    	SelectionEventDemo() {
        setLayout(new FlowLayout());
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] data = {"Option 1", "Option 2", "Option 3", "Option 4"};
        list = new JList<>(data);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);

        label = new JLabel("Selected: ");
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list));
        panel.add(label);
        add(panel);
        setVisible(true);
    }
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selectedOption = list.getSelectedValue();
            label.setText("Selected: " + selectedOption);
        }
    }
    public static void main(String args[]) {
        new SelectionEventDemo();
    }
}
