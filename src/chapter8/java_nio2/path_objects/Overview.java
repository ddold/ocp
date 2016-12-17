package chapter8.java_nio2.path_objects;

/**
 * Created by dan on 12/17/16.
 */
public class Overview {
    /**
     * - Objects of the Path interface are used to represent the path of files or directories in a file system
     * - Because a Path object might not be tied to a real file or directory on a system, it can refer to a
     *   nonexistent file or directory
     * - Apart from referring to a file or directory, a Path object can refer to a symbolic link. A symbolic
     *   link is a special file that refers to another file
     * - When you read data from or write data to a symbolic link, you read from or write to its underlying
     *   target file. But if you were to delete a symbolic link, the target file isn't deleted
     * - A Path can never be equal to a Path associated with another file system, even if they include exactly
     *   the same values
     * - You can create Path objects by using Paths.get() or FileSystems.getDefault().getPath()
     * - You can convert a File instance to a Path object by calling toPath() on the File instance
     * - Behind the scenes, both Paths.get() and File.toPath() call FileSystems.getDefault().getPath()
     * - Most of the Path methods perform syntactic operations. They manipulate the paths to a file or directory
     *   without accessing the file systems. They're logical operations on paths in memory
     * - Methods getName(), getNameCount() and subpath() don't use the root directory of a path. Method
     *   getRoot() returns the root of an absolute path and null for relative paths
     * - The Path methods that accept positions throw an IllegalArgumentException at runtime for invalid
     *   positions. For example, getName() and subpath() throw an IllegalArgumentException if you pass
     *   invalid path positions to them
     * - You can compare paths lexicographically using method compareTo(Path)
     * - To check whether a path starts or ends with another path, you can use startsWith(String), startsWith(Path),
     *   endsWith(String) and endsWith(Path). So if you pass null to these methods, you'll get a compiler error
     * - The method name to retrieve the absolute path from a Path object is toAbsolutePath() and not getAbsolutePath()
     * - You can remove redundant path values by calling method normalize on Path
     * - Path is immutable and calling normalize() on a Path object doesn't change its value
     * - Method normalize() doesn't check the actual file system to verify if the file (or directory) the
     *   resulting path is referring to actually exists
     * - If a Path object includes redundancies like . or .., calling information retrieval methods like
     *   subpath() or getName() will include the redundancies in the returned values
     * - The overloaded methods resolve(String) and resolve(Path) are used ot join a relative path to another
     *   path. If you pass an absolute path as a parameter, this method returns the absolute path
     * - To retrieve the path to a file in the same directory, say, to create its copy or to rename it, you can
     *   use the overloaded methods resolveSibling(String) and resolveSibling(Path)
     * - Method resolveSibling() resolves a given path against a paths parent. If the given path is an absolute
     *   path, this method returns the absolute path. If you pass it an empty path, it returns the parent of the
     *   path
     * - Methods resolve() and resolveSibling() don't check the actual file system to verify if the file/directory
     *   the resulting path is referring to actually exists
     * - To construct a path between two Path objects, use method relativize(). It can be used to construct a
     *   path between two relative or absolute Path objects
     * - You can't create a path from a relative path to an absolute path and vice versa using method relativize()
     *   If you do so you'll get a runtime exception - IllegalArgumentException
     * - Method relativize() doesn't check the actual file system to verify if the file/directory the resulting
     *   path is referring to actually exists
     */
}
