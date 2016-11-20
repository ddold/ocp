package chapter5.stringprocessing.formatting_strings;

import java.io.File;
import java.util.Formatter;

/**
 * Created by dan on 11/20/16.
 */
public class UseFormatter {
    public static void main(String [] args) throws Exception {
        String name = "Dan";

        Formatter formatter = new Formatter(new File("data.txt"));
        formatter.format("My name is %s", name);
        formatter.flush();

        System.out.printf("My name is %s\n", name);

        System.out.println();
        System.out.println("%b Formatter");
        System.out.println("------------");
        System.out.println();

        Integer age = null;         // prints false for null values
        boolean isShort = false;    // outputs boolean value

        System.out.format("Name %b, age %b, isShort %b\n", name, age, isShort);

        // compiles successfully
        System.out.format("Name %b\n", name, age, isShort);
        // Fails at runtime
        //System.out.format("Name %b, age %b, isShort %b\n", name, age);

        System.out.println();

        System.out.format("\nName defined %10b.", name);
        System.out.format("\nName defined %1b.", name);
        System.out.format("\nName defined %-10b.\n", name);

        System.out.println();
        System.out.println("%c Formatter");
        System.out.println("------------");
        System.out.println();

        System.out.format("Char %c", new Character('\u007b'));
        System.out.format("\nChar %c\n", '\u6124');
        //System.out.format("\nChar %c", new Boolean(true)); - throw runtime exception
        //System.out.format("\nChar %c", '\affff'); - wont compile as invalid Unicode value

        System.out.println();
        System.out.println("%d and %f Formatter");
        System.out.println("-------------------");
        System.out.println();

        System.out.printf("[%f]\n", 12.12345);
        System.out.printf("[%010f]\n", 12.12345);
        System.out.printf("[%-10f]\n", 12.12345);
        System.out.printf("[%10.2f]\n", 12.98765);
        System.out.printf("[%,f]\n", 123456789.12345);

        System.out.println();

        System.out.printf("[%d]\n", 12345);
        System.out.printf("[%010d]\n", 12345);
        System.out.printf("%(,d\n", 12345);
        //System.out.printf("[%-10.2d]\n", 12345); - throws exception with .2 flag

        name = "Dan";
        age = 40;
        System.out.format("Name is %2$s, age is %1$s\n", name, age);
    }
}
