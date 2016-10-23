package chapter2.advancedclassdesign.enums;

/**
 * Created by dan on 10/23/16.
 */
public class Overview {
    /**
     * - Enumerated types are also called enums
     * - An enum enables you to create a type, which has a fixed set of constants
     * - An enum can never be instantiated using keyword new
     * - Unlike a class, which is defined by the keyword class, an enumerated type is
     *   defined using the keyword enum, and can define multiple variables and methods
     * - If you define a variable of an enum type, it can be assigned constant values only
     *   from the enum
     * - All enums extend the abstract class java.lang.Enum, defined by the Java API
     * - Because a class can extend from only one base class, an attempt to make your enum
     *   extend any other class will fail its compilation
     * - The enum constants are implicit static members
     * - An enum can implement any interface, but its constants should
     *   implement the relevant interface methods
     * - An enum can define an abstract method, just ensure its overrode for all
     *   your enum constants
     * - You can add instance vars, class vars, instance methods and class methods to
     *   your enums
     * - An enum can't use instance variables in the overridden methods for a particular
     *   enum constant
     * - You can override non final methods from class java.lang.Enum for individual (or all)
     *   enum constants
     * - Your enums can also define constructors, which can be called from within the enum
     * - You can define multiple constructors in your enums
     * - Enum constants can define new methods, but these methods can't be called on the enum constant
     * - You can define an enum as a top-level enum or within another class or interface
     * - You can't define an enum local to a method
     * - An enum can define a main method
     */
}
