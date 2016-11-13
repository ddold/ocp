package chapter4.genericsandcollections.wrapper_classes;

/**
 * Created by dan on 11/13/16.
 */
public class Overview {
    /**
     * - All wrapper classes are immutable
     * - All the wrapper classes implement the Comparable interface. All these classes define their natural order
     * - You can create objects of all wrapper classes in multiple ways;
     *   - Assignment - By assigning a primitive to a wrapper class variable
     *   - Constructor - By using wrapper class constructors
     *   - Static methods - By calling the static method of wrapper classes like valueOf()
     * - All wrapper classes (except Character) define a constructor that accepts a String argument representing
     *   the primitive value that needs to be wrapped. Watch out for exam questions that include a call to a
     *   no-argument constructor of a wrapper class. None of these classes defines a no-argument constructor
     * - To get a primitive data-type value corresponding to a string value, you can use the static utility method
     *   parseDataType(), where DataType refers to the type of the return value
     * - Wrapper classes Character, Byte, Short, Integer and Long cache objects with values in the range of
     *   -128 to 127. These classes define inner static classes that store objects of primitive that store
     *   objects for the primitive values -128 to 127 in an array. If you request an object of any of these
     *   classes, from this range, method valueOf() returns a reference to a predefined object; otherwise,
     *   it creates a new object and returns it reference
     * - Integer literal values are implicitly converted to Integer objects and decimal literal values are
     *   implicitly converted to Double objects
     * - The objects of different wrapper classes with the same values aren't equal
     * - When arranged in natural sort order, false precedes true
     */
}
