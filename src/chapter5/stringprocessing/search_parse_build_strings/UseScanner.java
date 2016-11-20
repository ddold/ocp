package chapter5.stringprocessing.search_parse_build_strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by dan on 11/20/16.
 */
public class UseScanner {
    /**
     * Scanner accepts the following in its constructor
     * - Scanner(File file)
     * - Scanner(Readable source)
     * - Scanner(String source)
     */
    public static void main(String [] args){
        System.out.println("Use scanner object");
        System.out.println("------------------");
        System.out.println();
        Scanner scanner = new Scanner("The \tnew \nProgrammer exam");
        while(scanner.hasNext()){
            // no delimiter specified in scanner so default is whitespace
            System.out.println(scanner.next());
        }

        System.out.println();
        System.out.println("Using scanner with a delimiter specified");
        System.out.println("----------------------------------------");
        System.out.println();

        Scanner sc = new Scanner("The1new22Programmer exam6");
        // set the delimiter to specified regex
        sc.useDelimiter("[\\d]+");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }

        System.out.println();
        System.out.println("Using scanner methods");
        System.out.println("---------------------");
        System.out.println();

        scanner = new Scanner("Shreya,20,true");
        scanner.useDelimiter(",");
        System.out.println(scanner.next()); // prints string
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextBoolean());

        System.out.println();
        System.out.println("Using scanner method findInLine()");
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("findInLine() tries to match specified pattern with no regard to delimiters in input");

        scanner = new Scanner("ABC 223.2343 Paul 10");
        scanner.findInLine("(ABC)+[\\d]+\\.[\\d]+[A-Za-z]+[\\d]+");

        System.out.println(scanner.next());
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());
        System.out.println(scanner.nextInt());

        System.out.println();
        System.out.println("StringTokenizer");
        System.out.println("---------------");
        System.out.println();

        StringTokenizer st = new StringTokenizer("start your startup");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
