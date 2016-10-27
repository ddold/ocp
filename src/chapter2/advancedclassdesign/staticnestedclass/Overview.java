package chapter2.advancedclassdesign.staticnestedclass;

/**
 * Created by dan on 10/27/16.
 */
public class Overview {
    /**
     * - This class isn't associated with any object of its outer class. Nested within its outer class,
     *   its accessed like any other static member of a class - by using the class name of the outer class
     * - A static nested class is accessible outside the class in which it's defined by using names
     *   of both the outer and inner class
     * - You can define both static and nonstatic members in a static nested class
     * - A static nested class can define constructors
     * - To access the static members of a static nested class, you need not create an object of this class.
     *   You need an object to access the instance members of the class
     * - The accessibility of the nested static class depends on its access modifier e.g. a private static
     *   nested class can't be accessed outside its class
     * - A static nested can access only the static members of its outer class. Similarly, the outer class
     *   can access only the static members of its nested inner class. An attempt to access instance members
     *   on either side will fail compilation unless it's accessed through an instance of the outer or
     *   static nested class
     * - All access levels can be used with this class - public, protected, default and private
     */
}
