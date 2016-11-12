package chapter4.genericsandcollections.collections_framework;

/**
 * Created by dan on 11/12/16.
 */
public class Deque {
    /**
     *         interface Lists                      interface Queue
     *                  ^                                   ^
     *                  |                                   |
     *                  |                                   |
     *                  |                          interface Deque
     *                  |                                   ^
     *                  |  _________________________________|
     *                  | |                                 |
     *             class LinkedList                    class ArrayDeque
     *
     *
     * Methods of Deque Interface
     * --------------------------
     *
     * Head                                             Tail
     *   * Add elements to head                           * Add elements to tail
     *     - addFirst(E)                                    - add(E)
     *     - offerFirst(E)                                  - addLast(E)
     *     - push(E)                                        - offer(E)
     *                                                      - offerLast(E)
     *
     *   * Remove elements from head                      * Remove element at tail
     *     - remove()                                       - removeLast()
     *     - removeFirst()
     *     - pop()
     *
     *   * Query elements at head                         * Query elements at tail
     *     - element()                                      - getLast()
     *     - getFirst()                                     - peekLast()
     *     - peek()
     *     - peekFirst()
     *
     *   * Query and remove from head                     * Queries and removes from tail
     *     - poll()                                         - pollLast()
     *     - pollFirst()
     *
     *   * Remove at random position
     *     - remove(Object)
     *     - removeFirstOccurrence()
     *     - removeLastOccurrence()
     *
     *   * Remove at random position
     *     - contains(Object o)
     *     - size()
     *
     *   * Iterator
     *     - iterator()
     *     - descendingIterator()
     */
}
