package chapter6.exceptions_and_assertions.try_with_multi_catch;

/**
 * Created by dan on 11/23/16.
 */
public class Overview {
    /**
     * - A multi catch handler can be used to handle more than one unrelated exception
     * - To catch multiple exceptions in a single handler, separate the exceptions in a list by using the pipe (|)
     * - A finally block can follow a multi catch block, like a regular catch block
     * - The exceptions that you can catch in a multi catch block can't share inheritance relationship. If you try to do so
     *   your code won't compile
     * - You can combine multi catch and single catch blocks
     * - The same rules apply when combining multi catch and single catch blocks - that is more specific exceptions at the
     *   top and more general ones at the bottom
     * - You must define a single exception variable in a multi catch block
     * - In a multi catch block the variable that accepts the exception object is implicitly final
     * - In a multi catch block the type of variable that accepts the exception object is the most specific, common super type
     *   of all featured classes. Most of the time it's likely to be Exception but it could be more specific (for example
     *   IOException for classes FileNotFoundException and EOFException). If the exception classes implement a common
     *   interface, then the variable is of an intersection type with the exception class and interface as its bounds
     * - Multi catch blocks save you from duplicating code, if you need to execute the same code for handling multiple exceptions
     */
}
