package chapter7.java_io_fundamentals.character_stream_io;

/**
 * Created by dan on 12/6/16.
 */
public class Writers {
    /**
     * Constructors
     * - void write(char[] cbuf)
     * - abstract void write(char[] cbuf, int off, int len)
     * - void write(int c)
     * - void write(String str)
     * - void write(String str, int off, int len)
     *
     *
     *                            abstract class
     *                                Writer
     *                                  ^
     *                                  |
     *           _______________________|_______________________
     *          ^                       ^                       ^
     *          |                       |                       |
     *          |                       |                       |
     *    BufferedWriter            PrintWriter              FileReader
     *
     */
}
