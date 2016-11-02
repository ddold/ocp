package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/2/16.
 */
class ParcelNonGen{
    private Object obj;
    public void set(Object obj){
        this.obj = obj;
    }

    public Object get() {
        return obj;
    }
}

class Phone{}
class Book{}

public class ParcelNonGeneric {
    public static void main(String [] args){
        ParcelNonGen parcel = new ParcelNonGen();
        parcel.set(new Phone());
        System.out.println((Book)parcel.get());
    }
}
