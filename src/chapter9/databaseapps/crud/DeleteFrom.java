package chapter9.databaseapps.crud;

import chapter9.databaseapps.connecttodatabase.CreateConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dan on 1/30/17.
 */
public class DeleteFrom {
    Connection connection = null;

    public int deleteRow(){
        int ret = 0;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = CreateConnection.standardConnection();
            statement = connection.createStatement();

            ret = statement.executeUpdate
                    ("DELETE FROM people " +
                     "WHERE id = 2");

            System.out.println(ret);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public static void main(String [] args){
        DeleteFrom deleteFrom = new DeleteFrom();
        deleteFrom.deleteRow();
    }
}
