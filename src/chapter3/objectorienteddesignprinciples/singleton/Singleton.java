package chapter3.objectorienteddesignprinciples.singleton;

/**
 * Created by dan on 10/30/16.
 */
public class Singleton {
    private static Singleton anInstance = null;
    public static Singleton getInstance(){
        if(anInstance == null){
            anInstance = new Singleton();
        }
        return anInstance;
    }
    private Singleton(){
        System.out.println("Private Constructor");
    }
}

class UseSingleton{
    public static void main(String [] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
    /**
     * Singleton constructor is only called once even when called multiple times
     */
}
