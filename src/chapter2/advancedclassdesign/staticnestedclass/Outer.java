package chapter2.advancedclassdesign.staticnestedclass;

/**
 * Created by dan on 10/27/16.
 */
public class Outer {
    static int outerStatic = 10;
    int outerInstance = 20;

    static class StaticNested {
        static int innerStatic = 30;
        int innerInstance = 40;
    }

    public static void main(String [] args){
        Outer outer = new Outer();

        // If instantiated in the same class you can access the
        // nested class without needing a reference to the outer class
        StaticNested staticNested = new StaticNested();

        // static variables called like regular static variables
        // Is even the same for the static nested class
        // innerStatic is called by StaticNested.innerStatic
        System.out.println("Outer.outerStatic: " + Outer.outerStatic);
        System.out.println("Inner.innerStatic: " + StaticNested.innerStatic);

        // To call both class instance variables, objects have to be created of each class first
        System.out.println("Outer.outerInstance: " + outer.outerInstance);
        System.out.println("Inner.innerInstance: " + staticNested.innerInstance);
    }
}

class AnotherClass {
    // need to include Outer class name to access inner class
    Outer.StaticNested ex = new Outer.StaticNested();

    public static void main(String [] args){
        AnotherClass ac = new AnotherClass();

        // Accessing members of static nested class
        System.out.println("Getting inner class instance variable: " + new Outer.StaticNested().innerInstance);
        System.out.println("Getting inner class static variable: " + Outer.StaticNested.innerStatic);

        System.out.println();
        System.out.println("Instance variable with reference to object: " + ac.ex.innerInstance);
    }

}