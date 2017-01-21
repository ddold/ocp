package chapter10.threads.createandusethreads;

/**
 * Created by dan on 1/21/17.
 */
public class Overview {
    /**
     * - All nontrivial Java applications are multithreaded
     * - Multiple threads can be supported by an underlying system by using multiple hardware processors, by time-slicing multiple processors
     * - Implementation of Java threads id JVM-specific
     * - Though related, a Thread instance and a thread of execution aren't the same. A Thread instance is a Java object
     * - The main thread is named main by the JVM. Don't confuse it withe the method main()
     * - Class Thread and interface Runnable can be used to create and start a new thread of execution
     * - To create your own thread objects using class Thread, you must extend it and override its method run()
     * - When you call start on a Thread instance, it creates a new thread of execution
     * - When a new thread of execution starts, it will execute the code defined in the thread instance's method run(). Method start() will
     *   trigger the creation of a new thread of execution, allocating resources to it
     * - Because you can't be sure of the order of execution of threads by an underlying OS, multithreaded code might output different results
     *   when executed on the same or a different system
     * - When you create a thread class by extending class Thread, you lose the flexibility of inheriting any other class
     * - When you implement the Runnable interface, you must implement its method run()
     * - If your class implements the Runnable interface, then you should pass its instance to the constructor of class Thread
     * - The Thread constructor accepts a Runnable object. A Thread instance stores a reference to a Runnable object and uses it when you start
     *   its execution (by calling start())
     * - Because class Thread implements the Runnable interface, you can instantiate a thread by passing it another Thread instance
     * - Each thread is created with a priority. Its range varies from 1 to 10, with 1 being the lowest priority and 10 the highest. By default
     *   a thread creates another thread with the same priority as its own
     * - You can't guarantee that a thread with a higher priority will always execute before a thread with a lower priority
     */
}
