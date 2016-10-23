package chapter2.advancedclassdesign.staticmodifier;

/**
 * Created by dan on 10/23/16.
 *
 *                  Static methods
 *                  --------------
 * Static methods don't need an instance of the class, they can be even called
 * if no instance of the class exist
 * Static methods can't access non static variables and methods
 * non static methods can access static variables/methods
 */
class Books {
    private static int bookCount;

    public static int getBookCount() {
        return bookCount;
    }

    public void incrementBook() {
        ++bookCount;
    }
}

public class MyClass {
    public static void main(String [] args){
        System.out.println(Books.getBookCount());
        Books b1 = new Books();
        Books b2 = new Books();
        b1.incrementBook();
        b2.incrementBook();
        System.out.println(Books.getBookCount());
    }
}

/**
 * Can also use static methods to define utility methods - methods that usually
 * manipulate the method params to compute and return an appropriate value
 * example;
 *  static double average(double num1, double num2){
 *      return (num1 + num2)/2;
 *  }
 *
 *  utility method does not always need to define params
 */