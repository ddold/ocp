package chapter2.advancedclassdesign.anonymousinnerclass;

/**
 * Created by dan on 10/27/16.
 */
public class Overview {
    /**
     * - An anonymous inner class is created when you combine object instance creation with
     *   inheriting a class or implementing an interface
     * - An anon inner class might override none, few or all methods of the inherited class
     * - An anon inner class must implement all methods of the implemented interface
     * - An instance of an anon class can be assigned to any type of variable (static, instance or
     *   local variable) or method parameter, or be returned from a method
     * - The following line creates an anon inner class that extends Object and assigns it to a
     *   reference variable of type Object;
     *   Object obj = new Object() {};
     * - The following line calls a method aMethod(), passing to it an instance of an anon class
     *   that implements Runnable;
     *   aMethod(new Runnable() {
     *       public void run() {}
     *   });
     * - When an anon inner class is defined within a method, it can access only the final variables
     *   of the method in which its defined. This is to prevent reassignment of the variable values
     *   by the inner class
     * - Though you can define variables and methods in an anon inner class, they can't be accessed
     *   using the reference variable of the base class or interface, which is used to refer to the
     *   anon class instance
     */
}
