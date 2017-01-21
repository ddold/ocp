package chapter10.threads.protectshareddata;

/**
 * Created by dan on 1/21/17.
 */
public class Overview {
    /**
     * - Interleaving of multiple threads that manipulate shared data using multiple steps leads to thread interference
     * - A simple statement like incrementing a variable value might involve multiple steps like loading of the variable value from memory
     *   to registers (working space), incrementing the value, and reloading the new value in memory
     * - When multiple threads execute this seemingly atomic statement, they might interleave, resulting in incorrect variable values
     * - Making your applications thread safe means securing your shared data so that it stores correct data, even when it's accessed by multiple threads
     * - Thread safety isn't about safe threads - it's about safeguarding your shared data that might be accessible to multiple threads
     * - A thread-safe class stores correct data without requiring calling classes to guard it
     * - You can lock objects by defining synchronized methods and synchronized statements
     * - Synchronized methods are defined by prefixing the definition of a method with the keyword synchronized. You can define both instance and
     *   static methods as synchronized methods
     * - For non-static synchronized methods, a thread locks the monitor of the object on which the synchronized method is called. To execute static
     *   synchronized methods, a thread locks the monitor associated with the Class object of its class
     * - A thread releases the lock on an object monitor after it exits a synchronized method, whether due to successful completion or due to an
     *   exception
     * - To execute synchronized statements, a thread must acquire a lock on an object monitor. For instance methods an implicit lock is acquired
     *   on the object on which its called. For synchronized statements, you can specify an object to acquire a lock on
     * - To execute synchronized statements, a lock must be acquired before the execution of the statements
     * - Multiple threads can concurrently execute methods with synchronized statements if they acquire a lock on monitors of separate objects
     * - A thread releases the lock on the object monitor once it exits the synchronized statement block due to successful completion or an exception
     * - Immutable objects like an instance of class String and the wrapper classes (like Boolean, Long, Integer etc.) are thread safe because
     *   their contents can't be modified
     * - You can define an immutable class by limiting access to its attributes within the class and not defining any methods to modify its state
     * - Once initialized, an immutable instance doesn't allow modification to its value
     * - You can use volatile variables to synchronize access to data
     * - When a thread reads from or writes to a variable (both primitive and reference variables) marked with the keyword volatile, it accesses it
     *   from the main memory, as opposed to storing its copy in the thread's cache memory. This prevents multiple threads from storing a local copy
     *   of shared values that might not be consistent across threads
     */
}
