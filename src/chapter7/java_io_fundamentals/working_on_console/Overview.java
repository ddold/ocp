package chapter7.java_io_fundamentals.working_on_console;

/**
 * Created by dan on 12/17/16.
 */
public class Overview {
    /**
     * - The java.io.Console defines methods to access the character-based console device associated with the
     *   current JVM
     * - You may or may not be able to access the console associated with a JVM, depending on the underlying
     *   platform and how the JVM was started
     * - If you invoke a JVM from the command line without redirecting the standard input and output streams,
     *   you'll be able to access the console, which will typically be connected ot the keyboard and display
     *   from which the virtual machine was launched
     * - You may not be able to access the console associated with a JVM if it started automatically as a result
     *   of the execution of some other program
     * - You will not get access to the console when using IDEs like Eclipse
     * - You can access an object of class Console by calling System.console()
     * - If no console device is available, System.console() returns null. A null value signals that either
     *   the program was launched in a noninteractive environment or perhaps the underlying operating system
     *   doesn't support the console operations
     * - You can't create an object of console itself. Class Console doesn't define a public constructor
     */
}
