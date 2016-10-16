package chapter1.javaclassdesign.overridingmethods;

/**
 * Created by dan on 10/16/16.
 */
class Books {
    static void printName() {
        System.out.println("Book");
    }
}

class CourseBooks extends Books {
    static void printName() {
        System.out.println("CourseBook");
    }
}

public class StaticBookExample {
    public static void main(String [] args){
        Books base = new Books();
        base.printName();

        Books derived = new CourseBooks();
        derived.printName();
    }
}
/**
 * Method printName in class CourseBooks hides printName in class Books.
 * It doesn't override it. Because static methods are bound at compile time
 * the method printName() thats called depends on the type of reference variable
 */
