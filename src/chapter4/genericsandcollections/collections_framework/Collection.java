package chapter4.genericsandcollections.collections_framework;

/**
 * Created by dan on 11/12/16.
 */
public class Collection {
    /**
     * Collection interface is generic
     * Here is its decleration;
     * public interface Collection<E> extends Iterable<E>
     *
     *
     *                                  Interface Itarable
     *                                           ^
     *                                           |
     *                                           |
     *                                  Interface Collection
     *                                           ^
     *                                           |
     *              _____________________________|_____________________________
     *             |                             |                            |
     *             |                             |                            |
     *    Interface Lists                Interface Sets                Interface Queue        Interface Map
     *                                           ^                            ^                      ^
     *                                           |                            |                      |
     *                                           |                            |                      |
     *                                  Interface SortedSet          Interface Deque        Interface SortedMap
     *
     *
     *
     * Methods of Collection Interface
     * -------------------------------
     *
     * Modification Methods:
     * * Add Elements
     *   - add()
     *   - addAll()
     *
     * * Remove Elements
     *   - clear()
     *   - remove()
     *   - removeAll()
     *   - retainAll()
     *
     *
     * Query Methods:
     * - contains()
     * - equals()
     * - isEmpty()
     * - size()
     *
     *
     * Miscellaneous
     * - iterator()
     * - toArray()
     *
     *
     */
}
