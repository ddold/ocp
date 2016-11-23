package chapter6.exceptions_and_assertions.try_with_multi_catch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dan on 11/23/16.
 */
public class MultiCatch {
    void myMethod(Connection con, String filename){
        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);

            Statement stmt = con.createStatement();
        } catch (FileNotFoundException | SQLException e){
            // only one variable defined for both exceptions
            System.out.println(e.toString());

            // variable e is implicitly final and can't be changed
            // Following will fail to compile
            //e = new Exception();
        } catch (IOException e) {
            // Can include multiple catch blocks with multi catch
            // Can't include IOException in multi catch with FileNotFoundException because they share inheritance
            System.out.print(e);
        } finally {
            // Can include with finally
            System.out.println("Finally");
        }
    }

    public static void main(String [] args){
        try {
            int a = 10;

            if(a <= 10){
                throw new Exception1();
            } else {
                throw new Exception2();
            }
        } catch (Exception1 | Exception2 e){
            // variable e is of type Exception, thats common to both Exception1 and Exception2
            // class Exception doesn't have method info() so won't compile
            //System.out.println(e.info());
        }

        try {
            int a = 10;

            if(a <= 10){
                throw new Exception3();
            } else {
                throw new Exception4();
            }
        } catch (Exception3 | Exception4 e){
            // The following compiles as both Exception classes implement IEx interface that has method info()
            System.out.println(e.info());
        }
    }
}

interface IEx {
    String info();
}

class Exception1 extends IOException {
    public String info(){
        return "I'm base exception";
    }
}

class Exception2 extends Exception {
    public String info() {
        return "I'm derived exception";
    }
}

class Exception3 extends IOException implements IEx {
    public String info(){
        return "I'm base exception";
    }
}

class Exception4 extends Exception implements IEx {
    public String info() {
        return "I'm derived exception";
    }
}