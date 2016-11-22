package chapter6.exceptions_and_assertions.custom_exception;

/**
 * Created by dan on 11/22/16.
 */
public class Overview {
    /**
     * - You can create a custom exception by extending java.lang.Exception or any of its subclasses
     * - You can subclass java.lang.Exception or its subclasses (which don't subclass RuntimeException) to create custom
     *   checked exceptions
     * - You can subclass java.lang.RuntimeException or its subclasses to create custom runtime exceptions
     * - You can add variables and methods to a custom exception class, like a regular class
     * - The name of an exception can convey a lot of information to other developers or users, which is one of the main
     *   reasons for defining a custom exception. A custom exception can also be used to communicate a more descriptive message
     * - Custom exceptions help you you restrict the escalation of implementation-specific exceptions to higher layers. For
     *   example, SQLException thrown by data access code can be wrapped within a custom exception and rethrown
     * - You can throw and catch custom exceptions like the other exception classes
     */
}
