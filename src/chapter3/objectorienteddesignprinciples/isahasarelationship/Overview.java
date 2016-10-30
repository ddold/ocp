package chapter3.objectorienteddesignprinciples.isahasarelationship;

/**
 * Created by dan on 10/30/16.
 */
public class Overview {
    /**
     * - An IS-A relationship is implemented using inheritance
     * - You can traverse the inheritance tree up the hierarchy to identify an IS-A relationship.
     *   A derived class IS-A type of its base class and its implemented interfaces. A derived
     *   interface IS-A type of its base interface. A base class or interface is not a type of its
     *   derived class or interface
     * - The key to finding the entities that participate in an IS-A relationship is to find your
     *   way up the hierarchy tree, in the direction of the arrows.
     * - You can implement an IS-A relationship by extending classes, extending interfaces or
     *   implementing interfaces
     * - A HAS-A relationship is implemented by association
     * - The relationship MyClass HAS-A YourClass is implemented by defining an instance variable
     *   of type YourClass in MyClass. Defining an instance variable of a type MyClass in YourClass
     *   will implement the relationship YourClass HAS-A MyClass
     */
}
