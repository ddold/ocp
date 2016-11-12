package chapter4.genericsandcollections.collections_framework;

/**
 * Created by dan on 11/12/16.
 */
public class List {
    /**
     *
     *      interface List                             interface Queue
     *               ^                                          ^
     *               |                                          |
     *               |_______ class ArrayList          interface Deque
     *               |                                          ^
     *               |                                          |
     *               |_______ class LinkedList _________________|
     *
     *
     * Methods of List interface
     * -------------------------
     *
     * Modification Methods:
     * * Add Elements
     *   - add(E e)
     *   - add(int index, E e)
     *   - addAll(Collection<? extend E> c)
     *   - addAll(int index, Collection<? extend E> c)
     *
     * * Remove Elements
     *   - clear()
     *   - remove(int index)
     *   - remove(Object o)
     *   - removeAll(Collection<?> c)
     *   - retainAll(Collection<?> c)
     *
     * * Modify Elements
     *   - set(int index, E c)
     *
     * Query Methods:
     * - contains(Object o)
     * - containAll(Collection<?> c)
     * - equals(Object o)
     * - get(int index)
     * - indexOf(Object o)
     * - isEmpty()
     * - lastIndexOf(Object o)
     * - size()
     * - subList(int from, int to)
     *
     * Miscellaneous:
     * - hashCode()
     * - toArray()
     * - toArray(T[] a)
     *
     * Iterator Methods
     * - iterator()
     * - listIterator()
     * - listIterator(int index)
     */
}
