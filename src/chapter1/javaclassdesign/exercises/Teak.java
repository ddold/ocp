package chapter1.javaclassdesign.exercises;

/**
 * Created by dan on 10/22/16.
 */
class Wood {
    public Wood() {
        System.out.println("Wood");
    }
    {
        System.out.println("Wood: Initializer");
    }
}

public class Teak extends Wood {
    {
        System.out.println("Teak: initializer");
    }
    public Teak() {
        System.out.println("Teak");
    }
    public static void main(String [] args){
        new Teak();
    }
}

/**
 * Q. What is the output?
 */
