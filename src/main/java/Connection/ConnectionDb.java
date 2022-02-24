package Connection;

import java.sql.*;

public class ConnectionDb {
    public static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/movierental";
        String user = "root";
        String password = "QWer12#$";
        return DriverManager.getConnection(url,user,password);
    }
}
