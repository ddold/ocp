package chapter10.threads.threadmethods;

/**
 * Created by dan on 1/21/17.
 */
public class Singing extends Thread {
    public void run(){
        yield();
        System.out.println("Singing");
    }
}

class ScreenDesign extends Thread {
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }
}