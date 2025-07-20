import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class LoginPage extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public LoginPage() {
        setupDatabase();

        // GUI
        setTitle("Airline Reservation - Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        JButton loginBtn = new JButton("Login");
        JButton exitBtn = new JButton("Exit");
        add(loginBtn);
        add(exitBtn);

        loginBtn.addActionListener(e -> login());
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void setupDatabase() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=root");
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS AirlineDB");

            stmt.close();
            conn.close();

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AirlineDB", "root", "root");
            stmt = conn.createStatement();

            String userTable = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "username VARCHAR(50) NOT NULL, " +
                    "password VARCHAR(50) NOT NULL)";
            stmt.executeUpdate(userTable);

            String checkUser = "SELECT * FROM users WHERE username='admin'";
            ResultSet rs = stmt.executeQuery(checkUser);
            if (!rs.next()) {
                String insertUser = "INSERT INTO users (username, password) VALUES ('admin', 'admin123')";
                stmt.executeUpdate(insertUser);
            }

            stmt.close();
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DB Setup Failed: " + ex.getMessage());
        }
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AirlineDB", "root", "root");

            String query = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                conn.close();
                this.dispose();
                new Dashboard();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        }
    }

    public class Dashboard extends JFrame {
        public Dashboard() {
            setTitle("Airline Dashboard");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            JLabel label = new JLabel("Welcome to Airline Reservation System");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            add(label);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginPage::new);
    }
}
