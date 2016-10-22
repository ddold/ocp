package chapter2.advancedclassdesign.abstractclass;

/**
 * Created by dan on 10/22/16.
 */
public class Overview {
    /**
     * - An abstract class is defined by using the keyword abstract
     * - It defines variables to to store the state of the object and
     *   it may define abstract or non-abstract methods
     * - An abstract class may not define abstract methods. If it defines
     *   at least one abstract method, it must be marked as an abstract class
     * - An abstract class can't be instantiated
     * - An abstract method doesn't have any implementation. It represents a
     *   behaviour that's required by all derived classes of an abstract class
     * - An abstract class forces all its non-abstract derived classes to implement
     *   the incomplete functionality in their own unique manner
     * - A base class should be defined as an abstract class so it can implement the
     *   available details but still prevent itself from being initialised
     * - An abstract class can be extended by another abstract and concrete class.
     *   If an abstract class is extended by another abstract class, the derived
     *   abstract class might not implement the abstract methods from its base class
     * - If an abstract class is extended by a concrete class, the derived class must
     *   implement all abstract methods of its base class, or it won't compile
     * - A derived class must call it's superclass's constructor (implicitly or explicitly)
     *   irrespective of whether the superclass or derived class is an abstract class
     *   or concrete class
     * - An abstract class can't define abstract static methods. Static methods belong to
     *   the class and not the object, they aren't inherited. A method that can't be
     *   inherited can't be implemented. Hence the combo wouldn't work
     * - Efficient use of an abstract class lies in the id of an abstract class in
     *   your application design so you can define common code for your objects and
     *   leave the ones that are more specific, by defining them as abstract
     *
     *
     *   Comparing abstract and concrete classes
     *   ----------------------------------------------------------------------------------------------
     *   |                    Comparison Category                           |  Abstract  |  Concrete  |
     *   ----------------------------------------------------------------------------------------------
     *   | Create a new type                                                |      Y     |      Y     |
     *   | Use as a base class                                              |      Y     |      Y     |
     *   | Extend another class                                             |      Y     |      Y     |
     *   | Implement interfaces                                             |      Y     |      Y     |
     *   | Define attributes and concrete methods                           |      Y     |      Y     |
     *   | Require at least one constructor to be called by derived classes |      Y     |      Y     |
     *   | Define abstract methods                                          |      Y     |      X     |
     *   | Allow object creation                                            |      X     |      Y     |
     *   ----------------------------------------------------------------------------------------------
     */
}
