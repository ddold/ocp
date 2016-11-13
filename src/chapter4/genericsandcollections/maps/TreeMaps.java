package chapter4.genericsandcollections.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dan on 11/13/16.
 */
public class TreeMaps {
    public static void main(String [] args){
        // String implements Comparable so don't need to define it for TreeMap
        Map<IceCream, String> flavorMap = new TreeMap<>();
        flavorMap.put(IceCream.CHOCOLATE, "Paul");
        flavorMap.put(IceCream.STRAWBERRY, "Shreya");

        for(String s : flavorMap.values()){
            System.out.println(s);
        }

        System.out.println();

        /**
         * The following doesn't because Flavor doesnt implement Comparable
         * It wont fail at compile/runtime
         * But once you put values into the TreeMap it throws ClassCastException at runtime
         */
        Map<Flavor, String> treeMap = new TreeMap<>();
        //treeMap.put(new Flavor("Chocolate"), "Dan");

        /**
         * AnotherFlavor class implements Comparble interface
         * while MyComparator implements Comparator interface
         * compareTo() from AnotherFlavor prints values in ascending order
         * compare() from MyComparator prints values in reverse order
         *
         * When Comparator object is passed TreeMap constructor, the natural ordering of the keys is ignored
         */
        Map<AnotherFlavor, String> treeMap2 = new TreeMap<>(new MyComparator());
        treeMap2.put(new AnotherFlavor("Chocolate"), "Paul");
        treeMap2.put(new AnotherFlavor("Vanilla"), "Dan");

        for (AnotherFlavor flav : treeMap2.keySet()){
            System.out.println(flav.name);
        }

        System.out.println();

        /**
         * Even though AnotherFlavor does not override hashCode() or equals()
         * Because it implements Comparable interface and is added to a TreeMap
         * compareTo() returns a correct value
         * If this was a HashSet null would be returned because it relies on hashCode() and equals()
         */
        Map<AnotherFlavor, String> flavorStringMap = new TreeMap<>();
        flavorStringMap.put(new AnotherFlavor("Chocolate"), "Paul");
        flavorStringMap.put(new AnotherFlavor("Apple"), "Harry");
        System.out.println("From TreeMap : " + flavorStringMap.get(new AnotherFlavor("Apple")));

        Map<AnotherFlavor, String> flavorStringMap2 = new HashMap<>();
        flavorStringMap2.put(new AnotherFlavor("Chocolate"), "Paul");
        flavorStringMap2.put(new AnotherFlavor("Apple"), "Harry");
        System.out.println("From HashMap : " + flavorStringMap2.get(new AnotherFlavor("Apple")));
    }
}

class AnotherFlavor implements Comparable<AnotherFlavor>{
    String name;
    AnotherFlavor(String name){
        this.name = name;
    }
    @Override
    public int compareTo(AnotherFlavor anotherFlavor) {
        return this.name.compareTo(anotherFlavor.name);
    }
}

class MyComparator implements Comparator<AnotherFlavor>{
    @Override
    public int compare(AnotherFlavor anotherFlavor, AnotherFlavor t1) {
        return t1.name.compareTo(anotherFlavor.name);
    }
}

class Flavor {
    String name;
    Flavor(String name){
        this.name = name;
    }
}
