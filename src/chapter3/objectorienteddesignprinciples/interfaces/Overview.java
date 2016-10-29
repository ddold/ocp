package chapter3.objectorienteddesignprinciples.interfaces;

/**
 * Created by dan on 10/29/16.
 */
public class Overview {
    /**
     *                              Interfaces
     *                             ------------
     * - An interface is an example of separating the behaviour that an object should support
     *   from its implementation. An interface is used to define behaviour by defining a group
     *   of abstract methods
     * - All members (variables and methods) of an interface are implicitly public
     * - You declare an interface using the keyword interface. An interface can define only
     *   public, final, static variables and public abstract methods
     * - The methods of an interface are implicitly abstract and public
     * - The variables of an interface are implicitly public, static and final
     * - You can declare a top-level interface only with public and default access. Valid non-access
     *   modifiers that can be applied to an interface are abstract and strictfp
     * - An interface that's defined within another interface can be defined with any access modifier
     * - An interface can't extend a class
     * - An interface can extend multiple interfaces. It can't implement another interface
     * - An interface can define inner interfaces and inner classes too
     * - Because all members of an interface are implicitly public, a derived interface inherits all
     *   the methods of its base interface
     * - You can compare interface implementation to the signing of a contract. When a concrete class
     *   declares an implementation of an interface, it agrees to and must implement all its abstract
     *   methods
     * - If you don't implement all the methods defined in the implemented interfaces, a class can't
     *   compile as a concrete class. A concrete class must implement all the methods from the
     *   interfaces that it implements. An abstract class might not implement all the methods from
     *   the interfaces that it implements.
     * - A class can define an instance or a static variable with the same name as the variable defined
     *   in the interface that it implements. These variables can be defined using any access level
     * - Because the methods in an interface are implicitly public, if you try to assign a weaker access
     *   to the implemented method in a class, it won't compile
     * - A class can inherit methods with the same name from multiple interfaces. There are no compilation
     *   issues if these methods have exactly the same method signature or if these methods can coexist
     *   in the implemented class as overloaded methods. The class won't compile if these methods coexist
     *   as incorrectly overloaded or overridden methods
     *
     *
     *
     *                  Class Inheritance vs Interface Inheritance
     *                 --------------------------------------------
     * - Class inheritance scores better when you want to reuse the implementation already
     *   defined in a base class. It also scores better when you want to add new behaviour to
     *   an existing base class
     * - You can add new behaviour to an abstract or nonabstract base class and you may not break all
     *   the classes that subclass it
     * - You may prefer interface inheritance over class inheritance when you need to define multiple
     *   contracts for classes
     * - Interface implementation has one major advantage of allowing a class to implement multiple
     *   interfaces, so an object of a class can be assigned to variables of multiple interface types
     */
}
