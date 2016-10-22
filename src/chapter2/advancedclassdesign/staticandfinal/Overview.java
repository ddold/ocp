package chapter2.advancedclassdesign.staticandfinal;

/**
 * Created by dan on 10/22/16.
 */
public class Overview {
    /**
     *       Static
     *     ----------
     * - Static members (fields and methods) are common to all instances of a class
     *   and aren't unique to any instance of a class
     * - Static members exist independently of any instances of a class and may be
     *   accessed even when no instances of the class have been created
     * - Static members are known as class fields or class methods because they belong
     *   to the class and not to the instance of the class
     * - A static variable/method can be accessed using the name of an object reference
     *   variable or the name of a class
     * - A static method/variable can't access nonstatic methods/variables of a class
     *   But the reverse works - nonstatic methods/variables can access static variables/methods
     * - Static classes and interfaces are a type of nested classes and interfaces
     * - You can't prefix the definition of a top-level class or an interface with the keyword
     *   static. A top-level class or interface is one that isn't defined within
     *   another class or interface
     *
     *       Final
     *     ----------
     * - You can't reinitialize a final variable defined in any scope - class, instance,
     *   local or method parameter
     * - An instance final variable can be initialized either with its declaration in the
     *   initializer block or the class's constructor
     * - A static final variable can be initialized either with its declaration or in the
     *   class's static initializer block
     * - You can't initialize a final instance variable in an instance method because it
     *   can't be guaranteed to execute only once - such a method won't compile
     * - You can't initialize a final static variable in a static method because it can't be
     *   guaranteed to execute only once - such a method won't compile
     * - If you don't initialize a final local variable in a method, the compiler won't complain,
     *   as long as you don't use it
     * - If you try to access the value of a final local before assigning a value to it, the
     *   code won't compile
     * - The Java compiler considers initialization of a local final variable complete only if the
     *   initialization code will execute in all conditions. If the Java compiler can't be sure of
     *   execution of code that assigns a value to your final variable, it will complain (compile error)
     *   that you haven't initialized a final variable. If an if construct uses constant values, the
     *   Java compiler can predetermine whether the then or else blocks of code will execute. In this
     *   case, it can predetermine whether these blocks of code will execute to initialize a final
     *   variable
     * - A final instance variable defined in a base class can't be initialized in the derived class
     *   If you try to do so, code won't compile
     * - Final methods defined in a base class can't be overridden by its derived class
     * - Final methods are used to prevent a derived class from overriding the implementation
     *   of a base class's method
     * - Private final methods in a base class aren't inherited by derived classes. A method
     *   defined using the same method signature in a derived class isn't an overridden method
     *   but a new method
     * - A final class can't be extended by any other class
     * - A class is defined final so that it can't be extended by any other class. This prevents
     *   objects of derived classes from being passed on to reference variables of their base class
     * - An interface can't be defined as final because an interface is abstract, by default. A Java
     *   entity can't be defined both as final and abstract
     */
}
