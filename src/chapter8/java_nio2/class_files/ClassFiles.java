package chapter8.java_nio2.class_files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by dan on 1/8/17.
 *
 * Files contains multiple methods to create files and directories
 * - public static Path createFile(Path path, FileAttribute<?>... attrs) throws IOException
 * - public static Path createDirectory(Path dir, FileAttribute<?>... attrs) throws IOException
 * - public static Path createDirectories(Path dir, FileAttribute<?>... attrs) throws IOException
 */
public class ClassFiles {
    // Base directory which is absolute
    String baseDir = "/home/dan/Documents/OCP";
    // sub directory which is relative to base dir
    String subDir = "chapter8";
    // name of file to be created
    String fileName = "class_files.txt";

    // Create Path object that joins baseDir, subDir and file together
    Path filePath = Paths.get(baseDir, subDir, fileName);

    public void createFileDirs(){
        try {
            if(!doesFileDirExist()){
                // Create the /home/dan/Documents/OCP/chapter8 directory
                Files.createDirectories(filePath.getParent());
                // Create the class_files.txt file
                Files.createFile(filePath);
            }

            // Create a Printwriter object to be able to add data to the file
            PrintWriter pw = new PrintWriter(new FileWriter(filePath.toFile(), true));
            pw.println("Cool");
            pw.flush();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public boolean doesFileDirExist(){
        // checks if absolute path to file dir does not exist
        if(Files.notExists(filePath.getParent())){
            return false;
        // checks if file does exist
        } else if(Files.exists(filePath)){
            return true;
        }
        return false;
    }

    public void copyFile(){
        /**
         * overloaded copy() methods;
         * - public static long copy(InputStream in, Path target, CopyOption... options)
         * - public static long copy(Path source, OutputStream out)
         * - public static Path copy(Path source, Path target, CopyOption... options)
         *
         * Only files and not directories are copied
         * CopyOption is an interface, can use objects of StandardCopyOption class
         *
         * _____________________________________________________________________________________
         * |            Enum Constant             |                Description                 |
         * |--------------------------------------|--------------------------------------------|
         * | StandardCopyOption.ATOMIC_MOVE       | Hasn't been implemented yet                |
         * | StandardCopyOption.COPY_ATTRIBUTES   | Copy attributes                            |
         * | StandardCopyOption.REPLACE_EXISTING  | Replace existing entity with the same name |
         * |______________________________________|____________________________________________|
         */
        Path newPath = Paths.get(baseDir, subDir, "class_files_2.txt");

        try {
            Files.copy(filePath, newPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveFiles(){
        // public static Path move (Path source, Path target, CopyOption... options)
        Path source = Paths.get(baseDir, subDir, "class_files_2.txt");
        try {
            Files.move(source, source.resolveSibling("copy_class_files_2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFilesDirs() {
        /**
         * public static void delete(Path path) - this deletes a file
         * public static boolean deleteIfExists(Path path) - this deletes a file only if it exists
         */
    }

    public static void main(String [] args){
        ClassFiles cf = new ClassFiles();
        cf.createFileDirs();
        System.out.println("Does " + cf.filePath.toString() + " exist? " + cf.doesFileDirExist());

        cf.copyFile();
        cf.moveFiles();
    }
}
