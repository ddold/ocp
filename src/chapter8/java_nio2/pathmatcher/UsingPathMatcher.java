package chapter8.java_nio2.pathmatcher;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * Created by dan on 1/8/17.
 */
public class UsingPathMatcher {
    /**
     * Few example patterns that can be passed to FileSystem.getPathMatcher;
     * ____________________________________________________________________________________________________________________________
     * |         Pattern to match        |                                 Description of pattern                                 |
     * |---------------------------------|----------------------------------------------------------------------------------------|
     * | glob:*.{java,class}             | Match path names that end with extension .java or .class                               |
     * | glob:*{java,class}              | Match path names that end with java or class. They might not include a dot just before |
     * | glob:*java,class                | Match path names that end in java,class; e.g. Hellojava,class                          |
     * | glob:???.class                  | Match path names that include exactly 3 characters followed by .class: e.g abc.class   |
     * |                                 | ab,.class. But it match abcd.class or abcde.class                                      |
     * | glob:My[notes,tips,ans].doc     | Match an exact match of 'My' followed by any one character included within [],         |
     * |                                 | followed by .doc. It matches Mys.doc My,.doc. It doesn't match notes.doc, Mytips.doc   |
     * | regex:MyPics[0-9].png           | Match MyPics followed by any digit followed by .png                                    |
     * | glob:/home/"*"/"*" (w/o quotes) | Matches a path like /home/dan/code on UNIX platforms                                   |
     * | glob:/home/**                   | Matches a path like /home/dan/code and /home/dan on UNIX platforms                     |
     * |_________________________________|________________________________________________________________________________________|
     *
     *
     */
    // Base directory which is absolute
    String baseDir = "/home/dan/Documents/OCP";
    // sub directory which is relative to base dir
    String subDir = "chapter8";
    // name of file to be created
    String fileName = "class_files.txt";

    // Create Path object that joins baseDir, subDir and file together
    Path filePath = Paths.get(baseDir, subDir, fileName);


    public static void main(String [] args){
        UsingPathMatcher pathMatcher = new UsingPathMatcher();

        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("regex:\\w.*_\\w.*\\.txt");
        if(matcher.matches(pathMatcher.filePath.getFileName())){
            System.out.println(pathMatcher.filePath);
        }
    }
}
