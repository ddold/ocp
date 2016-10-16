package chapter1.javaclassdesign.overridingmethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dan on 10/16/16.
 */
class Book {
    void issueBook(int days){
        if(days > 0){
            System.out.println("Book issued");
        } else {
            System.out.println("Cannot issue for 0 or less days");
        }
    }

    synchronized protected List review(int id, List names) throws Exception {
        return null;
    }
}

class CourseBook extends Book {
    boolean onlyForReference;
    CourseBook(boolean val){
        onlyForReference = val;
    }

    @Override
    void issueBook(int days){
        if(onlyForReference){
            System.out.println("Reference book");
        } else {
            if(days < 14){
                super.issueBook(days);
            } else {
                System.out.println("days >= 14");
            }
        }
    }
    /**
     * @Override annotation is optional for an overriden method
     */

    @Override
    final public ArrayList review(int id, List names) throws IOException {
        return null;
    }
    /**
     * What values can and can't change when overriding methods?
     * - Access Modifiers - Overriden methods can have the same access modifier or else less restrictive
     * - Nonaccess Modifiers - Overriden methods can use any nonaccess modifiers.
     *     A final method in the base class cant be overriden
     *     A static method can't be overriden to a non static method
     * - Return Type - Define the same or a subtype used in the base class method
     *     If its a subtype, then it is known as a covarient
     * - Method Name - Exact match
     * - Parameters - Exact Match
     * - Exceptions Thrown - Throw none, same or a subclass of the exception thrown
     *     This applies only to checked exceptions.
     *     A overriding method can throw any unchecked exceptions (RuntimeException or Error) even if the overriden method doesn't
     */
}

public class BookExample {
    public static void main(String [] args){
        Book b = new CourseBook(true);
        b.issueBook(100);
        b = new CourseBook(false);
        b.issueBook(100);
        b = new Book();
        b.issueBook(100);
    }
}
/**
 * The compile time uses the reference type for method check
 * The runtime uses the instance type for the method invocation
 *
 * Book b = new CourseBook(true)
 * b.issueBook(100)
 * - When compiling, issueBook is checked if it exists in Book class because b is a type of Book
 * - When running, issueBook is ran in class CourseBook as the type of object referred by b is CourseBook
 */
