package chapter2.advancedclassdesign.methodlocalinnerclass;

/**
 * Created by dan on 10/27/16.
 */
public class Overview {
    /**
     * - Method local inner class are defined within a static or instance method if a class
     * - A class can define multiple method local inner classes, with the same class name,
     *   but in different methods
     * - Method local inner classes can't be defined using any explicit modifier
     * - A method local inner class can define its own constructors, variables and methods by using
     *   any of the 4 access levels - public, protected, default and private
     * - A method local inner class can be created only within the method in which its defined. Also
     *   its object creation can't appear before its declaration
     * - A method local inner class can access all variables and methods of its outer class including
     *   its private members and the ones that it inherits from its base classes. It can only access
     *   the final local variables of the method in which its defined
     * - A method local inner class can define members with the same name as its outer class. In this
     *   case, the members of the outer class can be referred by using Outer.this
     */
}
