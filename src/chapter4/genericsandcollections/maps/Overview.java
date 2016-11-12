package chapter4.genericsandcollections.maps;

/**
 * Created by dan on 11/12/16.
 */
public class Overview {
    /**
     *                                  Map
     *                                 -----
     * - Unlike the other interfaces from the collection framework, like List and Set, the Map interface
     *   doesn't extend the Collection interface
     * - A Map defines key-value pairs where a key can map to a 0 or 1 value
     * - Map objects don't allow the addition of duplicate keys
     * - The addition of null value as a key or value depends on a particular Map implementation. A HashMap
     *   and a LinkedHashMap allow insertion of null as a key, but TreeMap doesn't - it throws an exception
     *
     *                          #####HashMap#####
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
     * - Methods containsKey() and containsValue() check
     */
}
