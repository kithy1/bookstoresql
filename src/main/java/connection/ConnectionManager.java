package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/bookstore14?useSSL=false",
                        "root","root");
    }
}
