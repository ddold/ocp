package chapter9.databaseapps.connecttodatabase;

/**
 * Created by dan on 1/30/17.
 */
public class Overview {
    /**
     * - The first step to make a Java class communicate with a database is to establish a connection between them
     * - Class java.sql.DriverManager talks with the JDBC driver to return a Connection object, which can be used by your Java classes for all
     *   further communication with a database
     * - For the exam, it's important to note the difference between a JDBC driver (lower case d) and a Driver (uppercase D). A JDBC driver is a
     *   set of classes provided by the database vendor or a third party, usually in a .jar or .zip file, to support the JDBC API. A Driver class
     *   is an implementation of the interface java.sql.Driver
     * - To connect with a data source, you need class DriverManager only once
     * - Manual loading of drivers is required for the JDBC API version 3.0 and before
     * - JDBC drivers should be manually loaded by calling Class.forName(), passing it the name of the Driver class
     * - If Class.forName() can't load the JDBC drivers, it throws a ClassNotFoundException (a checked exception)
     * - For JDBC API 4.0 and later, JDBC drivers can be automatically loaded and registered by class DriverManager
     * - When a class is loaded in memory, its static initializer block executes. According to the JDBC specifications, a driver must register
     *   itself with the DriverManager
     * - The JVM loads class DriverManager when you call any of its methods
     * - Class DriverManager manages all the instances of JDBC driver implementations registered with a system
     * - When you invoke method getConnection(), class DriverManager finds the appropriate drivers from its set of registered drivers, establishes
     *   a connection with a database, and returns the Connection object
     * - There are three overloaded versions of method getConnection()
     * - You can connect to a database by including the username and password as part of the JDBC connect URL string
     * - It's common to use Properties to specify the login credentials for the JDBC URL in method getConnection()
     * - The property names for specifying the username and password to establish a connection are "user" and "password". An attempt to use any
     *   other key to specify and use username and password will throw SQLException
     * - If your application can't load a JDBC driver or connect to a database due to invalid login credentials, it will throw an exception
     */
}
