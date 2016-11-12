package chapter4.genericsandcollections.collections_framework;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by dan on 11/12/16.
 */
public class ArrayLists {
    /**
     * constructors of ArrayList
     * - ArrayList()
     * - ArrayList(Collection<? extends E> c)
     * - ArrayList(int initialCapacity)
     */

    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();

        // Adds elements to ArrayList - duplicates allowed
        list.add("Harry");
        list.add("Selvan");
        list.add("Harry");

        // Adds element to 0 causing other elements to shift to right
        list.add(0, "Paul");

        // Uses equals() to find and remove first occurrence of object
        list.remove("Harry");

        // Replaces value at position 0 with new object
        String oldVal = list.set(0, "Shreya");

        // Throws runtime exc because only 3 elements in list
        //list.get(7);

        // contains() searches sequentially and uses equals() to find first matching occurrence
        System.out.println("list contains Harry : " + list.contains("Harry"));

        ListIterator<String> iterator = list.listIterator();
        // hasNext() returns boolean value
        while(iterator.hasNext()){
            // next() accesses and returns next value
            System.out.println(iterator.next());
        }
    }
}

class UsingEquals {
    public static void main(String [] args){
        ArrayList<EmpNoEquals> list = new ArrayList<>();
        list.add(new EmpNoEquals(121, "Shreya"));
        list.add(new EmpNoEquals(55, "Harry"));
        list.add(new EmpNoEquals(15, "Paul"));
        list.add(new EmpNoEquals(121, "Shreya"));

        System.out.println(list.size());

        EmpNoEquals emp = new EmpNoEquals(121, "Shreya");
        list.remove(emp);

        // still prints 4 because EmpNoEquals does not override equals()
        System.out.println(list.size());

        System.out.println("----------------------------");

        ArrayList<EmpEquals> list2 = new ArrayList<>();
        list2.add(new EmpEquals(121, "Shreya"));
        list2.add(new EmpEquals(55, "Harry"));
        list2.add(new EmpEquals(15, "Paul"));
        list2.add(new EmpEquals(121, "Shreya"));

        System.out.println(list2.size());

        EmpEquals emp2 = new EmpEquals(121, "Shreya");
        list2.remove(emp2);

        // Prints 3 because EmpEquals overrides equals() correctly
        System.out.println(list2.size());
    }
}

class EmpNoEquals {
    int id;
    String name;
    EmpNoEquals(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class EmpEquals {
    int id;
    String name;
    EmpEquals(int id, String name){
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object obj){
        if(obj instanceof EmpEquals){
            EmpEquals emp = (EmpEquals) obj;
            if(emp.id == this.id && emp.name.equals(this.name)){
                return true;
            }
        }
        return false;
    }
}