package chapter1.javaclassdesign.overridingmethods;

/**
 * Created by dan on 10/17/16.
 *
 * Object method equals() returns
 *   => return (this == obj)
 * It compares both of the objects references, not if their values equal or not
 *
 * To logically find if objects equals the method has to be overriden
 * The goal is to check for equality of objects, not if they refer to the same reference
 */
public class Equals {

    public static void main(String [] args){
        String name1 = "Dan";
        String name2 = new String("Dan");
        System.out.println(name1.equals(name2));
        /**
         * Class String overrides equals() to check whether the 2 String objects
         * define the exact same sequence of characters
         * So thats why true is printed even though they are 2 different objects
         */

        Object c1 = new Course("OCP", 6);
        Object c2 = new Course("OCP", 6);
        System.out.println(c1.equals(c2));
    }
}

class Course {
    String title;
    int duration;

    Course(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public boolean equals(Object o){
        if(o != null && o instanceof Course){
            Course c = (Course) o;
            return (title.equals(c.title) && duration == c.duration);
            // title.equals uses Strings overriden equals method
        } else {
            return false;
        }
    }
}


/**
 * Rules for overriding method equals()
 * ------------------------------------
 * * All variables are non null
 * 1. Reflexive - x.equals(x) should always be true
 * 2. Symmetric - x.equals(y) should only be true if y.equals(x) is true
 * 3. Transitive - if x.equals(y) returns true and y.equals(z) returns true
 *                 then x.equals(z) should return true
 * 4. Consistant - multiple invocations of x.equals(y) consistantly return true or false
 * 5. x.equals(null) should always return false
 */