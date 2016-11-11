package chapter4.genericsandcollections.collections_framework;

/**
 * Created by dan on 11/11/16.
 */
public class Overview {
    /**
     *                              Collection
     *                             ------------
     * - The Collection<E> interface represents a group of objects known as its elements
     * - There's no direct implementation of Collection; no concrete class implements it. It's extended
     *   by more specific interfaces such as Set, List and Queue
     * - This collection is used for maximum generality - to work with methods that can accept objects of
     *   say Set, List and Queue
     * - All collection classes are generic
     * - The Map interface doesn't extend the core Collection interface
     * - The Collection interface implements the Iterable interface, which defines method iterator(),
     *   enabling all the concrete implementations to access an Iterator<E> to iterate over all the
     *   collection objects
     * - The methods of the Collection interface aren't marked as synchronized
     *
     *
     *                                 List
     *                                ------
     * - The List interface models an ordered collection of objects. It returns the objects to you in the
     *   order in which you added them. It allows you to store duplicate elements
     * - In a List you can control the position where you want to store an element. This is the reason that
     *   this interface defines overloaded methods to add, remove and retrieve elements at a particular position
     * - Method listIterator() of List can be used to iterate the complete list or a part of it
     *
     *                         #####ArrayList#####
     * - An ArrayList is a resizable array implementation of the List interface
     * - An ArrayList uses the size variable to keep track of the number of elements inserted in it. By default
     *   an element is added to the first available position in the array. But if you add an element to an
     *   earlier location, the rest of the list elements are shifted to the right
     * - If you remove an element that isn't the last element in the list, ArrayList shifts the elements to the left
     * - An ArrayList maintains a record of its size so that you can't add elements to arbitrary locations
     * - ArrayLists method remove() sequentially searches the ArrayList to find the target object, using method
     *   equals() to compare its elements with the target object
     * - If a matching element is found, remove(Object) removes the first occurrence of the match found
     * - If you're adding instances of a user-defined class as elements to an ArrayList, override its method
     *   equals() or else its method contains() or remove() might not behave as expected
     * - The ArrayList methods clear(), remove() and removeAll() offer different functionalities. clear() removes
     *   all the elements from an ArrayList. remove(Object) removes the first occurrence of the specified element
     *   and remove(int) removes the element at the specified position. removeAll() removes from an ArrayList all
     *   of its elements that are contained in the specified collection
     *
     *
     *                              Deque
     *                             -------
     * - A Deque is a double-ended queue, a queue that supports the insertion and deletion of elements at
     *   both ends
     * - As a double-ended queue, a Deque can work as both queue and a stack
     * - The Deque interface defines multiple methods to add, remove and query the existence of elements from
     *   both its ends
     * - Methods addFirst(), addLast(), offerFirst() and offerLast() add and remove elements from the top and tail
     * - Deque also defines methods push(), pop() and peek() to add, remove and query elements at its beginning
     * - Deque's method peek() only queries elements, it doesn't remove them
     * - Deque's method remove() just removes an element
     * - Deque's method poll() returns null when Deque is empty and remove() throws a runtime exception
     * - ArrayDeque and LinkedList implement Deque interface
     * - You can iterate over elements of Deque by using an Iterator, returned by methods iterator() and
     *   descendingIterator()
     *
     *                      #####ArrayDeque#####
     * - ArrayDeque is a resizable array implementation of the Deque interface
     * - All the insertion methods add(), addFirst(), addLast(), offer(), offerFirst(), offerLast() and push()
     *   throw a NullPointerException if you try to insert a null element into an ArrayDeque
     *
     *                     #####LinkedList#####
     * - A LinkedList is like an ArrayList (ordered by index) but the elements are double-linked to each other.
     *   So besides the methods from List you get a bunch of other methods to add or remove at the beginning and
     *   of this list. So it's a good choice if you need to implement a queue or a stack. A LinkedList is useful
     *   when you need fast insertion or deletion, but iteration might be slower than an ArrayList
     * - Because a LinkedList implements List, Queue and Deque it implements methods from all these interfaces
     *
     *
     *                          Set
     *                         -----
     *
     */
}
