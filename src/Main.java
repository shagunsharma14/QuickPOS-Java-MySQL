import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TEST"; // Change database name
        String user = "root";
        String password = ""; // Add password if set

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("✅ MySQL Connection Successful!");
            } else {
                System.out.println("❌ Connection Failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}