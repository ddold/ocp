package chapter9.databaseapps.transactions;

/**
 * Created by dan on 1/30/17.
 */
public class Overview {
    /**
     * - A transaction is a logical set of SQL statements. Either all or one of the statements must execute from a transaction
     * - To initiate a transaction, set the default database auto-commit mode to false
     * - If the auto-commit mode of a connection is set to true, calling any of the transaction methods like commit() or rollback() will throw
     *   an SQLException
     * - Method executeUpdate() returns a count of the rows that are or would be affected by the database for row insertions, modifications and
     *   deletion. The value is returned even if the statement isn't committed to the database
     * - By using a savepoint, you can exercise finer control over the work done by a set of SQL statements in a transaction
     */
}
