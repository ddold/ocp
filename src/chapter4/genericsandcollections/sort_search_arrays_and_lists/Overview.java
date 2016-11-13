package chapter4.genericsandcollections.sort_search_arrays_and_lists;

/**
 * Created by dan on 11/13/16.
 */
public class Overview {
    /**
     * - Class Arrays in the collections framework defines multiple methods to sort complete or partial arrays
     *   of primitive data types and objects
     * - When method Arrays.sort() accepts fromIndex and toIndex values to sort a partial array, the element
     *   stored at position fromIndex is sorted but the element stored at position toIndex isn't
     * - A space has a lower ASCII or Unicode value than lowercase or uppercase letters. When arranged in an
     *   ascending order, a String value that starts with a space is placed before the String values that don't
     *   start with a space
     * - Class Collections defines method sort() to sort objects of List
     * - Classes Arrays and Collections define method binarySearch() to search a sorted array or a List for a
     *   matching value using the binary search algorithm. The array or List must be sorted according to the
     *   natural order of its elements or as specified Comparator. If you pass this method an unsorted list, the
     *   results are undefined. If more than one value matches the target key value to be searched, the method
     *   can return any of these values
     * - Method binarySearch() returns the index of the search key if its contained in the list; otherwise it
     *   returns (-(insertion point) -1). The insertion point is defined as the point at which the key would be
     *   inserted into the list: the index of the first element greater than the key, or list.size() if all
     *   elements in the list are less than the specified key. Note that this guarantees that the return value
     *   will be >= 0 if and only if the key is found
     */
}
