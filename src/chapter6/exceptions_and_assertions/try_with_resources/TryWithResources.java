package chapter6.exceptions_and_assertions.try_with_resources;

import java.io.*;

/**
 * Created by dan on 11/23/16.
 */
public class TryWithResources {
    static void readFileContents(String filename){
        File file = new File(filename);
        try (FileInputStream fis = new FileInputStream(file);){
            // The semicolon at the end of the statement is optional
            System.out.println("In try with resources");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // Because try with resources calls close() you have to include IOException as close() could throw this
            e.printStackTrace();
        }
    }

    static void autoClose(String file) throws IOException {
        File myFile = new File(file);
        try (FileInputStream fis = new FileInputStream(file);){
            // The semicolon at the end of the statement is optional
            System.out.println("In try with resources");
        }
        // No catch needed as the exception is thrown
    }

    static void rules() {
        try (FileInputStream fis = null;){
            // Have to declare and initialize variables
            // Can be assigned to null and will still compile

            // Following won't compile
            //fis = new FileInputStream("file");
        } catch (Exception e){
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("file");
             FileOutputStream fos = new FileOutputStream("file")){
            // Can include multiple resources, separated by semicolon
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        //readFileContents("file");

        try(RiverRaft raft = new RiverRaft()){
            raft.crossRapid();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);

            // To get the extra exception suppressed by the close() method do the following
            Throwable [] exs = e.getSuppressed();
            if(exs.length > 0){
                System.out.println(exs[0]);
            }
        }

        System.out.println();

        // resources closed in reverse order they have been defined
        try(MyResources res1 = new MyResources("1");
            MyResources res2 = new MyResources("2")){
            System.out.println("within try with resources");
        } finally {
            System.out.println("finally");
        }
    }
}

class MyResources implements AutoCloseable {
    String name;
    MyResources(String name){
        this.name = name;
        System.out.println("Created: " + name);
    }
    public void close(){
        System.out.println("Closed: " + name);
    }
}

// To use try with resources with your own code you need to implement AutoClosable interface
class RiverRaft implements AutoCloseable {

    public RiverRaft() throws Exception {
        System.out.println("Start raft");
    }

    public void crossRapid() throws Exception {
        System.out.println("Cross rapid");
        throw new Exception("Cross rapid exception");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Reached river bank");
        // This exception was suppressed because crossRapid() throws an exception
        throw new Exception("close exception");
    }
}