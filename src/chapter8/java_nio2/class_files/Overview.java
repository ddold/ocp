package chapter8.java_nio2.class_files;

/**
 * Created by dan on 1/3/17.
 */
public class Overview {
    /**
     * - Class java.nio.file.Files defines static methods for manipulating files and directories
     * - Method createFile() atomically checks for the existence of the file specified by method parameter path and creates if it
     *   doesn't exist
     * - Method createFile() fails and throws an exception if the file already exists, a directory with the same name exists, its parent
     *   directory doesn't exist due to an I/O error, or the specified file attributes can't be set
     * - Method createDirectory() creates the specified directory (not the parent directory) on the file system. It also atomically
     *   checks for the existence of the specified directory and creates if it doesn't exist
     * - Method createDirectory() throws an exception if a file or directory exists with the same name, its parent directory doesn't
     *   exist due to an I/O error, or the specified directory attributes can't be set
     * - Method createDirectories() creates a directory, creating all nonexistent parent directories
     * - If the target directory already exists, createDirectories() doesn't throw any runtime exception. It throws an exception if the
     *   specified dir exists but isn't a directory, an I/O error occurs, or the specified directory attributes can't be set
     * - Specifying file or directory attributes is optional with methods createFile(), createDirectory() and createDirectories(). All these
     *   methods declare to throw an IOException, which is a checked exception
     * - You can check for the existence of a file or directory referred by a Path object using methods exists() and notExists()
     * - Method notExists() isn't a complement of method exists(). It returns true if a target doesn't exist or false if its existence
     *   can't be determined. If these methods can't determine the existence of a file, both of them will return false
     * - Class File's overloaded method copy() enables you to read from InputStream and write to a Path object, read from a Path object and
     *   write to OutputStream, and read from and write to Path objects
     * - Files.copy() can copy only files, not directories. If the source is a directory, then in the target an empty directory is created
     *   (without copying the entries in the directory). This method returns a long or Path value, not a boolean value.
     * - If you use a relative path to the target file, the file is created relative to your Java class file (.class) and not relative
     *   to the source file (passed as a parameter to method File.copy())
     * - To move files or directories programmatically, you can use Files.move(), which moves or renames a file to a target file
     * - You can only move empty directories using Files.move(). You can rename a nonempty directory by using Files.move(). But you can't
     *   move a file or directory to a nonexisting directory
     * - To delete a directory or a file referred to by a Path object, you can use delete(Path) or deleteIfExists(Path)
     * - If you try to delete a directory that isn't empty, methods delete(Path) and deleteIfExists(Path) will throw
     *   DirectoryNotEmptyException
     * - If you try to delete a nonexistent file or directory using method delete(), it will throw NoSuchFileException. But method
     *   deleteIfExists() won't throw an exception if the file or directory at the specified path doesn't exist - rather it will
     *   return false
     * - Methods delete() and deleteIfExists() can be used to delete files and (non-empty) directories
     */
}
