package chapter4.genericsandcollections.collections_framework;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dan on 11/12/16.
 */
public class LinkedLists {
    /**
     * constructor of LinkedList
     * - LinkedList()
     * - LinkedList(Collection<? extends E> c)
     */

    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<String>();

        // offer() adds to the end
        list.offer("Java");

        // push() adds to beginning
        list.push("e");

        // add element to position 1
        list.add(1, "Guru");

        // prints LInkedList
        System.out.println(list);

        // remove() finds and removes first occurrence of object - returns true if successful, false if not
        System.out.println(list.remove("e"));
        System.out.println(list.remove("a"));

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
