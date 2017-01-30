package chapter9.databaseapps.transactions;

import chapter9.databaseapps.connecttodatabase.CreateConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 * Created by dan on 1/30/17.
 */
public class TransactionClass {
    static Connection connection = null;
    static Statement statement = null;

    public static void main(String [] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = CreateConnection.standardConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            int result = statement.executeUpdate
                    ("INSERT INTO people" +
                     " VALUES (3, 'Duke', 'Dog', 2)");

            Savepoint sp555 = connection.setSavepoint();

            result = statement.executeUpdate
                    ("INSERT INTO people" +
                     " VALUES (4, 'Dave', 'Kelly', 27)");

            Savepoint sp777 = connection.setSavepoint("Savepoint777");

            connection.rollback(sp777);
            connection.commit();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
