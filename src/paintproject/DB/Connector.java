
package paintproject.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connector {
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/paint_db";
    static final String USER = "root";
    static final String PASS = "930";

    static Connection conn = null;
    static Statement stmt = null;

    public static void connect() {

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            System.out.println("Connected...!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void close() {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException se2) {
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
        }
    }

    public static void updateQuery(String query) {
        try {
            connect();
            stmt.executeUpdate(query);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ResultSet getFromDB(String query) {
        ResultSet rs = null;
        try {
            connect();
            rs = stmt.executeQuery(query);

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
}
