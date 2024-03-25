import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DateInsertionGUI extends JFrame {
    private JTextField dateField;
    private JButton insertButton;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public DateInsertionGUI() {
        setTitle("Date Insertion");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initializeComponents();
        createDatabaseConnection();

        setVisible(true);
    }

    private void initializeComponents() {
        dateField = new JTextField(10);
        insertButton = new JButton("Insert");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertDate();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Date:"));
        panel.add(dateField);
        panel.add(insertButton);

        getContentPane().add(panel);
    }

    private void createDatabaseConnection() {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root@localhost";
        String password = "sahil123";

        try {
            connection = DriverManager.getConnection(url, user, password);
            preparedStatement = connection.prepareStatement("INSERT INTO mytable (date_column) VALUES (?)");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to database.");
            System.exit(1);
        }
    }

    private void insertDate() {
        String date = dateField.getText();
        try {
            // Assuming date_column is of DATE type in MySQL
            preparedStatement.setDate(1, java.sql.Date.valueOf(date));
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Date inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to insert date into database.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DateInsertionGUI();
            }
        });
    }
}
