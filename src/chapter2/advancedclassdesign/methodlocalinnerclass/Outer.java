package chapter2.advancedclassdesign.methodlocalinnerclass;

/**
 * Created by dan on 10/27/16.
 */
public class Outer {
    private int privateOuter = 10;

    void outerMethod(){
        class Inner{
            protected Inner(){}
            public int publicInner = 100;
            int privateInner = privateOuter;
            int privateInner2 = Outer.this.privateOuter;
        }

        // Needs to be defined after class is created
        Inner inner = new Inner();
    }
    static void outerMethod2(){
        class Inner{}
    }
}
