package chapter4.genericsandcollections.collections_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by dan on 11/12/16.
 *
 * HashSet can store only one null element
 */
public class HashSets {
    public static void main(String [] args){
        String s1 = new String("Harry");
        String s2 = new String("Shreya");
        String s3 = new String("Selvan");
        String s4 = new String("Shreya");

        HashSet<String> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        // String s4 is not added as s1 == s4

        for(String e : set){
            System.out.println(e);
        }
    }
}

class ManipulateHashSet {
    public static void main(String [] args){
        List<String> list = new ArrayList<String>();
        list.add("Shreya");
        list.add("Selvan");

        HashSet<String> set = new HashSet<>();
        set.add("Harry");
        set.addAll(list);

        System.out.println(set.contains("Shreya"));
        System.out.println(set.remove("Selvan"));

        for(String e : set){
            System.out.println(e);
        }
    }
}
