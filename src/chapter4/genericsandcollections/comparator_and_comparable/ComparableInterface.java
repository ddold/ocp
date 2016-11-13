package chapter4.genericsandcollections.comparator_and_comparable;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by dan on 11/13/16.
 */
public class ComparableInterface{
    public static void main(String [] args){
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("Shreya", 12));
        set.add(new Person("Harry", 40));
        set.add(new Person("Paul", 30));

        Iterator<Person> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Person implements Comparable<Person>{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * compareTo() is used to define the natural order of the objects age
     * if its changed to return 0 only the one object is added to the TreeSet
     * as all of the elements will be duplicate
     */
    @Override
    public int compareTo(Person person) {
        //return this.age - person.age;
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
