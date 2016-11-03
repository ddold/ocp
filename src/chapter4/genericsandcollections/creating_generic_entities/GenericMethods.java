package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/3/16.
 */
public class GenericMethods <X> {
    // Generic type is declared after access & non access modifier and before the return type
    // Generic type can be different than the one defined in the class definition
    public static <T> void maps(T t){}

    // Can use the generic type defined in method signature within the method
    // Can even define the generic type as the return type of the method
    public <E> void deliver(E[] array){
        for(E item : array){
            System.out.println("Delivering " + item);
        }
    }
}
