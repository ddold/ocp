package chapter7.java_io_fundamentals.character_stream_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by dan on 12/17/16.
 *
 * FileReader constructors
 * - FileReader(File file)
 * - FileReader(String filename)
 *
 * FileWriter constructors
 * - FileWriter(File file)
 * - FileWriter(File file, boolean append)
 * - FileWriter(String filename)
 * - FileWriter(String filename, boolean append)
 */
public class FileIOCharacterStreams {
    public static void main(String [] args) throws IOException{
        try (
             FileReader input = new FileReader("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/character_stream_io/FileIOCharacterStreams.java");
             FileWriter output = new FileWriter("Copy.java")
        ){
            int data;

            while((data = input.read()) != -1){
                output.write(data);
            }
        }
    }
}
