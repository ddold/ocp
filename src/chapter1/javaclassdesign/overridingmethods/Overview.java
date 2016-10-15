package chapter1.javaclassdesign.overridingmethods;

/**
 * Created by dan on 10/15/16.
 */
public class Overview {
    /**
     * - Method overriding is an OOP language feature that enables
     *   a derived class to define a specific implementation of an
     *   existing base class method to extend its own behaviour
     * - A derived class can override an instance method defined in a
     *   base class by defining an instance method with the same method signature
     * - Whenever you intend to override methods in a derived class,
     *   use the annotation @Override. It will warn you if a method can't be overriden
     *   or if you're actually overloading a method rather than overriding it
     * - Overriden methods can define the same the same or covariant return types
     * - A derived class can't override a base class method to make it less accessible
     * - Overriding methods must define exactly the same method parameters;
     *   the use of a subclass or parent class results in overloading methods
     * - Static methods can't be overridden. They are not polymorphic or bound
     *   at compile time
     * - In a derived class, a static method with the same method signature as
     *   that of a static method in its base class hides the base class method
     * - A derived class can't override the base class methods
     *   that aren't accessible to it, such as private methods
     * - Constructors can't be overriden because a base class constructor
     *   isin't inherited by a derived class
     * - A method that can't be overriden by a derived class is called a virtual method
     * - Virtual method invocation is invocation of the correct method-determined
     *   using the object type and not its reference
     */
}
