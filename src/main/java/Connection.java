import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String DB_URL ="jdbc:mysql://localhost/human-resource?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static java.sql.Connection connection;
    public static java.sql.Connection getConnection()throws SQLException {
        if (connection == null){
            System.out.println("Khởi tạo kết nối mới tới database");
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        }
        return connection;
    }
}
