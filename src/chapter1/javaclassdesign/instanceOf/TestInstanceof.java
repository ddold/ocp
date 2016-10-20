package chapter1.javaclassdesign.instanceOf;

/**
 * Created by dan on 10/20/16.
 *
 * instanceof is used to logically test whether an object is a valid type of a class or interface
 * Should only proceed with explicit casting if returns true or else risk running into ClassCastException
 * at runtime
 *
 * Returns false if reference variable being compared to is null
 * Never throws a runtime exception, it returns either true/false
 * If used with inconvertible types, the code won't compile
 *
 * instanceof is preceded by a value - literal value or variable name - and is then followed
 * by a class, interface or enum name.
 *
 * instanceof is all lowercase, there is no uppercase 'o' in of
 * All Java keywords are lowercase
 */
public class TestInstanceof {
    public static void main(String [] args){
        Course c = new Course("Java");
        Course c2 = new Course("Java");
        Student student = new Student("Java");
        System.out.println(c.equals(c2));
    }
}

class Course {
    String title;
    Course(){}
    Course(String title){
        this.title = title;
    }

    public boolean equals(Object obj){
        if(obj instanceof Course){
            Course c = (Course) obj;
            return (title.equals(c.title));
        } else {
            return false;
        }
    }
}

class Student extends Course {
    String title;
    Student(String title){
        this.title = title;
    }
}
