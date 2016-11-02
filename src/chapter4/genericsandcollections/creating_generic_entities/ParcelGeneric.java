package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/2/16.
 */
class ParcelGen <T> {
    private T t;
    public void set(T t){
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class ParcelGeneric {
    public static void main(String [] args){
        // Don't have to include Book in the second <>
        ParcelGen<Book> parcel = new ParcelGen<>();
        parcel.set(new Book());
        Book myBook = parcel.get();

        // fails to compile
        // System.out.println((Phone)parcel.get());
    }
}
