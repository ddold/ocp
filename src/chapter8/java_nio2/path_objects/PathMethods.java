package chapter8.java_nio2.path_objects;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by dan on 12/17/16.
 */
public class PathMethods {
    public static void main(String [] args){
        // Methods to access Path components
        Path path = Paths.get("/home/dan/.gitconfig");

        System.out.println("toString() -> " + path.toString());
        System.out.println("getRoot() -> " + path.getRoot());
        System.out.println("getName(0) -> " + path.getName(0));
        System.out.println("getName(1) -> " + path.getName(1));
        System.out.println("getFileName() -> " + path.getFileName());
        System.out.println("getNameCount() -> " + path.getNameCount());
        System.out.println("getParent() -> " + path.getParent());
        System.out.println("subpath(0, 2) -> " + path.subpath(0, 2));

        System.out.println();
        System.out.println("----------------");
        System.out.println("Comparing Paths");
        System.out.println("----------------");
        System.out.println();

        Path path1 = FileSystems.getDefault().getPath("/home/dan/.gitconfig");
        Path path2 = Paths.get("/home/dan/.bash_profile");

        System.out.println(path1.compareTo(path2));
        System.out.println(path2.startsWith(path1));
        System.out.println(path1.endsWith("config"));
        System.out.println(path1.endsWith(Paths.get(".gitconfig\\")));


        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Converting Relative Paths to Absolute Paths");
        System.out.println("--------------------------------------------");
        System.out.println();

        Path file = Paths.get("../8-1.txt");
        Path path3 = file.toAbsolutePath();
        System.out.println("Path before using normalize() method - " + path3);
        path3 = path3.normalize();
        System.out.println("Path after using normalize() method - " + path3);

        Path file2 = Paths.get("./8-1.txt");
        Path path4 = file2.toAbsolutePath();
        System.out.println("Path before using normalize() method - " + path4);
        path4 = path4.normalize();
        System.out.println("Path after using normalize() method - " + path4);


        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Resolving paths using resolve and resolveSibling");
        System.out.println("-------------------------------------------------");
        System.out.println();

        Path path5 = FileSystems.getDefault().getPath("mydir/code");
        System.out.println(path5.resolve(Paths.get("world/Hello.java")));
        System.out.println(path5.resolve("world/Hello.java"));

        Path absolutePath = Paths.get("/home/dan");
        System.out.println(absolutePath.resolve(path5));
        System.out.println(path5.resolve(absolutePath));

        System.out.println();

        Path path6 = Paths.get("/mydir/eWorld.java");
        Path renamePath = path6.resolveSibling(Paths.get("newWorld.java"));
        Path copyPath = path6.resolveSibling("backup/eWorld.java");
        Path absolutePath2 = Paths.get("/home/dan/");

        System.out.println(renamePath);
        System.out.println(copyPath);
        System.out.println(path6.resolveSibling(""));

        System.out.println(absolutePath2.resolveSibling(path6));
        System.out.println(path6.resolveSibling(absolutePath2));


        System.out.println();
        System.out.println("-------------");
        System.out.println("Relativize()");
        System.out.println("-------------");
        System.out.println();

        Path dir = Paths.get("code");
        Path file3 = Paths.get("code/java/IO.java");
        System.out.println(file3.relativize(dir));
        System.out.println(dir.relativize(file3));

        System.out.println();

        dir = Paths.get("/code");
        file3 = Paths.get("/java/IO.java");
        System.out.println(file3.relativize(dir));
        System.out.println(dir.relativize(file3));
    }
}
