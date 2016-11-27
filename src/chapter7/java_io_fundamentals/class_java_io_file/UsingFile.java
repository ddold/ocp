package chapter7.java_io_fundamentals.class_java_io_file;

import java.io.File;
import java.io.IOException;

/**
 * Created by dan on 11/27/16.
 *
 * File constructors
 * - File(String pathname)
 * - File(File parent, String child)
 * - File(String parent, String child)
 */
public class UsingFile {
    public static void countDirFiles(File dir){
        // dir.isDirectory() returns true if the file is a directory
        if(dir.isDirectory()){
            int fileCount = 0;
            int dirCount = 0;

            // dir.list() returns a string array of the directories files and subdirectories
            String [] list = dir.list();
            File item = null;

            for(String listItem : list){
                // Creates File object from giver dir File and listItem String value
                item = new File(dir, listItem);

                // isFile() and isDirectory return true if File object is referring to a file or directory
                if(item.isFile()){
                    ++fileCount;
                } else if(item.isDirectory()){
                    ++dirCount;
                }
            }

            System.out.printf("File(s) : %d\n", fileCount);
            System.out.printf("Dir(s) : %d\n", dirCount);
        } else {
            throw new IllegalArgumentException("Not a directory");
        }
    }

    public static void createFileAndDirs(File file){
        System.out.println(file.mkdirs());
        File newFile = new File(file, "Sample.txt");
        if(!newFile.exists()){
            try {
                System.out.println(file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String [] args){
        countDirFiles(new File("/home/dan"));
        System.out.println();
        createFileAndDirs(new File("/home/dan"));
    }
}
