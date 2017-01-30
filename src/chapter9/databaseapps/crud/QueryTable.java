package chapter9.databaseapps.crud;

import chapter9.databaseapps.connecttodatabase.CreateConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dan on 1/30/17.
 */
public class QueryTable {
    Connection connection = null;

    public void query(){
        ResultSet res = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = CreateConnection.standardConnection();
            statement = connection.createStatement();

            res = statement.executeQuery("SELECT * FROM people where id = 1");

            while(res.next()){
                System.out.println("id:\t\t" + res.getInt("id"));
                System.out.println("fname:\t" + res.getString("fname"));
                System.out.println("lname:\t" + res.getString("lname"));
                System.out.println("age:\t" + res.getInt("age"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String [] args){
        QueryTable queryTable = new QueryTable();
        queryTable.query();
    }
}
