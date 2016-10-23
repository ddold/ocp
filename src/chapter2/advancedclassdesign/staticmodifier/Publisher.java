package chapter2.advancedclassdesign.staticmodifier;

/**
 * Created by dan on 10/23/16.
 *
 *                  Static variables
 *                  ----------------
 * Unlike instance variables, which are initialized for each instance, static class variables
 * are initialized only once, when they are loaded into memory.
 * Default values are;
 * - boolean => false
 * - char => '\u0000'
 * - byte, short, int => 0
 * - long => 0L
 * - float => 0.0F
 * - double => 0.0D
 */
class Book {
    // Best practice is to use encapsulation - set vars to private and public methods to get values
    static int bookCount;
    public Book() {
        ++bookCount;
    }
}

public class Publisher {
    public static void main(String[] args){
        System.out.println(Book.bookCount); // Prints 0
        Book b1 = new Book();
        Book b2 = new Book();
        System.out.println(Book.bookCount); // Prints 2

        b1.bookCount = 10;  // change bookCOunt to 10 on b1 instance variable
        System.out.println(b2.bookCount); // Prints 10 as bookCount is static
    }
}

/**
 * You can access a static variable via the class name or the reference variable
 * But it is better to refer to it via the class name otherwise the user could mistake it
 * for being a reference variable
 *
 * Can use a combination of static and final modifiers to create constants
 * Can't declare and initialize a variable using a method that throws a checked exception
 */
