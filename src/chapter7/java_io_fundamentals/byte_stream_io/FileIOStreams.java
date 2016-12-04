package chapter7.java_io_fundamentals.byte_stream_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dan on 11/27/16.
 */
public class FileIOStreams {
    /**
     * Constructors for FileInputStream;
     * - FileInputStream(File file) throws FileNotFoundException {}
     * - FileInputStream(String name) throws FileNotFoundException {}
     *
     * Constructors for FileOutputStream;
     * - FileOutputStream(File file) throws FileNotFoundException {}
     * - FileOutputStream(File file, boolean append) throws FileNotFoundException {}
     * - FileOutputStream(String name) throws FileNotFoundException {}
     * - FileOutputStream(String name, boolean append) throws FileNotFoundException {}
     */

    static File dir = new File("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/byte_stream_io");

    public static void writeByteToFile(FileInputStream in, FileOutputStream out) throws IOException {
        int data;

        while ((data = in.read()) != 1) {
            out.write(data);
        }
    }

    public static void writeByteArrayToFile(FileInputStream in, FileOutputStream out) throws IOException {
        int data;
        byte[] byteArr = new byte[1024];

        while ((data = in.read()) != 1) {
            out.write(byteArr, 0, data);
        }
    }

    public static void writeBinary(FileInputStream in, FileOutputStream out) throws IOException {
        // only 1 byte of an int is wrote with method write()
        // this is the 8 low order bits - the other 24 high order bits are ignored
        int i999 = 0b00000000_00000000_00000011_11100111;
        int i20 = 0b00000000_00000000_00000000_00010100;

        out.write(i999);
        out.write(i20);

        System.out.println(i999 + ":" + in.read());
        System.out.println(i20 + ":" + in.read());
    }

    public static void main(String [] args) throws IOException {
        try (FileInputStream in = new FileInputStream(new File(dir, "Sample.txt"));
             FileOutputStream out = new FileOutputStream(new File(dir, "Sample2.txt"))) {

            // This way is not very efficient, better to use a byte array
            //writeByteToFile(in, out);
            //writeByteArrayToFile(in, out);

            writeBinary(in, out);
        }
    }
}
