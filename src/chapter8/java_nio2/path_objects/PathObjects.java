package chapter8.java_nio2.path_objects;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by dan on 12/17/16.
 */
public class PathObjects {
    /**
     * List of classes and their respective methods that can be used to create objects of Path;
     * |      Class Name           |                     Method Declaration                      |
     * |---------------------------|-------------------------------------------------------------|
     * | java.nio.file.Paths       |  public static Path get(String first, String... more)       |
     * | java.nio.file.FileSystem  |  public abstract Path getPath(String first, String... more) |
     * | java.io.File              |  public Path toPath()                                       |
     */

    public static void main(String [] args){
        // Absolute Paths
        Paths.get("/user/dan/IdeaProjects/OCP/sample.txt");
        Paths.get("/user", "dan", "IdeaProjects", "OCP", "sample.txt");
        Paths.get("\\user\\dan\\IdeaProjects\\OCP\\sample.txt");
        // Relative Paths
        Paths.get("sample.txt");

        FileSystems.getDefault().getPath("/user/dan/IdeaProjects/OCP/sample.txt");
        FileSystems.getDefault().getPath("/user", "dan", "IdeaProjects", "OCP", "sample.txt");
        FileSystems.getDefault().getPath("\\user\\dan\\IdeaProjects\\OCP\\sample.txt");
        FileSystems.getDefault().getPath("sample.txt");

        File file = new File("sample.txt");
        Path path = file.toPath();
    }
}
