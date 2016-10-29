package chapter2.advancedclassdesign.innerclass;

/**
 * Created by dan on 10/27/16.
 *
 * Must have an outer class instance to create an inner class instance
 */
public class Outer {
    // Can create instance var of inner class before class is created
    Inner objectInner = new Inner();

    void bMethod() {
        // Can create method var of inner class before class is created
        Inner objectInner = new Inner();
    }

    private String privateOuter = "Outer";
    private int sameName = 20;
    class Inner {
        // Can reference private vars from outer class
        // Can reference them directly or else using this referencing the outer class name
        String publicInner = privateOuter;
        int sameName = Outer.this.sameName;
    }

    void aMethod() {
        Inner objectInner = new Inner();
    }

    static void staticMethod() {
        // The following won't compile - need outer class to access inner class
        //Inner objectInner = new Inner();

        Outer outer = new Outer();
        Inner inner = outer.new Inner();

        // or else it can be done in one line

        Outer.Inner inner2 = new Outer().new Inner();
    }
}

class AnotherClass {
    // Following won't compile - need reference to outer class
    //Inner inner;

    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();

    // or else it can be done in one line

    Outer.Inner inner2 = new Outer().new Inner();
}