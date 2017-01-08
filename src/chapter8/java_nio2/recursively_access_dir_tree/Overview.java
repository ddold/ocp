package chapter8.java_nio2.recursively_access_dir_tree;

/**
 * Created by dan on 1/8/17.
 */
public class Overview {
    /**
     * - Class Files define overloaded method walkFileTree() to walk recursively through the specified path. To define the
     *   traversal behavior, this method accepts an object of the FileVisitor interface
     * - You can use the FileVisitor, a generic interface, to define the code that you want to execute during the traversal of a
     *   directory structure. When you traverse a directory structure, you can define what to do before or after you visit a
     *   directory, when you visit a file, or when access to a file is defined
     * - Method postVisitDirectory() is invoked for a directory after entries in the directory and all of their descendants have
     *   been visited
     * - Method preVisitDirectory() is invoked for a directory before entries in the directory are visited
     * - Method visitFile() is invoked for a file in a directory
     * - Method visitFileFailed() is invoked for a file that couldn't be visited
     * - Methods preVisitDirectory() and visitFile() are passed BasicFileAttributes of the path that they operate on. You can use
     *   these methods to query file or directory attributes
     * - Class SimpleFileVisitor is a simple visitor of files and default behavior to visit all files and to rethrow I/O errors. It
     *   implements the FileVisitor interface
     * - You can initiate traversal of a directory by calling the overloaded method walkFileTree() from class Files
     * - The DirectoryStream interface can be used to iterate over all the files and directories in a directory. You can use an Iterator
     *   or for-each construct to iterate over a directory. The order in which the directory contents are iterated is unpredictable
     * - If you pass Path to a file (and not a directory) to Files.newDirectoryStream(), it will throw a runtime exception. The order
     *   of iteration of files and directories in a specified directory using DirectoryStream is unpredictable
     */
}
