package chapter4.genericsandcollections.maps;

/**
 * Created by dan on 11/12/16.
 */
public class Overview {
    /**
     *                                              Map
     *                                             -----
     * - Unlike the other interfaces from the collection framework, like List and Set, the Map interface
     *   doesn't extend the Collection interface
     * - A Map defines key-value pairs where a key can map to a 0 or 1 value
     * - Map objects don't allow the addition of duplicate keys
     * - The addition of null value as a key or value depends on a particular Map implementation. A HashMap
     *   and a LinkedHashMap allow insertion of null as a key, but TreeMap doesn't - it throws an exception
     *
     *                                      #####HashMap#####
     * - A HashMap is a hash based Map that uses the hash value of its key (returned by hashCode()) to store
     *   and retrieve keys and their corresponding values. Each key can refer to a 0 or a 1 value. The keys
     *   of a HashMap aren't ordered. The HashMap methods aren't synchronized so they aren't safe to be used
     *   in a multithreaded environment
     * - You can create a HashMap by passing its constructor another Map object. Additions of new key-value
     *   pairs or deletions of existing key-value pairs in the Map object passed to the constructor aren't
     *   reflected in the newly created HashMap
     * - Because HashMap stores objects as its keys and values, its common to see code that stores another
     *   collection object (like ArrayList) as a value in a Map
     * - You can call method get() on a HashMap to retrieve the value for a key
     * - Methods containsKey() and containsValue() check for the existence of a key or a value in a HashMap,
     *   returning a boolean value. Methods get() and containsKey() rely on appropriate overriding of a keys
     *   methods hashCode() and equals()
     * - Class String and all the wrapper classes override their methods hashCode() and equals(), so they can
     *   be correctly used as keys in a HashMap
     * - HashMap uses hashing functions to add or retrieve key-value pairs. The key must override both methods
     *   equals() and hashCode() so that it can be added to a HashMap ands retrieved from it
     * - When objects of a class that only overrides method equals() (and not hashCode()) are used as keys in a
     *   HashMap, containsKey() will always return false
     * - If you add a key-value pair to a HashMap such that the key already exists in the HashMap, the keys old
     *   value will be replaced with the new value
     * - You can add a value with null as the key in a HashMap
     * - You can use method remove(key) or clear() to remove one or all key-value pairs of a HashMap
     * - Method remove() can return a null value, irrespective of whether the specified key exists in a HashMap.
     *   It might return null if matching key isn't present in HashMap, or if null is stored as a value for the
     *   specified key
     * - For a HashMap, methods that query or search a key use they keys methods hashCode() and equals()
     * - Method remove() removes a maximum of one key-value pair from a HashMap. Method clear() clears all the
     *   entries of a HashMap. Method remove() accepts a method parameter but clear() doesn't
     * - You can use methods size() and isEmpty() to query a HashMaps size
     * - You can use method putAll() to copy all the mappings from the specified map to a HashMap
     * - Method putAll() accepts an argument of type Map. It copies all the mappings from the specified map to
     *   the map that calls putAll(). For common keys, the values of map that call putAll() are replaced with
     *   the values of the Map object passed to putAll()
     * - The Map interface defines methods keySet(), values() and entrySet() to access keys, values and key-value
     *   pairs of a HashMap
     * - Method values() returns a Collection object, method keySet() returns a Set object and method entrySet()
     *   returns a Map.Entry object
     * - Class HashTable wasn't a part of the collection framework initially. It was retrofitted to implement the
     *   Map interface in Java 2, making it a member of the Java Collection framework. But its considered legacy
     *   code. Its roughly equivalent to a HashMap with some differences. The operations of a HashMap aren't
     *   synchronized, whereas the operations of a HashTable are synchronized
     *
     *                                  #####LinkedHashMap#####
     * - The LinkedHashMap IS-A HashMap with a predictable iteration order. Like a LinkedList, a LinkedHashMap
     *   maintains a double-linked list, which runs through all its entries
     * - A LinkedHashMap will always iterate over its elements in their order of insertion
     *
     *                                     #####TreeMap#####
     * - A TreeMap is sorted according to the natural ordering of its keys or as defined by a Comparator passed
     *   to its constructor
     * - TreeMap implements the SortedMap interface. Like HashMap and LinkedHashMap, the operations of a TreeMap
     *   aren't synchronized, which makes it unsafe to be used in a multithreaded environment
     * - The TreeMap performs all key comparisons by using method compareTo() or compare(). Two keys are considered
     *   equal by a TreeMap if they keys method compareTo() and compare() considers them equal
     * - When you create a TreeMap object, you should specify how its keys should be ordered. A key might define its
     *   natural ordering by implementing the Comparable interface. If it doesn't you should pass a Comparator
     *   object to specify the keys sort order
     * - The set of values that you retrieve from a TreeMap is sorted on its keys and not on its values
     * - You can create a TreeMap without passing it a Comparator object or without using keys that implement a
     *   Comparable interface. But adding key-value pairs to such a TreeMap will throw a runtime exception,
     *   ClassCastException
     * - When you pass a Comparator object to a TreeMap constructor, the natural order of its keys is ignored
     * - Because a TreeMap uses method compare() or compareTo() to determine the equality of its keys, it can
     *   access the value associated with a key, even though its key doesn't override its method equals() or
     *   hashCode()
     */
}
