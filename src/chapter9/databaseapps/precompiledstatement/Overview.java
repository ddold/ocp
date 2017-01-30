package chapter9.databaseapps.precompiledstatement;

/**
 * Created by dan on 1/30/17.
 */
public class Overview {
    /**
     * - Interfaces java.sql.PreparedStatement and java.sql.CallableStatement extend the java.sql.Statement interface
     * - The objects of interfaces PreparedStatement and CallableStatement represent precompiled SQL statements
     * - Precompiled statements execute faster than theor noncompiled counterparts
     * - Another major advantage offered by PreparedStatement and CallableStatement is their ability to include placeholders in SQL statements
     *   using ?. You can assign values to these placeholders by calling one of the appropriate setDataType(parameterIndex, value) on these objects
     * - Unlike Statement, you must specify the relevant SQL statement when you create an object of PreparedStatement
     * - PreparedStatement defines 3 methods to execute its SQL statement: execute(), executeQuery() and executeUpdate(). Method execute() can execute
     *   any type of SQL statement and returns its boolean value. Method executeQuery() executes a SQL SELECT statement and returns a ResultSet.
     *   Method executeUpdate() executes DDL statements and table INSERT, UPDATE and DELETE SQL statements. It returns 0 for DDL statements and
     *   the number of rows affected for SQL INSERT, UPDATE and DELETE statements
     * - You can execute the database-stored procedures from your Java applications by using CallableStatement in the JDBC API
     * - If a database-stored procedure doesn't accept any parameters, it's acceptable to drop the () following the procedure name in a call to
     *   execute it using CallableStatement
     * - A database stored procedure can accept multiple parameters: an IN (input) parameter to send values to the stored precedure, and an OUT
     *   (output) parameter to return values from the procedure
     * - You can define parameters of type IN, OUT and INOUT with a database stored procedure using CallableStatement
     */
}
