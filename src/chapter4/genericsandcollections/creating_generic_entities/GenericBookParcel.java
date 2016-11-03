package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/3/16.
 */
public class GenericBookParcel<T> extends ParcelGen<T> {
    /**
     * If an extended class is also generic, it has to have the same type as base class
     */
}

class MultipleGenericBookParcel<X, T> extends ParcelGen<T>{
    /**
     * Can define extra types in extended class
     * But still have to include base class type
     */
}

class DiffGenericBookParcel<X> extends ParcelGen<String>{
    /**
     * Can use a different generic type for extended class
     * but have to pass literal type to base class
     */
}

class NonGenericBookParcel extends ParcelGen<String> {
    /**
     * If class is not generic
     * pass literal type to base class
     */

    public static void main(String [] args){
        // correct way to create object of non generic class that extends generic class
        // Dont include the <> or include types
        NonGenericBookParcel np = new NonGenericBookParcel();

        // Following won't compile
        // Because it extends a genric class, doesn't mean it should include the <>
        //NonGenericBookParcel<String> np2 = new NonGenericBookParcel<>();
    }
}
