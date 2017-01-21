package chapter10.threads.createandusethreads;

/**
 * Created by dan on 1/21/17.
 */
public class SingAndDance {
    public static void main(String [] args){
        System.out.println("Example of class extending Thread");
        System.out.println();

        // instantiate thread
        Thread sing = new Sing();
        // start thread sing
        sing.start();
        System.out.println("Dancing after sing thread");

        System.out.println();
        System.out.println("Example of class extending Thread class\nBut overriding start method");
        System.out.println();

        Thread singNotThread = new SingNotThread();
        // overriden start() doesn't start the thread; it won't create new thread of execution
        singNotThread.start();
        System.out.println("Dancing after singNotThread");

        System.out.println();
        System.out.println("Example of class implementing Runnable interface");
        System.out.println();

        Thread sing2 = new Thread(new Sing2());
        sing2.start();
        System.out.println("Dancing from Sing2 thread");

        System.out.println();
        System.out.println("Example of passing thread object to another thread");
        System.out.println();

        Thread sing3 = new Sing();
        Thread newThread = new Thread(sing3);
        newThread.start();
        /**
         * Output is only printed once
         */
    }
}

class Sing extends Thread {
    // run() begins execution when you call start on a thread
    public void run() {
        System.out.println("Singing... from Sing");
    }
}

class SingNotThread extends Thread {
    public void run(){
        System.out.println("Singing... from SingNotThread");
    }

    // SingNotThread overrides start
    public void start() {
        System.out.println("Starting... from SingNotThread");
    }
    /**
     * Because start() is overriden, when you run sing.start() in main method, it doesn't start a new thread
     * So the output will always be;
     *  Starting...
     *  Dancing
     */
}

class Sing2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Singing... from Sing2");
    }
}