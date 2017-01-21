package chapter10.threads.identifyandfixcodeinmultithreadedenv;

/**
 * Created by dan on 1/21/17.
 */
public class Overview {
    /**
     * - Threading issues arise when multiple threads work with shared data and when they're dependent on other threads
     * - Local variables, method params and exception handler params are always thread safe in a multithreaded application
     * - Class and instance variables might not always be safe in a multithreaded application
     * - Methods wait(), notify() and notifyAll() can be used for interthread notification
     * - To call wait() or notify() a thread must own the object's monitor lock. So calls to these methods should be placed within synchronized
     *   methods or blocks or else an IllegalMonitorStateException will be thrown by the JVM
     * - All overloaded versions of wait() throw a checked InterruptedException. Methods notify() and notifyAll() don't throw an InterruptedException
     * - Unlike Thread's method join(), which waits for another thread to complete its execution, methods wait() and notify() don't require a
     *   thread to complete their execution
     * - Multiple threads might deadlock when the have acquired a lock on objects and are waiting to acquire locks on additional objects that are
     *   owned by other waiting threads
     * - All threads are assigned a priority, either implicitly or explicitly. Usually threads with a higher priority are preferred to execute by the
     *   thread scheduler. But this preference might leave threads with lower priority starved to be scheduled
     * - A thread can also starve to be scheduled when it's waiting to acquire a lock on an object monitor that has been acquired by another thread
     *   that usually takes long to execute and is invoked frequently
     * - Threads in a livelock aren't blocked; they're responding to each other, but they aren't able to move to completion
     * - With threads, there's little that can be guaranteed. The Java language uses a happens-before relationship, which is when one task is
     *   guaranteed to happen before another in a multithreaded environment
     * - The execution of start() happens-before any action in a thread is started
     * - When code is defined in a sequence, Step 1 happens-before Step 2
     * - Unlocking of an object monitor happens-before any other thread acquire a lock on it
     * - A write to a volatile field happens-before every subsequent read of that field
     * - All actions in a thread happens-before any other thread returns from a join on that thread
     *
     */
}
