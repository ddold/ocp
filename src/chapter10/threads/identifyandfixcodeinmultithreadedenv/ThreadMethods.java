package chapter10.threads.identifyandfixcodeinmultithreadedenv;

/**
 * Created by dan on 1/21/17.
 *
 * __________________________________________________________________________________
 * |     Method Name      | Releases lock? | Changes in status of executing thread  |
 * ----------------------------------------------------------------------------------
 * | sleep()              |      No        | RUNNABLE ---> TIMED_WAITING            |
 * | yield()              |      No        | RUNNABLE ---> No Change                |
 * | join()               |      No        | RUNNABLE ---> WAITING or TIMED_WAITING |
 * | notify()/notifyAll() |      No        | RUNNABLE ---> No Change                |
 * | wait()               |      Yes       | RUNNABLE ---> WAITING or TIMED_WAITING |
 * ----------------------------------------------------------------------------------
 *
 */
public class ThreadMethods {
    public static void main(String [] args){
        Friend dan = new Friend();
        GoRafting rafting = new GoRafting(dan);
        rafting.start();
        dan.start();
    }
}

class GoRafting extends Thread {
    Friend friend;

    GoRafting(Friend friend){
        this.friend = friend;
    }

    @Override
    public void run() {
        System.out.println("Friend reached: " + friend.reached);
        synchronized (friend){
            try {
                friend.wait();
                // waits to be notified from friend thread
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Reached: " + friend.reached + ", going rafting");
    }
}

class Friend extends Thread {
    boolean reached = false;

    @Override
    public void run() {
        while(!reached){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            confirmedReached();
        }
    }

    private synchronized void confirmedReached() {
        reached = true;
        // notify waiting thread
        notify();
    }
}
