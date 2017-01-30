package chapter9.databaseapps.crud;

/**
 * Created by dan on 1/30/17.
 */
public class Overview {
    /**
     * - To create a Statement object call method createStatement() on a Connection object
     * - To define and execute a static SQL statement for a Statement object, call executeQuery() or executeUpdate() on Statement
     * - Method executeQuery() returns ResultSet
     * - Method executeUpdate() returns an int value specifying the number of affected rows
     * - Method executeUpdate() is used to execute SQL queries to insert new rows in a table and update and delete existing rows. It's also used
     *   to execute DDL queries like the creation, modification and deletion of database objects like tables. If you use method executeQuery() for
     *   any of these operations, you'll get a SQLException at runtime
     * - The SQL statements that you include un your code are defined as string values. This essentially means that if any of the SQL statement is
     *   invalid, no compilation error is thrown
     * - If a SQL SELECT returns no rows, ResultSet doesn't refer to a null value. It refers to an initialized ResultSet object with zero rows
     * - Connection, Statement and ResultSet objects should be closed by calling their method close() either implicitly or explicitly
     * - If you create Connection, Statement and ResultSet objects using a try-with-resources statement, it will auto-close them
     */
}
