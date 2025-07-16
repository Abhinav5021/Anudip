import java.sql.*;
import javax.swing.*;

public class dbconn {
    public static void main(String args[]) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/";

            String databaseName = "Test";
            String userName = "root";
            String password = "root";
            String tableName = "employee";
            String c1, c2, c3;
            c1 = "Number";
            c2 = "Name";
            c3 = "ID";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);

            String sql = "CREATE DATABASE " + databaseName;
            String del = "drop DATABASE " + databaseName;
            Statement statement = connection.createStatement();
            statement.executeUpdate(del);
            statement.executeUpdate(sql);
            sql = "use " + databaseName;
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Database Connection Successfull and Database Created..!!");

            sql = "Create Table " + tableName + "(" + c1 + " varchar(255), " + c2 + " varchar(255), " + c3
                    + " varchar(255) )";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Table Created Successfully..!!");

            String num = "1", Name = "Abhinav", ID = "24238";
            sql = "insert into " + tableName + "(Number,Name,ID) values('" + num + "','" + Name + "','" + ID + "')";
            statement.executeUpdate(sql);

            sql = "SELECT * FROM employee";

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String number = rs.getString("Number");
                String name = rs.getString("Name");
                String id = rs.getString("ID");

                System.out.println("Number: " + number + ", Name: " + name + ", ID: " + id);
            }

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
