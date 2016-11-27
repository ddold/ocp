package chapter7.java_io_fundamentals.byte_stream_io;

/**
 * Created by dan on 11/27/16.
 */
public class OutputStreams {
    /**
     * Constructors;
     * - int abstract write()
     * - int write(byte[] b)
     * - int write(byte[] b, int off, int len)
     *
     * Common methods used in class java.io.OutputStream
     * |          Method Name              |  Return Type  |                     Description                            |
     * ------------------------------------------------------------------------------------------------------------------
     * | close()                           |    void       | Closes this input stream and releases any system resources |
     * |                                   |               | associated with the stream                                 |
     * |                                   |               |                                                            |
     * | flush()                           |    void       | Flushes this output stream and forces any buffered output  |
     * |                                   |               | bytes to be written out                                    |
     * |                                   |               |                                                            |
     * | write(byte[] b)                   |    void       | writes b.length bytes from the specified byte array to this|
     * |                                   |               | output stream                                              |
     * |                                   |               |                                                            |
     * | write(byte[] b, int off, int len) |    void       | Writes len bytes from the specified byte array, starting at|
     * |                                   |               | offset off to this output stream                           |
     * |                                   |               |                                                            |
     * | abstract write(int b)             |    void       | Writes the specified byte to this output stream            |
     *
     *
     *                                      abstract class
     *                                       OutputStream
     *                                            ^
     *                                            |
     *                                            |
     *            ________________________________|_____________________________
     *            |                  |                      |                  |
     *     FileOutputStream          |              DataOutputStream           |
     *                               |                                         |
     *                     BufferedOutputStream                        ObjectOutputStream
     *
     */
}
