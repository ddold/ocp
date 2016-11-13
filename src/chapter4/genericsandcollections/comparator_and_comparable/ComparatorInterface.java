package chapter4.genericsandcollections.comparator_and_comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by dan on 11/13/16.
 */
public class ComparatorInterface {
    public static void main(String [] args){
        TreeSet<Man> set = new TreeSet<>(
                new Comparator<Man>() {
                    @Override
                    public int compare(Man p1, Man p2) {
                        return (p1.age - p2.age);
                    }
                }
        );
        set.add(new Man("Shreya", 12));
        set.add(new Man("Harry", 40));
        set.add(new Man("Paul", 30));

        Iterator<Man> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class Man{
    String name;
    int age;
    Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
