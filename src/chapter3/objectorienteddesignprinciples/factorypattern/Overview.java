package chapter3.objectorienteddesignprinciples.factorypattern;

/**
 * Created by dan on 10/30/16.
 */
public class Overview {
    /**
     * - One of the most frequently used design patterns, multiple flavors of this pattern exist;
     *   -> Simple Factory
     *   -> Factory Method
     *   -> Abstract Factory
     * - The Simple Factory pattern creates and returns objects of classes that extend a common parent class or implement
     *   a common interface. The objects are created without exposing the instantiation logic to the client. The calling
     *   class is decoupled from knowing the exact name of the instantiated class
     * - The intent of the Factory Method pattern is to define an interface for creating an object but let subclasses decide
     *   which class to instantiate. The Factory Method pattern lets a class defer instantiation to its subclasses
     * - The Abstract Factory pattern is used to create a family of related products (in contrast, the Factory Method pattern
     *   creates one type of object). This pattern also defines an interface for creating objects but it lets subclasses
     *   decide which class to instantiate
     * - Benefits of the Factory pattern are
     *   -> Prefers method invocation over direct constructor calls
     *   -> Prevents tight coupling between a class implementation and your application
     *   -> Promotes creation of a cohesive classes
     *   -> Promotes programming to an interface
     *   -> Promotes flexibility. Object instantiation logic can be changed without affecting the clients that use objects.
     *      It also allows addition of new concrete classes
     * - The following don't apply to the Factory pattern
     *   -> It doesn't eliminate the need of overloading constructors in class implementations
     *   -> It doesn't encourage the use of any particular access modifier. It isn't compulsory to define private members
     *      to use this pattern
     *   -> It won't slow your application
     *   -> It isn't related to how to monitor objects for change
     * - The Java API uses the Factory pattern in many of its classes, including;
     *   -> Calendar.getInstance()
     *   -> Arrays.asList()
     *   -> ResourceBundle.getBundle()
     *   -> DriverManager.getConnectionEstablish()
     *   -> DriverManager.getDriver()
     *   -> Connection.executeQuery()
     *   -> Statement.executeQuery()
     *   -> NumberFormat.getInstance()
     *   -> NumberFormat.getNumberFormat()
     *   -> NumberFormat.getCurrencyInstance()
     *   -> NumberFormat.getIntegerInstance()
     *   -> Executors.newFixedThreadPool()
     *   -> Executors.newCachedThreadPool()
     *   -> Executors.newSingleThreadExecutor()
     */
}
