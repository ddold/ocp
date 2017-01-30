package chapter9.databaseapps.introduction;

/**
 * Created by dan on 1/30/17.
 */
public class Overview {
    /**
     * - JDBC is part of the core Java API; you don't need to download it separately to use it in your Java applications
     * - By using the standard classes and interfaces from the JDBC API, Java classes can connect to a database, execute SQL, and process the results
     * - JDBC is a standard specification - any Java class can use JDBC to connect with a database using a JDBC driver
     * - Contrary to the JDBC API, JDBC drivers are external class bundles not included in the JDK
     * - JDBC has been around since 1997 and was added to JSE 1.1 as JDBC 1.0. Since its first version, multiple enhancements have been made to
     *   JDBC. Java 7 ships with JDBC 4.1
     * - JDBC classes are defined in Java packages java.sql and javax.sql
     * - You can access tabular data stored on relational databases, flat files, and Excel spreadsheets using the JDBC API
     * - JDBC provides vendor-neutral access to the common database features. So if you don't use proprietary features of a database, you can
     *   easily change the database connection, statements and result sets
     * - With the JDBC API, you have a choice of connecting to a local or remote data store either directly or through an application server
     * - JDBC drivers are the implementation of the lower-level JDBC driver API as defined in the JDBC specifications
     * - Depending on whether the drivers are implemented using only Java code, native code, or partial Java they're categorized as type 4, pure
     *   Java JDBC driver; type 3, pure Java driver for database middleware; type 2, native API, partial Java driver; and type 1, JDBC-ODBC bridge
     */
}
