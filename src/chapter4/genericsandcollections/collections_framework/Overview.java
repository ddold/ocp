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
     *   by more specific interfaces such as Sets, Lists and Queue
     * - This collection is used for maximum generality - to work with methods that can accept objects of
     *   say Sets, Lists and Queue
     * - All collection classes are generic
     * - The Map interface doesn't extend the core Collection interface
     * - The Collection interface implements the Iterable interface, which defines method iterator(),
     *   enabling all the concrete implementations to access an Iterator<E> to iterate over all the
     *   collection objects
     * - The methods of the Collection interface aren't marked as synchronized
     *
     *
     *                                 Lists
     *                                ------
     * - The Lists interface models an ordered collection of objects. It returns the objects to you in the
     *   order in which you added them. It allows you to store duplicate elements
     * - In a Lists you can control the position where you want to store an element. This is the reason that
     *   this interface defines overloaded methods to add, remove and retrieve elements at a particular position
     * - Method listIterator() of Lists can be used to iterate the complete list or a part of it
     *
     *                         #####ArrayList#####
     * - An ArrayList is a resizable array implementation of the Lists interface
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
     *   So besides the methods from Lists you get a bunch of other methods to add or remove at the beginning and
     *   of this list. So it's a good choice if you need to implement a queue or a stack. A LinkedList is useful
     *   when you need fast insertion or deletion, but iteration might be slower than an ArrayList
     * - Because a LinkedList implements Lists, Queue and Deque it implements methods from all these interfaces
     *
     *
     *                          Sets
     *                         -----
     * - The Sets interface models the mathematical Sets abstraction
     * - The Sets interface doesn't allow duplicate elements and their elements are returned in no particular
     *   order
     * - To determine the equality of objects, Sets uses their method equals(). For two elements, say e1 and e2,
     *   if e1.equals(e2) returns true, Sets doesn't add both elements
     * - Sets defines methods to add and remove its elements. It also defines methods to query itself for the
     *   occurrence of specific objects
     *
     *                   #####HashSet#####
     * - Class HashSet implements the Sets interface. It doesn't allow the addition of duplicate elements and makes
     *   no guarantee to the order of retrieval of its elements
     * - HashSet is implemented using a HashMap
     * - To store and retrieve its elements, a HashSet uses a hashing method, accessing an objects hashCode()
     *   value to determine the bucket in which it should be stored
     * - Method hashCode() doesn't call method equals()
     * - Method equals() doesn't call method hashCode()
     * - Classes should override their hashCode() methods efficiently to enable collection classes like HashSet
     *   to store them in separate buckets
     * - A HashSet allows storing of only one null element. All subsequent calls to storing null values are
     *   ignored
     * - Class HashSet uses a hashing algorithm to store, remove and retrieve its elements. So it offers constant
     *   time performance for these operations, assuming that the hash function disperses its elements properly
     *   among its buckets
     *
     *                #####LinkedHashSet#####
     * - A LinkedHashSet offers the benefits of a HashSet combined with a LinkedList. It maintains a double
     *   linked list running through its entries
     * - As with a LinkedList, you can retrieve objects from LinkedHashSet in the order of insertion
     * - Like a HashSet, a LinkedHashSet uses hashing to store and retrieve its elements quickly
     * - A LinkedHashSet permits null values
     * - LinkedHashSet can be used to create a copy of a Sets with the same order as that of the original set
     * - LinkedHashSet's method addAll() accepts Collection object. So you can add elements of an ArrayList to
     *   a LinkedHashSet. The order of insertion of objects from ArrayList to LinkedHashSet is determined by
     *   the order of objects returned by ArrayList's iterator (ArrayList objects can be iterated in the order
     *   of their insertion)
     *
     *                  #####TreeSet#####
     * - A TreeSet stores all its unique elements in a sorted order. The elements are ordered either on their
     *   natural order (achieved by implementing the Comparable interface) or by passing a Comparator while
     *   instantiating a TreeSet. If you fail to specify either of these, TreeSet will throw a runtime exception
     *   when you try to add an object to it
     * - Unlike the other Sets implementations like HashSet and LinkedListSet, which use equals() to compare objects
     *   for equality, a TreeSet uses method compareTo() (for Comparable interface) or compare() (for the Comparator
     *   interface) to compare objects for equality and their order
     * - If two object instances are equal according to their method equals(), but not according to their method
     *   compare() or compareTo(), a Sets can exhibit inconsistent behaviour
     * - Classes Enum and File implement the Comparable interface. The natural order of enum constants in the order
     *   in which they're declared. Classes StringBuffer and StringBuilder don't implement the Comparable interface
     */
}
