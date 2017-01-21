package chapter10.threads.identifyandfixcodeinmultithreadedenv;

/**
 * Created by dan on 1/21/17.
 */
class Developer {
    synchronized void fixBugs() {
        System.out.println("fixing..");
    }

    synchronized void code() {
        System.out.println("coding..");
    }
}

class Tester {
    synchronized void testAppln() {
        System.out.println("testing..");
    }
}

class AndroidApp extends Thread {
    Developer dev;
    Tester tester;

    AndroidApp(Developer dev, Tester tester){
        this.dev = dev;
        this.tester = tester;
    }

    @Override
    public void run() {
        synchronized (tester) {
            tester.testAppln();
            dev.fixBugs();
        }
    }
}

class iPhoneApp extends Thread {
    Developer dev;
    Tester tester;

    iPhoneApp(Developer dev, Tester tester){
        this.dev = dev;
        this.tester = tester;
    }

    @Override
    public void run() {
        synchronized (dev) {
            dev.code();
            tester.testAppln();
        }
    }
}

public class Deadlock {
    public static void main(String [] args){
        Tester dan = new Tester();
        Developer dave = new Developer();

        AndroidApp androidApp = new AndroidApp(dave, dan);
        iPhoneApp iPhoneApp = new iPhoneApp(dave, dan);

        androidApp.start();
        iPhoneApp.start();
    }
}