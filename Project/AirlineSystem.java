import java.sql.*;
import java.util.*;

public class AirlineSystem {
    static final String DB_URL = "jdbc:mysql://localhost:3306/airline";
    static final String USER = "root";
    static final String PASS = "root";

    static Connection conn;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database.");

            int choice;
            do {
                System.out.println("\n--- Airline Reservation System ---");
                System.out.println("1. Add Flight");
                System.out.println("2. View All Flights");
                System.out.println("3. Search Flights");
                System.out.println("4. Book Ticket");
                System.out.println("5. View Bookings");
                System.out.println("6. Cancel Booking");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> addFlight();
                    case 2 -> viewFlights();
                    case 3 -> searchFlights();
                    case 4 -> bookTicket();
                    case 5 -> viewBookings();
                    case 6 -> cancelBooking();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice.");
                }
            } while (choice != 0);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addFlight() throws SQLException {
        System.out.print("Flight Number: ");
        String fn = sc.nextLine();
        System.out.print("Source: ");
        String src = sc.nextLine();
        System.out.print("Destination: ");
        String dest = sc.nextLine();
        System.out.print("Departure Time: ");
        String dep = sc.nextLine();
        System.out.print("Arrival Time: ");
        String arr = sc.nextLine();

        String sql = "INSERT INTO flights (flight_number, source, destination, departure_time, arrival_time) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, fn);
        ps.setString(2, src);
        ps.setString(3, dest);
        ps.setString(4, dep);
        ps.setString(5, arr);
        ps.executeUpdate();
        System.out.println("Flight added successfully.");
    }

    static void viewFlights() throws SQLException {
        String sql = "SELECT * FROM flights";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n--- Flight List ---");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") +
                    ", Flight No: " + rs.getString("flight_number") +
                    ", From: " + rs.getString("source") +
                    ", To: " + rs.getString("destination") +
                    ", Departure: " + rs.getString("departure_time") +
                    ", Arrival: " + rs.getString("arrival_time"));
        }
    }

    static void searchFlights() throws SQLException {
        System.out.print("Enter Source: ");
        String src = sc.nextLine();
        System.out.print("Enter Destination: ");
        String dest = sc.nextLine();

        String sql = "SELECT * FROM flights WHERE source = ? AND destination = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, src);
        ps.setString(2, dest);
        ResultSet rs = ps.executeQuery();

        System.out.println("\n--- Matching Flights ---");
        boolean found = false;
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") +
                    ", Flight No: " + rs.getString("flight_number") +
                    ", Departure: " + rs.getString("departure_time") +
                    ", Arrival: " + rs.getString("arrival_time"));
            found = true;
        }
        if (!found) {
            System.out.println("No flights found.");
        }
    }

    static void bookTicket() throws SQLException {
        viewFlights();
        System.out.print("\nEnter Flight ID to book: ");
        int flightId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        String sql = "INSERT INTO bookings (passenger_name, flight_id) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, flightId);
        ps.executeUpdate();
        System.out.println("Ticket booked successfully.");
    }

    static void viewBookings() throws SQLException {
        String sql = "SELECT b.id, b.passenger_name, f.flight_number, f.source, f.destination FROM bookings b JOIN flights f ON b.flight_id = f.id";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n--- Bookings ---");
        while (rs.next()) {
            System.out.println("Booking ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("passenger_name") +
                    ", Flight No: " + rs.getString("flight_number") +
                    ", From: " + rs.getString("source") +
                    ", To: " + rs.getString("destination"));
        }
    }

    static void cancelBooking() throws SQLException {
        viewBookings();
        System.out.print("Enter Booking ID to cancel: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM bookings WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Booking cancelled.");
        } else {
            System.out.println("Booking ID not found.");
        }
    }
}
