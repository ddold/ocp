package chapter4.genericsandcollections.collections_framework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by dan on 11/12/16.
 */
public class TreeSets {
    /**
     * Constructors used;
     * - TreeSet()
     * - TressSet(Collection<? extends E> c)
     * - TreeSet(Comparator<? super E> comparator)
     * - TreeSet(SortedSet<E> s)
     *
     * In the absence of passing a Comparator instance to a TreeSet constructor, the objects that you add to
     * a TreeSet must implement Comparable. String implements Comparable so thats why there is no issue with
     * adding to the TreeSet
     */

    public static void main(String [] args){
        String[] myNames = {"Shreya", "Harry", "Paul", "Shreya", "Selvan"};
        TreeSet<String> treeSetNames = new TreeSet<>(Arrays.asList(myNames));

        Iterator<String> iterator = treeSetNames.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
