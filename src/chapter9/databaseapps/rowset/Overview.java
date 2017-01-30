package chapter9.databaseapps.rowset;

/**
 * Created by dan on 1/30/17.
 */
public class Overview {
    /**
     * - You can use RowSet objects as JavaBeans components, which can be created and configured at design time
     * - You can configure a RowSet object by setting its properties, connecting to a JDBC data source, executing a SQL statement and getting
     *   the results
     * - The interface javax.sql.RowSet extends the interface java.sql.ResultSet
     * - You can register listeners with a RowSet object so that when an event occurs on a RowSet object (like any modification to its value), the
     *   registered listeners can be notified
     * - RowSet objects can be connected or disconnected. A connected RowSet object like JdbcRowSet, maintains a connection with its data source
     *   throughout its life. On the other hand, a disconnected RowSet object, like CachedRowSet, establishes a connection with the data source, gets
     *   the values and then disconnects itself
     * - The interface javax.sql.rowset.RowSetFactory defines the implementation of a factory that can be used to obtain different types of RowSet
     *   implementations
     * - Class javax.sql.rowset.RowSetProvider defines factory methods to get a RowSetFactory implementation. The RowSetFactory can then be used to create
     *   objects off different types of RowSet implementations. The Java API defines a default implementation of RowSetFactory
     * - If the execute method isn't successful on a RowSet object, you can only call execute and close methods on it. The rest of the methods will
     *   throw an exception
     */
}
