package chapter6.exceptions_and_assertions.throws_clause_throw_statement;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dan on 11/21/16.
 */
public class DemoThrowsException {
    // method throws checked exception
    public static void readFile(String file) throws FileNotFoundException {
        boolean found = findFile(file);
        if(!found) {
            throw new FileNotFoundException("Missing file");
        }
    }

    static boolean findFile(String file){
        return false;
    }

    public static void useReadFile(String file){
        // To call method readFile() it needs to be within a try block
        // or else include a throws clause in the method declaration
        try {
            readFile("file");
        } catch(FileNotFoundException e){
            System.out.print(e);
        }
    }

    public static void useAnotherReadFile(String file) throws FileNotFoundException {
        // no try catch needed with throws statement
        readFile(file);
    }

    public static void rule1() throws IOException {
        // can throw subclass of exception declared in throws clause
        // can't throw superclass of exception thrown
        if(true){
            throw new FileNotFoundException();
        }
    }

    public static void rule2() throws FileNotFoundException {
        // can handle exception and still declare it to be thrown
        try {
            readFile("");
        } catch (FileNotFoundException e){
            System.out.print(e);
        }
    }

    public static void rule3() throws FileNotFoundException {
        // can declare to throw a checked exception and not throw it
        System.out.println("");
    }

    // Method can declare to throw all types of exceptions even if it doesn't
    void method1() throws Error {}
    void method2() throws Exception {}
    void method3() throws Throwable {}
    void method4() throws RuntimeException {}
    void method5() throws FileNotFoundException {}

    // try block can define handler for unchecked exceptions not thrown
    // it can't do it for checked exceptions - except for Exception
    void method6() {
        try {}
        catch (Error e) {}
    }
    void method7() {
        try {}
        catch (Exception e) {}
    }
    void method8() {
        try {}
        catch (Throwable e) {}
    }
    void method9() {
        try {}
        catch (RuntimeException e) {}
    }
    void method10() {
        try {}
        // The following catch block won't compile
        //catch (FileNotFoundException e) {}
        finally {}
    }

    public static void main(String [] args){
        // Can throw error and runtime exception without throws clause or try/catch
        if(false){
            throw new NullPointerException();
        } else if(!true){
            throw new Error();
        }
    }
}
