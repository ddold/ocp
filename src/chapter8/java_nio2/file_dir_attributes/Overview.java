package chapter8.java_nio2.file_dir_attributes;

/**
 * Created by dan on 1/8/17.
 */
public class Overview {
    /**
     * - Class Files defines static methods to access individual attributes if a file or directory referred by a Path
     * - You can access the individual attributes of a file or directory by using methods Files.getAttributes(), passing to it
     *   the name of the attribute as a string value. To modify the attributes of an existing file or directory, you can use
     *   Files.setAttributes()
     * - You can access a group of file attributes by calling Files.getFileAttributesView() or Files.readAttributes()
     * - The BasicFileAttributes interface defines methods to access the basic attributes that should be supported by all the
     *   file systems
     * - The BasicFileAttributeView interface can be used to modify the basic attributes
     * - The DosFileAttributeView interface extends BasicFileAttributes and defines methods to access attributes specific to
     *   Windows files and directories
     * - The DosFileAttributeView interface defines methods to modify the DOS file attributes
     * - The PosixFileAttributes interface also extends BasicFileAttributes and defines methods to access attributes related to the
     *   POSIX family off standards, like Linux or UNIX
     * - The PosixFileAttributeView interface defines methods to modify attributes related to the POSIX family
     * - Available only for Windows OS, the AclFileAttributeView interface supports access and updates of a files ACL
     * - The FileOwnerAttributeView interface supports access and updates to the owner of a file or directory. It is supported by all
     *   systems that support the concept of file owners
     * - The UserDefinedFileAttributeView interface supports the addition, modification and deletion of user-defined metadata
     * - The BasicFileAttributes, DosFileAttributes and PosixFileAttributes interfaces define methods to access attributes. They don't
     *   define methods to modify (or set) the attributes
     * - The BasicFileAttributeView, DosFileAttributeView, PosixFileAttributeView, AclFileAttributeView, FileOwnerAttributeView and
     *   UserDefinedFileAttributeView interfaces can be used to update attribute values
     * - If a file system doesn't support an attribute view, Files.getFileAttributeView() returns null. If a file system doesn't
     *   support an attribute set, File.readAttributes will throw a runtime exception
     * - If an underlying system doesn't support all the basic timestamps - that is creationTime, lastAccessTime and lastModificationTime
     *   it might return system specific information
     * - Methods Files.setAttribute() and Files.getAttribute() throw IllegalArgumentException or UnsupportedOperationException
     *   if you pass them an invalid or unsupported attribute
     * - The DosFileAttributes interface makes the following archives available
     *     * archive
     *     * hidden
     *     * readonly
     *     * system
     * - The DOS attributes are available on a Windows system only. Trying to access them on other systems will throw a runtime exception
     * - When you read all DOS attributes using method Files.readAttributes() you also read the basic attributes
     * - The POSIX attributes are as follows
     *     * group
     *     * owner
     *     * permissions
     * - The POSIX attributes are available on the POSIX family of standards, such as UNIX or Linux. Trying to access them on other systems
     *   will throw a runtime exception
     * - To read or update the owner of a file or a directory you can use AclFileAttribute, FileOwnerAttributeView and
     *   PosixFileAttributeView interfaces
     * - The UserDefinedAttributeView interface can be used to add, delete, access and modify additional user-defined attributes to or
     *   from a file or directory. It defines methods delete(String), list(), read(String, ByteBuffer), size(String) and write(String, ByteBuffer)
     *   to respectively, delete, list, read, get an attribute's size and write the attributes values
     */
}
