package chapter9.databaseapps.connecttodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by dan on 1/30/17.
 */
public class CreateConnection {
    private static Connection connection = null;

    public static void main(String [] args){
        connection = standardConnection();

        System.out.println(connection);
    }

    public static Connection thirdConnection(){
        Connection connection = null;
        try {
            Properties properties = new Properties();
            properties.put("user", "ddold");
            properties.put("password", "Duke20!5");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sample", properties);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection anotherConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sample?user=ddold&password=Duke20!5");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection standardConnection(){
        Connection connection = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/sample";
            String username = "ddold";
            String password = "Duke20!5";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

/**
 * ________________________________________________________________________________________________
 * | JDBC 3.0 and before | Step 1 - Load and register driver - Class.forName("----");             |
 * |                     | Step 2 - Establish DB connection - DriverManager.getConnection("---"); |
 * |---------------------|------------------------------------------------------------------------|
 * | JDBC 4.0 and later  | Step 1 - Load and register driver and establish DB connection          |
 * |                     | DriverManager.getConnection("---")                                     |
 * |_____________________|________________________________________________________________________|
 *
 *
 * Overloaded getConnection() methods
 * - public static Connection getConnection(String url) throws SQLException
 * - public static Connection getConnection(String url, Properties info) throws SQLException
 * - public static Connection getConnection(String url, String user, String pwd) throws SQLException
 *
 * JDBC URL spec
 * - jdbc:subprotocol://<host>:<port>/<database_name>
 */
