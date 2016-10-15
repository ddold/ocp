package chapter1.javaclassdesign.instanceinitializers;

/**
 * Created by dan on 10/15/16.
 */
public class Instrument {
    Instrument() {
        System.out.println("Instrument:constructor");
    }
}

class Pen extends Instrument {
    public Pen() {
        System.out.println("Pen:constructor");
    }
    {
        System.out.println("Pencil:instance initializer");
    }

    public static void main(String [] args){
        new Pen();
    }
}

/**
 * Parent constructor called first before child instance initializer or cinstructor called
 *
 * Result
 * ----------
 * Instrument:constructor
 * Pencil:instance initializer
 * Pen:constructor
 */
