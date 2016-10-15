package chapter1.javaclassdesign.overloadedmethods;

/**
 * Created by dan on 10/15/16.
 */
class Employee {}
class Engineer extends Employee {}
class CEO extends Employee {}
class Travel {
    static String bookTicket(Engineer val){
        return "economy class";
    }
    static String bookTicket(CEO val){
        return "business class";
    }
    static String bookTicket(Employee emp){
        return "bus ticket";
    }
}

/**
 * Overloaded methods can be defined with object references as params
 */

public class TravelAgent {
    public static void main(String [] args){
        System.out.println(Travel.bookTicket(new Engineer()));
        System.out.println(Travel.bookTicket(new CEO()));
        System.out.println(Travel.bookTicket(new Employee()));

        Employee emp1 = new CEO();
        Employee emp2 = new Engineer();
        System.out.println(Travel.bookTicket(emp1));
        System.out.println(Travel.bookTicket(emp2));
    }
}
/**
 * An Employee object of type CEO or Engineer calls
 * the overloaded method that uses the type Employee
 * If the method bookTicket(Employee emp) is removed
 * lines 33 & 34 won't compile
 */