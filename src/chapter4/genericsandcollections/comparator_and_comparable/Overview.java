package chapter4.genericsandcollections.comparator_and_comparable;

/**
 * Created by dan on 11/13/16.
 */
public class Overview {
    /**
     * - The Comparable interface is used to define the natural order of the objects of the class
     *   it implements
     * - Comparable is a generic interface (using T as type parameter) and defines only one method,
     *   compareTo(T object), which compares the object to the object passed to it as a method param
     * - Method compareTo() returns a negative integer, zero or a positive integer if the object is less
     *   than, equal to or greater than the specified object
     * - The Comparator interface is used to define the sort order of a collection of objects, without
     *   requiring them to implement this interface
     * - The Comparator interface defines methods compare() and equals()
     * - You can pass Comparator to sort methods like Arrays.sort() and Collections.sort()
     * - A Comparator object is also passed to collection classes like TreeSet and TreeMap that require
     *   ordered elements
     * - The Comparator interface is used to specify the sort order for classes that
     *   - Don't define a natural sort order
     *   - Need to work with an alternative sort order
     *   - Don't allow modification to their source code so that natural ordering can be added to them
     *
     *   Comparator takes precedence over Comparable
     */
}
