package chapter10.threads.threadmethods;

/**
 * Created by dan on 1/21/17.
 */
public class Samples {
    public static void main(String [] args){
        Samples samples = new Samples();

        // Run the below method will throw a IllegalThreadStateException
        //samples.cant-CallStartOnSameThreadMoreThanOnce();

        //samples.canCallRunMultipleTimes();

        //samples.yieldProccessorTime();

        //samples.sleepTime();

        ScreenDesign design = new ScreenDesign();
        design.start();
        Developer developer = new Developer(design);
        developer.code();
    }

    public void sleepTime(){
        Thread singing = new Singing();
        System.out.println("Going to sleep for 5 seconds before I start singing");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        singing.start();
    }

    public void yieldProccessorTime(){
        Thread singing = new Singing();
        singing.start();
        Thread.yield();
    }

    public void canCallRunMultipleTimes(){
        Thread singing = new Singing();
        singing.run();
        singing.run();
        /**
         * Calling method run() directly doesn't start a new thread of execution in main
         * Nor does it modify the state of thread singing
         * Method run() is called and executed as if its just any other method
         */
    }

    public void cantCallStartOnSameThreadMoreThanOnce(){
        Thread singing = new Singing();
        singing.start();
        singing.start();
        /**
         * Only 1 thread is defined here
         * start() can only be called when a thread is in the NEW state
         * when singing.start() is called for the second time, the singing thread object has progressed from the NEW state
         * This will cause a IllegalThreadStateExecption
         */
    }
}

class Developer {
    ScreenDesign design;

    Developer(ScreenDesign design){
        this.design = design;
    }

    public void code(){
        try {
            System.out.println("Waiting for design to complete");
            design.join();
            System.out.println("Coding phase start");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
