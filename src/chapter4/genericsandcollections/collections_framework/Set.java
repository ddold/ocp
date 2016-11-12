package chapter4.genericsandcollections.collections_framework;

/**
 * Created by dan on 11/12/16.
 */
public class Set {
    /**
     *                 -------------------->interface Set<-----------------------------------
     *                 |                                          |                         |
     *                 |                                          |                         |
     *                 |                                          |                         |
     *        interface SortedSet                            class HashSet             class LinkedHashSet
     *                 ^
     *                 |
     *                 |
     *            class TreeSet
     *
     *
     * Methods of Set Interface
     * ------------------------
     *
     * Modification Methods
     *   * Add elements
     *     - add(E e)
     *     - addAll(Collection<? extends E> c)
     *
     *   * Remove elements
     *     - clear()
     *     - remove(Object o)
     *     - removeAll(Collection<?> c)
     *     - retainAll(Collection<?> c)
     *
     * Query Methods
     *   - contains(Object o)
     *   - containAll(Collection<?> c)
     *   - equals(Object o)
     *   - isEmpty()
     *   - size()
     *
     * Miscellaneous
     *   - hashCode()
     *   - iterator()
     *   - toArray()
     *   - toArray(T[] a)
     */
}
