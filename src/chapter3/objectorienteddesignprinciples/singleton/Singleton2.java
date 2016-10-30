package chapter3.objectorienteddesignprinciples.singleton;

/**
 * Created by dan on 10/30/16.
 */
public class Singleton2 {
    // Known as eager initialisation - initialized once class is loaded into memory
    private static final Singleton2 anInstance = new Singleton2();
    public static Singleton2 getInstance(){
        return anInstance;
    }
    private Singleton2(){
        System.out.println("Private Constructor");
    }
}
