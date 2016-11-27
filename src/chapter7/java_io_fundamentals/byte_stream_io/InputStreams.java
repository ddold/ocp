package chapter7.java_io_fundamentals.byte_stream_io;

/**
 * Created by dan on 11/27/16.
 */
public class InputStreams {
    /**
     * Constructors;
     * - int abstract read()
     * - int read(byte[] b)
     * - int read(byte[] b, int off, int len)
     *
     *
     * Common methods used in class java.io.InputStream
     * |          Method Name              |  Return Type  |                     Description                            |
     * ------------------------------------------------------------------------------------------------------------------
     * | close()                           |    void       | Closes this input stream and releases any system resources |
     * |                                   |               | associated with the stream                                 |
     * |                                   |               |                                                            |
     * | abstract read()                   |    int        | Reads the next byte of data from the input stream          |
     * |                                   |               |                                                            |
     * | read(byte[] b)                    |    int        | Reads a number of bytes from the input stream and stores   |
     * |                                   |               | them into the buffer array b                               |
     * |                                   |               |                                                            |
     * | read(byte[] b, int off, int len)  |    int        | Reads up to len bytes of data from the input stream into an|
     * |                                   |               | array of bytes                                             |
     *
     *
     *
     *                                      abstract class
     *                                       InputStream
     *                                            ^
     *                                            |
     *                                            |
     *            ________________________________|_____________________________
     *            |                  |                      |                  |
     *     FileInputStream           |               DataInputStream           |
     *                               |                                         |
     *                     BufferedInputStream                         ObjectInputStream
     *
     */
}
