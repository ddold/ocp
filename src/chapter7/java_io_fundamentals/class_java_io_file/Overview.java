package chapter7.java_io_fundamentals.class_java_io_file;

/**
 * Created by dan on 11/27/16.
 */
public class Overview {
    /**
     * - File is an abstract representation of a path to a file or directory
     * - You can use an object of class File to create a new file or directory, delete it or inquire about or modify its attributes
     * - A File instance might not be necessarily associated with an actual file or directory
     * - File's method isDirectory() returns true if the path it refers to is a directory
     * - Files method isFile() returns true if the path it refers to is a file
     * - For a directory Files method list() returns an array of subdirectories and files
     * - You can create a File instance that represents a nonexisting file on your file system. And you can even invoke methods
     *   like isFile() without getting an exception
     * - The objects of class File are immutable; the pathname represented by a File object can't be changed
     * - Methods createNewFile(), mkdir() and mkdirs() can be used to create new files or directories
     */
}