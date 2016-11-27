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

    public static void main(String [] args) throws IOException {
        File dir = new File("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/byte_stream_io");
        try (FileInputStream in = new FileInputStream(new File(dir, "Sample.txt"));
             FileOutputStream out = new FileOutputStream(new File(dir, "Sample2.txt"))) {
            int data;
            byte[] byteArr = new byte[1024];

            while ((data = in.read(byteArr)) != 1){
                out.write(byteArr, 0, data);
            }

            // This way is not very efficient, better to use a byte array
//            while ((data = in.read()) != 1) {
//                out.write(data);
//            }
        }
    }
}
