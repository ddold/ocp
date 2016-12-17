package chapter7.java_io_fundamentals.character_stream_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dan on 12/17/16.
 *
 * PrintWriter constructors
 * - PrintWriter(File file)
 * - PrintWriter(File file, String charset)
 * - PrintWriter(String filename)
 * - PrintWriter(String filename, String charset)
 * - PrintWriter(Writer out, boolean autoFlash)
 *
 *
 * Methods used with PrintWriter
 *
 * |   Method  |                      Method Arguments                                   |
 * ---------------------------------------------------------------------------------------
 * |   write   | int / char[] / String                                                   |
 * |   print   | boolean / int / char[] / char / long / float / double / Object / String |
 * |   println | boolean / int / char[] / char / long / float / double / Object / String |
 * |   format  | (Locale locale, String format, Object... args)                          |
 * |   format  | (String format, Object... args)                                         |
 * |   printf  | (Locale locale, String format, Object... args)                          |
 * |   printf  | (String format, Object... args)                                         |
 *
 */
public class PrintWriterStream {
    public static void main(String [] args){
        try {
            FileWriter fileWriter = new FileWriter("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/character_stream_io/file1.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.write(97);
            printWriter.write("String");
            printWriter.write("PartialString", 0, 4);
            printWriter.write(new char[] {'c', 'h', 'a', 'r'});
            printWriter.write(new char[] {'c', 'h', 'a', 'r'}, 1, 1);

            printWriter.print(true);
            printWriter.print('a');
            printWriter.print(12.23f);
            printWriter.print(41.45);
            printWriter.print(57845L);
            printWriter.print(printWriter);
            printWriter.print(new Integer(54));

            printWriter.println(true);
            printWriter.println('a');
            printWriter.println(12.23f);
            printWriter.println(41.45);
            printWriter.println(57845L);
            printWriter.println(printWriter);
            printWriter.println(new Integer(54));

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
