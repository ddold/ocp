package chapter2.advancedclassdesign.anonymousinnerclass;

/**
 * Created by dan on 10/27/16.
 *
 * can use an anon inner class to return values
 */
public class Outer {
    Object foo() {
        return new Object() {
            public String toString() {
                return "anonymous";
            }
        };
    }

    public static void main(String [] args){
        Outer outer = new Outer();
        System.out.println(outer.foo());
    }
}
