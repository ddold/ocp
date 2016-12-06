package chapter7.java_io_fundamentals.byte_stream_io;

import java.io.*;

/**
 * Created by dan on 12/6/16.
 *
 * Constructors
 * - DataInputStream(InputStream in)
 * - DataOutputStream(OutputStream out)
 */
public class DataIOStreams {
    static File file = new File("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/byte_stream_io");
    public static void main(String [] args){
        try (
                FileOutputStream fos = new FileOutputStream(new File(file, "myData.data"));
                DataOutputStream dos = new DataOutputStream(fos);
                FileInputStream fis = new FileInputStream(new File(file, "myData.data"));
                DataInputStream dis = new DataInputStream(fis)
             ) {

            dos.writeChars("OS");   // writeChars() accepts type String not char
            dos.writeInt(999);
            dos.writeDouble(45.8);
            dos.writeBoolean(true);
            dos.writeUTF("Will score 100%");

            System.out.println(dis.readChar());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());

            // will throw an EOFException if asked to read any more

            System.out.println();
            dos.writeDouble(44.7);

            // will print values because 2 ints (4 bytes each) make a double (8 bytes)
            // values returned can't be determined
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
