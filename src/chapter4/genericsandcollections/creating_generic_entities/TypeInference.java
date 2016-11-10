package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/10/16.
 */
public class TypeInference {
    // Instantiates ParcelGen with type argument String
    ParcelGen<String> parcel = new ParcelGen<String>();

    // Since Java 7 you can leave off the extra String at the end
    ParcelGen<String> parcel2 = new ParcelGen<>();

    // Compiles but gives a warning - attempt to assign raw type to generic type
    ParcelGen<String> parcel3 = new ParcelGen();

    // Wont compile
    //ParcelGen<> parcel4 = new ParcelGen<String>();

    public static void main(String [] args){
        Package<String> pack = new Package<>();

        // Can define parameter type for method in following
        pack.<Integer>deliver(new Integer(10));

        // Can leave it out
        pack.deliver("Hello");

        // Wont compile
        ///pack.<>deliver(20);

        pack.deliver(20);
    }
}


class Package <T> {
    public <X> void deliver(X x){
        System.out.println(x.getClass());
    }
}