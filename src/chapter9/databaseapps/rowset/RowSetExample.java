package chapter9.databaseapps.rowset;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * Created by dan on 1/30/17.
 */
public class RowSetExample {
    public static void main(String [] args){
        JdbcRowSet jdbcRowSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            jdbcRowSet = rowSetFactory.createJdbcRowSet();

            jdbcRowSet.setUrl("jdbc:mysql://127.0.0.1:3306/sample");
            jdbcRowSet.setUsername("ddold");
            jdbcRowSet.setPassword("Duke20!5");
            jdbcRowSet.setCommand("SELECT * FROM people");
            jdbcRowSet.execute();

            while(jdbcRowSet.next()){
                System.out.println("id:\t\t" + jdbcRowSet.getInt("id"));
                System.out.println("fname:\t" + jdbcRowSet.getString("fname"));
                System.out.println("lname:\t" + jdbcRowSet.getString("lname"));
                System.out.println("age:\t" + jdbcRowSet.getInt("age"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                jdbcRowSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
