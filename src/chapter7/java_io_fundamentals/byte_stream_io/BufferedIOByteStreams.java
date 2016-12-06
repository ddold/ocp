package chapter7.java_io_fundamentals.byte_stream_io;

import java.io.*;

/**
 * Created by dan on 12/4/16.
 *
 * Constructors
 * - public BufferedInputStream(InputStream in)
 * - public BufferedInputStream(InputStream in, int size)
 * - public BufferedOutputStream(OutputStream out)
 * - public BufferedOutputStream(OutputStream out, int size)
 */
public class BufferedIOByteStreams {
    public static void nonBuffered(FileInputStream in, FileOutputStream out) throws IOException {
        long start = System.currentTimeMillis();

        int data;
        while((data = in.read()) != -1) {
            out.write(data);
        }

        long end = System.currentTimeMillis();

        System.out.println("Milliseconds Elapsed : " + (end - start));
    }

    public static void buffered(FileInputStream in, FileOutputStream out) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(in);
        BufferedOutputStream bos = new BufferedOutputStream(out);

        long start = System.currentTimeMillis();

        int data;
        while((data = bis.read()) != -1) {
            bos.write(data);
        }

        long end = System.currentTimeMillis();

        System.out.println("Milliseconds Elapsed : " + (end - start));
    }

    public static void main(String [] args){
        File dir = new File("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/byte_stream_io");
        try (FileInputStream in = new FileInputStream(new File(dir, "jls7.pdf"));
             FileOutputStream out = new FileOutputStream(new File(dir, "jls7_2.pdf"))) {

            buffered(in, out);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
