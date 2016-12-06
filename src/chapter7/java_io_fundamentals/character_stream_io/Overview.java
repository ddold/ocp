package chapter7.java_io_fundamentals.character_stream_io;

/**
 * Created by dan on 12/6/16.
 */
public class Overview {
    /**
     * - Reader and Writer are abstract base classes for reading and writing Unicode compliant character data
     * - Classes Reader and Writer handle 16-bit Unicode well, which isn't supported by the byte-orientated InputStream and
     *   OutputStream classes
     * - Abstract class Reader defines overloaded read() methods to read character data from an underlying data stream
     * - Class Reader implements Closable (and its parent interface AutoClosable). So Reader objects can be declared as
     *   resources with a try-with-resources statement
     * - Compare the overloaded read() methods of class InputStream with the read() methods of class Reader. The read() methods
     *   of InputStream accept an array of byte as their method parameter and the read() methods of Reader accept an array of char
     *   as their method parameter
     * - Abstract class Writer defines overloaded write() methods to write character data to an underlying data source
     * - With the overloaded write() methods of class Writer(), you can write a single character or multiple characters stored in
     *   char arrays or string to a data source
     * - FileReader and FileWriter are convenience classes for reading and writing character data from files
     * - You can instantiate FileReader by passing it the name of a file as a string value or as a File instance
     * - You can instantiate FileWriter by passing it the name of a file as a string value or as a File instance. You also have the
     *   option of specifying whether you want to override the existing content of a file or append new content to it by passing
     *   a boolean value to the constructor
     * - To buffer data with character streams, you need classes BufferedReader and BufferedWriter
     * - You can instantiate a BufferedReader by passing a Reader instance
     * - You can instantiate a BufferedWriter by passing a Writer instance
     * - You can also specify a buffer size or use the default size for both BufferedReader and BufferedWriter
     * - Class PrintWriter can be used to print (write) formatted representations of objects to a file. This class implements
     *   print() methods found in class PrintStream
     * - This essentially means that you can use all the overloaded print() methods that you've been using (via the class variable
     *   System.out) to write data to a file, a PrintWriter instance
     */
}
