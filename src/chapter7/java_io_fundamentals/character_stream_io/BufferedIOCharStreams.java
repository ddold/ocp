package chapter7.java_io_fundamentals.character_stream_io;

import java.io.*;

/**
 * Created by dan on 12/17/16.
 *
 * BufferedReader/Writer constructors
 * - public BufferedReader(Reader in)
 * - public BufferedReader(Reader in, int size)
 * - public BufferedWriter(Writer out)
 * - public BufferedWriter(Writer out, int size)
 */
public class BufferedIOCharStreams {
    public static void main(String [] args){
        try (
                FileReader fileReader = new FileReader("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/character_stream_io/BufferedIOCharStreams.java");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter("Copy2.java");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {

            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
