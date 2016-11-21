package chapter6.exceptions_and_assertions.throws_clause_throw_statement;

/**
 * Created by dan on 11/21/16.
 */
public class Overview {
    /**
     * - The throws clause is part of a method declaration and lists exceptions that can be thrown by a method
     * - The throws clause is used with a method declaration to specify that the method won't handle the mentioned exception
     *   (or subclasses) and might throw it to the calling method. The calling method should handle this thrown exception
     *   appropriately or declare it to be rethrown
     * - The throw statement is used to throw an exception from a method, constructor or an initialization block. When an
     *   exceptional condition occurs in a method, that method can handle it (by using a try statement) or throw the exception
     *   to the calling method by using the throw statement
     * - A method indicates that it throws a checked exception by including its name in the throws clause, in its method
     *   declaration
     * - When you use a method that throws a checked exception, you must either enclose the code within a try block or declare
     *   it to be rethrown in the calling methods declaration. This is also known as the handle-or-declare rule
     * - A method can thrown a runtime exception or error irrespective of whether its name is included in the throws clause
     * - A method can throw a subclass of the exception mentioned in its throws clause but not a superclass
     * - A method can handle the exception and still declare it to be thrown
     * - A method can declare to throw any type of exception, checked or unchecked, even if it doesn't. But a try block can't
     *   define a catch block for a checked exception (other than Exception) if the try block doesn't throw that checked
     *   exception or use a method that declares to throw that checked exception
     */
}
