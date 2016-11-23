package chapter6.exceptions_and_assertions.try_with_resources;

/**
 * Created by dan on 11/23/16.
 */
public class Overview {
    /**
     * - You can use try with resources statement to define resources with a try statement that will automatically closed after
     *   the try block completes its execution
     * - The try with resources is a type of try statement that can declare one or more resources
     * - A resource is an object such as file handlers, databases or network connections, which should be closed after its no
     *   longer required
     * - A resource must implement the java.lang.AutoCloseable interface or any of the subinterfaces (directly or indirectly)
     *   to be eligible to be declared by a try with resources statement
     * - The java.lang.AutoClosable interface defines method close()
     * - If declared within the try with resources statement, a resource is automatically closed by calling its close() method
     *   at the end of the try block
     * - If method close() throws any exception, it should be taken care of by the method that defines the try block; the method
     *   must either catch it or declare it to be thrown
     * - A try with resources block might not be followed by a catch or a finally block. This is unlike a regular try block,
     *   which must be followed by either a catch or a finally block
     * - The resource declared by the try with resources is closed immediately after the completion of the try block. Its scope
     *   is limited to the try block, and if you try to access it outside the try block your code won't compile
     * - The variables used to refer to resources are implicitly final variables. You must declare and initialize resources in
     *   the try with resources statement
     * - It's acceptable to the Java compiler to initialize the resources in a try with resources statement to null, only as long
     *   as they aren't being assigned a value in the try block
     * - You can initialize multiple resources in a try with resources statement, separated by a semicolon (;). The semicolon
     *   after the last resource is optional
     * - Multiple classes like FileInputStream and FileOutputStream from file I/O implement the java.lang.Closable interface,
     *   which extends the java.lang.AutoClosable interface
     */
}
