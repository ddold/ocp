package chapter7.java_io_fundamentals.byte_stream_io;

/**
 * Created by dan on 11/27/16.
 */
public class Overview {
    /**
     *                          InputStream & OutputStream
     *                         ----------------------------
     * - Class java.io.InputStream is an abstract base class for all the input streams
     * - Class InputStream defines multiple overloaded versions of method read(), which can be used to read a single byte of
     *   data as int, or multiple bytes into a byte array
     * - Method read() returns the next byte of data or -1 if the end of the stream is reached. It doesn't throw an EOFException
     * - Method close() is another important method of class InputStream. Calling close() on a stream releases the system resources
     *   associated with it
     * - Class java.io.OutputStream is an abstract class. Its the base class for all the output streams in Java
     * - The most important method of OutputStream class is write(), which can be used to write a single byte of data or multiple
     *   bytes from a byte array to a data destination
     * - Class OutputStream also defines methods write(), flush() and close(). So those are valid methods that can be called on
     *   any objects of classes that extends class OutputStream
     * - All the classes that include OutputStream in their name - FileOutputStream, ObjectOutputStream, BufferedOutputStream and
     *   DataOutputStream - extend abstract class OutputStream directly or indirectly
     *
     *                        FileInputStream & FileOutputStream
     *                       ------------------------------------
     * - To read and write raw bytes from and to a file, use FileInputStream and FileOutputStream
     * - FileInputStream is instantiated by passing it a File instance or String value. It can't be instantiated by passing it
     *   another InputStream
     * - Instantiation of FileOutputStream creates a stream to write to a file specified either as a File instance or a String value
     *   You can also pass a boolean value specifying whether to append to the existing file contents
     * - Copying a files content might not copy its attributes. To copy a file, it's advisable to use methods such as copy() from
     *   class java.nio.file.Files
     * - I/O operations that require reading and writing of a single byte from and to a file are a costly affair. To optimize the
     *   operation, you can use a byte array
     * - Unlike read(), read(byte[]) doesn't return the read bytes. It returns the count of bytes read, or -1 if no more data can
     *   be read. The actual data is read in the byte array that's passed to it as a method parameter
     * - Method write(int) in class OutputStream writes a byte to the underlying output stream. If you write an int value by using
     *   this method, only the 8 low-order bits are written to the output stream; the rest is ignored
     *
     *                        BufferedInputStream & BufferedOutputStream
     *                       --------------------------------------------
     * - To buffer data with byte streams, you need classes BufferedInputStream and BufferedOutputStream
     * - You can instantiate a BufferedInputStream by passing it an InputStream instance
     * - A BufferedOutputStream can be instantiated by passing it an OutputStream instance
     * - You can specify a buffer size or use the default size for both BufferedInputStream and BufferedOutputStream
     * - To instantiate BufferedInputStream, you must pass it an object of InputStream. To instantiate BufferedOutputStream you must
     *   pass it an object of OutputStream
     *
     *                      DataInputStream & DataOutputStream
     *                     ------------------------------------
     * - You can use FileInputStream and FileOutputStream to read and write only byte data from and to an underlying file. These
     *   classes (FileInputStream and FileOutputStream) don't define methods to work with any other specific primitive data types
     *   or objects
     * - Data input and output streams let you read and write primitive values and strings from and to an underlying I/O stream in
     *   a machine-independent way. Data written with DataOutputStream can be read by DataInputStream
     * - If a mismatch occurs in the type of written by DataOutputStream and the type of data read by DataInputStream, you might not
     *   get a runtime exception. Because data streams read and write bytes, the read operation constructs the requested data from the
     *   available bytes, though incorrectly
     *
     *                        ObjectInputStream & ObjectOutputStream
     *                       ----------------------------------------
     * - An ObjectOutputStream can write primitive values and objects to an OutputStream, which can be read by an ObjectInputStream
     * - To write objects to a file, their classes should implement java.io.Serializable or the code will throw a
     *   java.io.NotSerializableException
     * - If a class implements the Serializable interface, but its base class doesn't, the class instance can be serialized
     * - A class whose object fields don't implement the Serializable interface can't be serialized even through the class itself
     *   implements the Serializable interface. An attempt to serialize such object fields will throw a runtime exception
     * - Retrieve the data (primitive or objects) in the order it was written using object streams, or it might throw a runtime exception
     * - When you write objects to a file using ObjectOutputStream, its transient or static variables aren't written to the file
     */
}
