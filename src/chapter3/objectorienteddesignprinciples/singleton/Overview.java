package chapter3.objectorienteddesignprinciples.singleton;

/**
 * Created by dan on 10/30/16.
 */
public class Overview {
    /**
     * - Singleton is a creational design pattern that ensures that a class is instantiated only once.
     *   The class also provides a global point of access to it
     * - Its used in scenarios when you might only need one object of a class
     * - Implementation of the Singleton pattern involves a single class
     * - A class that implements the Singleton pattern must define it constructor as private
     * - A Singleton class uses a static private reference variable to refer to its sole instance
     * - A Singleton class defines a static method to access its sole instance
     * - To avoid threading issues with the creation of the sole instance of the Singleton class, you might
     *   use either of the following to create its sole instance:
     *   -> Eager Initialization - instantiate the the onject with its declaration
     *   -> Synchronized lazy Initialization - create an instance using a synchronized method or code block
     * - You can also use enums to implement the Singleton pattern because enum instances can't be created
     *   by any other class
     * - On the exam, all of these approaches may be presented and you may be questioned about the right
     *   approach for implementing the Singleton pattern. All these approaches are good. Beware of modified
     *   code that tries to synchronize a partial method getInstance(), which doesn't synchronize the code
     *   that creates an object of Singleton
     */
}
