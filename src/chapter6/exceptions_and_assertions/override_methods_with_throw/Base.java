package chapter6.exceptions_and_assertions.override_methods_with_throw;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dan on 11/23/16.
 */
public class Base {
    public void aMethod(){}
    public void bMethod() throws IOException{}
    public void cMethod() throws FileNotFoundException{}
    public void dMethod() throws IOException{}
    public void eMethod() throws IOException{}

    public void aRuntime(){}
    public void bRuntime() throws RuntimeException{}
    public void cRuntime() throws NullPointerException{}
    public void dRuntime() throws Error{}
}

/**
 *  Rules
 * -------
 *
 * 1. If a base class method doesn't declare to throw a checked exception, an overriding method in the derived class can't
 *    declare to throw a checked exception
 * 2. If a base class method declares to throw a checked exception, an overriding method in the derived class can choose not
 *    to declare to throw any checked exception
 * 3. If a base class method declares to throw a checked exception, an overriding method in the derived class cannot declare
 *    to throw a superclass of the exception thrown by the one in the base class
 * 4. If a base class method declares to throw a checked exception, an overriding method in the derived class can declare to
 *    throw the same exception
 * 5. If a base class method declares to throw a checked exception, an overriding method in the derived class can declare to
 *    throw a derived class of the exception thrown by the one in the base class
 */

class Derived extends Base {
    // Because Base class aMethod() doesnt throw a checked exception, Derived class aMethod can't
    //public void aMethod() throws Exception {}

    // bMethod() doesn't have to declare to throw any exception just coz derived class does
    public void bMethod(){}

    // Fails because IOException is the superclass of FileNotFoundException
    //public void cMethod() throws IOException{}

    // throws the same exception so it is fine
    public void dMethod() throws IOException{}

    // FileNotFoundException IS-A IOException so this works fine
    public void eMethod() throws FileNotFoundException{}


    // This works fine as the exception is unchecked
    public void aRuntime() throws RuntimeException{}
    // this works as you dont have to declare checked exceptions
    public void bRuntime(){}
    public void cRuntime() throws RuntimeException{}
    public void dRuntime() throws NullPointerException{}
}
