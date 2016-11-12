package chapter4.genericsandcollections.creating_generic_entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dan on 11/3/16.
 *
 * wildcard ? represents an unknown type
 */
class Courier {
    public static void wrapGift(List<?> list){
        // types in list are always going to be of type Object
        for(Object item : list){
            System.out.println("Giftwrap - " + item);
        }
    }
}

public class Wildcards {
    // Following won't compile
    //Lists<Gift> wishList = new ArrayList<Book>();

    public static void main(String [] args){
        // This solves the previous issue
        List<?> wishList = new ArrayList<Book>();
        // However if you try to add objects to the ArrayList it will fail to compile
        //wishList.add(new Book());
        /**
         * By declaring generic type of ?, any object could be added to the list
         * But ArrayList<Book> can only accept Book objects
         */

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Oracle"));
        bookList.add(new Book("Java"));
        Courier.wrapGift(bookList);
    }
}
