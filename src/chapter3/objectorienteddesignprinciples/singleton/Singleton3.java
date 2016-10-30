package chapter3.objectorienteddesignprinciples.singleton;

/**
 * Created by dan on 10/30/16.
 *
 * Lazy synchronized initialisation
 */
public class Singleton3 {
    private static Singleton3 anInstance;

    // whole method synchronized
    synchronized public static Singleton3 getInstance() {
        if(anInstance == null){
            anInstance = new Singleton3();
        }
        return anInstance;
    }

    private Singleton3(){
        System.out.println("Private Constructor");
    }
}

class Singleton4 {
    private static Singleton4 anInstance;

    // Don't synchronize whole method, just the block that creates the Singleton object
    public static Singleton4 getInstance() {
        if(anInstance == null){
            synchronized (Singleton4.class){
                if(anInstance == null){
                    anInstance = new Singleton4();
                }
            }
        }
        return anInstance;
    }

    private Singleton4(){
        System.out.println("Private Constructor");
    }
}
