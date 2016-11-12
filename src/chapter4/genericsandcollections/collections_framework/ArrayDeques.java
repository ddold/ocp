package chapter4.genericsandcollections.collections_framework;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * Created by dan on 11/12/16.
 */
public class ArrayDeques {
    /**
     * constructors of ArrayDeque
     * - ArrayDeque()
     * - ArrayDeque(Collection<? extends E> c)
     * - ArrayDeque(int numElements)
     *
     * add(), addFirst(), addLast(), offer(), offerFirst(), offerLast() and push() throw a NullPointerException
     * if you try to add null element into an ArrayDeque
     */
    public static void main(String [] args){
        String[] strArray = {"A1", "B2", "C3"};

        // Arrays.asList() converts array to Lists
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(Arrays.asList(strArray));

        // push() adds element to beginning
        arrayDeque.push("D4");

        // offer() adds element at Deque end
        arrayDeque.offer("E5");

        // Can't add null to ArrayDeque - throws NullPointer
        //arrayDeque.push(null);

        // pop() returns and removes element at Deque beginning
        System.out.println(arrayDeque.pop());

        // remove() also returns and removes element at Deque beginning
        System.out.println(arrayDeque.remove());

        // add() adds element to end of queue
        arrayDeque.add("F6");

        // peek() queries and returns element at beginning of queue
        System.out.println(arrayDeque.peek());

        System.out.println(arrayDeque);
    }
}
