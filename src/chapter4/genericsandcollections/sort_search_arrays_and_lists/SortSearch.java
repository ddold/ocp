package chapter4.genericsandcollections.sort_search_arrays_and_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by dan on 11/13/16.
 */
public class SortSearch {
    static final Comparator<Integer> INT_COMPARATOR = new Comparator<Integer>() {
        @Override
        public int compare(Integer n1, Integer n2) {
            return n2.compareTo(n1);
        }
    };

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9999);
        list.add(10);
        list.add(55);
        list.add(28);

        Collections.sort(list, null);
        System.out.println(Collections.binarySearch(list, 55));

        Collections.sort(list, INT_COMPARATOR);
        System.out.println(Collections.binarySearch(list, 55));

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        Object[] myArray = new Object[3];
        myArray[0] = "Java";
        myArray[1] = "EJava";
        myArray[2] = "Guru";

        // Array is not sorted so will produce undefined results
        int position = Arrays.binarySearch(myArray, "Java");
        System.out.println(position);

        Arrays.sort(myArray);
        position = Arrays.binarySearch(myArray, "Java");
        System.out.println(position);
    }
}
