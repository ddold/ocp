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

        ShoppingItem shoppingItem = book;
        shoppingItem.description();

        Book book1 = new Book();
        //Chair chair = book1; - Wont compile, chair is not a book
        Printable printable1 = book1;
        Object object = book1; //Book is an object
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