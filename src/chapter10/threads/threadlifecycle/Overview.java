package chapter10.threads.threadlifecycle;

/**
 * Created by dan on 1/21/17.
 */
public class Overview {
    /**
     * - You can control the transition of a thread from one state to another by calling its methods
     * - The exact time of thread state transition is controlled by a thread scheduler, which is bound to vary across platforms
     * - A thread can exist in multiple states;
     *   * NEW
     *   * RUNNABLE
     *   * WAIT
     *   * TIMED_WAITING
     *   * BLOCKED
     *   * TERMINATED
     * - A thread that hasn't yet started is in the NEW state
     * - Calling start() on a new thread instance implicitly calls its method run(), which transitions its state from NEW to READY
     * - A thread in the RUNNABLE state is all set to be executed. It's just waiting to be chosen by the thread scheduler so that it gets the
     *   processor time
     * - As a programmer, you can't control or determine when a particular thread transitions from the READY state to the RUNNING state, and
     *   when it actually gets to execute
     * - The states READY and RUNNING are together referred to as the RUNNABLE state
     * - A thread in the RUNNABLE state is executing in the JVM, but it may be waiting for other resources from the OS, such as a processor
     * - A thread that's blocked waiting for a monitor lock is in the BLOCKED
     * - A thread that's waiting for another thread to perform an action for up to a specified waiting time is in the TIMED_WAITING state
     * - A RUNNING thread enters the TIMED_WAITING state when you call sleep(int), join(int) or wait(int) on it
     * - A thread that's waiting indefinitely for another thread to perform a particular action is in the WAITING state
     * - When you call wait() on a RUNNING thread, it transitions to the WAITING state. It can change back to the READY state when notify() or
     *   notifyall() is called
     * - A RUNNING thread might enter the BLOCKED state when it's waiting for other system resources like network connections or to acquire an
     *   object lock to execute a synchronized method or code block. Depending on whether the thread is able to acquire the monitor lock or
     *   resources, it returns back a READY state
     * - With successful completion of run(), a thread is in the TERMINATED state
     * - A thread might transition from any state to the TERMINATED state due to an exception
     *
     * ________________________________________________________________________________________________________________________________________
     * |  Thread State  |                                         Description                                                                 |
     * |----------------|---------------------------------------------------------------------------------------------------------------------|
     * | NEW            | A thread that has been created but hasn't yet started is in this state                                              |
     * | RUNNABLE       | Thread state for a runnable thread. A thread in this state is executing in the JVM but it may be waiting for other  |
     * |                | resources from the OS, such as a processor                                                                          |
     * | BLOCKED        | A thread that's blocked waiting for a monitor lock is in this state                                                 |
     * | WAITING        | A thread that's waiting indefinitely for another thread to perform a particular action is in this state             |
     * | TIMED_WAITING  | A thread that's waiting for another thread to perform an action for up to a specified waiting time is in this state |
     * | TERMINATED     | A thread whose run() method has finished is in this state (still a thread object but not a thread od execution)     |
     * ----------------------------------------------------------------------------------------------------------------------------------------
     *
     *
     *
     */
}
