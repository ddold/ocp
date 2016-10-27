package chapter2.advancedclassdesign.innerclass;

/**
 * Created by dan on 10/27/16.
 */
public class Overview {
    /**
     * - An inner class is an instance member of its outer class
     * - An object of an inner class shares a special bond with its outer class and can't
     *   exist without its instance
     * - An inner class can be defined using any of the 4 access levels - public, protected, default and private
     * - Members of an inner class can refer to all variables and methods of an outer class
     * - An inner class can define constructors
     * - An inner class can define variables and methods with any access
     * - An inner class can't define static methods and nonfinal static variables
     * - You can create an object of an inner class within an outer class or outside an outer class
     * - Outside the outer class an inner class is instantiated using
     *   Outer.Inner inner = new Outer().new Inner();
     */
}
