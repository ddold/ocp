package chapter9.databaseapps.interfacesofjdbcapicore;

/**
 * Created by dan on 1/30/17.
 */
public class Overview {
    /**
     * - The interfaces that make up the core of the JDBC API are java.sql.Driver, java.sql.Connection, java.sql.Statement, java.sql.ResultSet
     *   and javax.sql.RowSet
     * - Every JDBC driver implementation must implement the interface Driver
     * - Every driver must implement a minimum set of interfaces defined in the JDBC API to conform to the JDBC specifications
     * - Connection represents a connection session with the specified database. It's used to create SQL statements, execute them against the
     *   database, start and commit transactions and retrieve other details
     * - The interface Statement is used to create and execute static SQL statements and retrieve their results
     * - Interfaces PreparedStatement and CallableStatement extend Statement interface. They represent precompiled statements
     * - PreparedStatement can be used to execute static or dynamic SQL statements
     * - CallableStatement is used to execute stored procedures
     * - A ResultSet retrieved as a result of executing a SQL SELECT statement against a database. It represents a table of data
     */
}
