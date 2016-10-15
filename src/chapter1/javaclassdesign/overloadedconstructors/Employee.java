package chapter1.javaclassdesign.overloadedconstructors;

/**
 * Created by dan on 10/15/16.
 *
 * Overloaded constructors must be defined using different args list
 * Can't be defined overloaded by a mere change in their access modifiers
 *
 * Can only call another constructor by using the keyword this
 * this must also be the first statement in the constructor
 */
public class Employee {
    String name;
    int age;

    Employee() {
        name = "Dan";
        age = 26;
    }
    Employee(String name){
        this.name = name;
        age = 26;
    }
    Employee(int age, String name){
        this.age = age;
        this.name = name;
    }
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
}
