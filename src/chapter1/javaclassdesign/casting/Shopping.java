package chapter1.javaclassdesign.casting;

/**
 * Created by dan on 10/19/16.
 *
 * Object of type book is implicitly referred to or casted to type Printable
 * Object of type book is also implicitly referred to or casted to type ShoppingItem
 *
 * If you use printable.description it will fail to compile
 * But if you explicitly cast to object type Book it will work
 */
public class Shopping {
    public static void main(String [] args){
        Book book = new Book();
        Printable printable = book;
        printable.print();
        ((Book)printable).description();
        // This tells the compiler that you know that the actual object is of type Book
        // but youre using a reference variable of type Printable

        ShoppingItem shoppingItem = book;
        shoppingItem.description();

        Book book1 = new Book();
        //Chair chair = book1; - Wont compile, book is not a chair
        Printable printable1 = book1;
        Object object = book1; //Book is an object

        //---------------Implicit Upcasting----------------------//
        // You can assign a reference variable of a derived
        // class to a reference variable of its own type,
        // base classes and interfaces
        ShoppingItem shoppingItem1 = book1;   // Book is a ShoppingItem
        Printable printable2 = book;          // Book is Printable
        Object object2 = book;                // Book is an Object

        //---------------Implicit Downcasting----------------------//
        // You can't assign a reference variable of a base
        // class to a reference variable of its derived
        // classes or interfaces it doesnt implement
        ShoppingItem shoppingItem2 = new ShoppingItem();
        // Book book = shoppingItem2;
        // Chair chair = shoppingItem2;
        // Printable printable = shoppintItem2;
        Object object3 = shoppingItem2;

        //---------------Explicit Downcasting----------------------//
        // You can downcast an object to a type thats in its
        // inheritance tree using explicit casting
        ShoppingItem item = new ShoppingItem();
        Book book2 = (Book) item;
        Chair chair = (Chair) item;
        Printable printable3 = (Printable) item;
        // Chair, Book and Printable compile but throws a ClassCastException at runtime
        // Book and Chair cant downcast instance of parent object to subclass type
        // With Printable, ShoppintItem doesnt implement it

        /**
         * You can cast null to any type, it wont generate a compiler error or runtime exception
         *
         * You can access methods and variables of explicitly casted variables in single or multiple lines
         */
        // Multiple lines
        Book book3 = (Book) item;
        book.description();

        // Single line
        ((Book) item).description();
    }
}

interface Printable {
    void print();
}

class ShoppingItem {
    public void description() {
        System.out.println("Shopping Item");
    }
}

class Chair extends ShoppingItem {
    @Override
    public void description() {
        System.out.println("Chair");
    }
}

class Book extends ShoppingItem implements Printable {

    @Override
    public void description() {
        System.out.println("Book");
    }

    @Override
    public void print() {
        System.out.println("Printing Book");
    }
}