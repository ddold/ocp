package chapter4.genericsandcollections.sort_search_arrays_and_lists;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dan on 11/13/16.
 */
public class SortArrays {
    public static void main(String [] args){
        int[] intArray = {20, 14, 4, 10, 5, 3};
        for(int a : intArray){
            System.out.print(a + " ");
        }
        Arrays.sort(intArray);
        System.out.println();
        for(int a : intArray){
            System.out.print(a + " ");
        }

        System.out.println();

        intArray = new int[]{20, 14, 4, 10, 5, 3};
        for(int a : intArray){
            System.out.print(a + " ");
        }
        Arrays.sort(intArray, 1, 5);
        System.out.println();
        for(int a : intArray){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        String [] strArray = {"ocP", "oCP", "OcP", "OCp", "Ocp"};
        for(String s : strArray){
            System.out.print(s + " ");
        }
        Arrays.sort(strArray);
        System.out.println();
        for(String s : strArray){
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        NewPerson p1 = new NewPerson("Shreya", 32);
        NewPerson p2 = new NewPerson("Harry", 40);
        NewPerson p3 = new NewPerson("Paul", 30);

        NewPerson [] objArray = new NewPerson[]{p1, p2, p3};

        Arrays.sort(objArray, new Comparator<NewPerson>() {
            @Override
            public int compare(NewPerson p1, NewPerson p2) {
                return (p1.age - p2.age);
            }
        });

        for(NewPerson p : objArray){
            System.out.print(p + " ");
        }
    }
}

class NewPerson {
    String name;
    int age;
    NewPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
