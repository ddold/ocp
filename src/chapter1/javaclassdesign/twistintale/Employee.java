package chapter1.javaclassdesign.twistintale;

/**
 * Created by dan on 10/15/16.
 *
 * Twist in the tale 1.2
 */
public class Employee {
    String name;
    int age;

    Employee() {
        this("Dan", 10);
    }
    Employee(String name, int age){
        //this();
        this.name = name;
        this.age = age;
    }

    void print() {
        print(age);
    }
    void print(int age){
        print();
    }
}

/**
 * Q. What is the output of the code?
 *
 * A. With line 16 uncommented the code would not compile because
 *    the constructors would continuously call each other recursively
 */
