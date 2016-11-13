package chapter4.genericsandcollections.sort_search_arrays_and_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dan on 11/13/16.
 *
 * Collections.sort() sorts object of List
 * Theres 2 sorting methods;
 *  - static <T extends Comparable<? super T>> void sort(List<T> list)
 *  - static <T> void sort(List<T> list, Comparator<? super T> c)
 */
public class SortCollections {
    public static void main(String [] args){
        List<Integer> integers = new ArrayList<>();
        integers.add(new Integer(200));
        integers.add(new Integer(87));
        integers.add(new Integer(999));

        for(Integer i : integers){
            System.out.print(i + " ");
        }

        System.out.println("After calling Collections.sort()");
        Collections.sort(integers);

        for(Integer i : integers){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        Star s1 = new Star("Sun", 7777.77);
        Star s2 = new Star("Sirius", 999999.99);
        Star s3 = new Star("Pilatim", 222.22);

        List<Star> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list);

        for(Star star : list){
            System.out.println(star);
        }

        System.out.println();
        list.add(new Star("Litmier", 4444.44));

        Collections.reverse(list);

        for(Star star : list){
            System.out.println(star);
        }
    }
}

class Star implements Comparable<Star>{
    String name;
    double mass;
    Star(String name, double mass){
        this.name = name;
        this.mass = mass;
    }
    @Override
    public int compareTo(Star star) {
        return (int)(this.mass - star.mass);
    }

    @Override
    public String toString() {
        return name + " : " + mass;
    }
}