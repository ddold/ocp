package chapter10.threads.threadmethods;

/**
 * Created by dan on 1/21/17.
 */
public class Overview {
    /**
     * - Calling start() on a Thread instance creates a new thread of execution, which executes run()
     * - You can call start() on a thread that's in the NEW state. Calling start() from any other thread state will throw an
     *   IllegalThreadStateException
     * - Calling run() on a Thread instance doesn't start a new thread of execution. The run() continues to execute in the same thread
     * - A thread might pause its execution due to the calling of an explicit method or when its time slice with the processor expires
     * - Method yield() makes the currently executing thread pause its execution and give up its current use of the processor. But it only acts
     *   as a hint to the scheduler. The scheduler might also ignore it
     * - Method yield() is static. It can be called from any method and it doesn't throw any exceptions
     * - Method yield() can be placed literally anywhere in your code - not only in method run()
     * - Method sleep() is guaranteed to cause the currently executing thread to temporarily give up its execution for at least the specified
     *   number of milliseconds (and nanoseconds)
     * - Unless interrupted, the currently executed thread will sleep for at least the specified duration. It might not start its execution
     *   immediately after the specified time elapses
     * - Method sleep() is Threads static method and it makes the currently executing thread give up its execution. Because all code is executed
     *   by some thread, placement of sleep() will determine which Thread instance will give up its execution
     * - A thread that's suspended due to a call to sleep() doesn't lose ownership of any monitors
     * - If thread A calls join() on a Thread instance B, A will wait for B to complete its execution before A can proceed to its own completion
     * - Method join() guarantees that the calling thread won't execute its remaining code until the thread on which it calls join() completes
     * - A thread can pause its execution and wait on an object, a queue in this case, by calling wait(), until another thread calls notify()
     *   or notifyAll()on the same object
     * - Methods wait(), notify() and notifyAll() can be called on all Java objects, because they're defined in class Object and not class Thread
     * - A thread completes its execution when its method run() completes
     */
}
