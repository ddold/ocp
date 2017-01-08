package chapter8.java_nio2.file_dir_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Map;

/**
 * Created by dan on 1/8/17.
 */
public class AccessAttributes {
    public void getFileAttrs(Path path){
        try {
            System.out.println("size:" + Files.size(path));
            System.out.println("isDirectory:" + Files.isDirectory(path));
            System.out.println("isExecutable:" + Files.isExecutable(path));
            System.out.println("isHidden:" + Files.isHidden(path));
            System.out.println("isReadable:" + Files.isReadable(path));
            System.out.println("isSameFile:" + Files.isSameFile(path, path));
            System.out.println("isSymbolicLink:" + Files.isSymbolicLink(path));
            System.out.println("isWritable:" + Files.isWritable(path));
            System.out.println("getLastModificationTime:" + Files.getLastModifiedTime(path));
            System.out.println("getOwner:" + Files.getOwner(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeAttr(Path path) {
        // Get specific attribute
        try {
            System.out.println("Creation time of file is " + Files.getAttribute(path, "creationTime"));

            // Change an attribute
            FileTime newTime = FileTime.fromMillis(System.currentTimeMillis() + 4);
            Files.setAttribute(path, "creationTime", newTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void modifyDateAttr(Path path){
        try {
            BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
            long now = System.currentTimeMillis();
            FileTime creation = FileTime.fromMillis(now - 60000);
            FileTime lastModified = FileTime.fromMillis(now - 50000);
            FileTime lastAccess = FileTime.fromMillis(now - 30000);

            view.setTimes(creation, lastModified, lastAccess);

            System.out.println();
            System.out.println("######");
            System.out.println();

            Map<String, Object> values = Files.readAttributes(path, "*");
            for(String attribute : values.keySet()){
                System.out.println(attribute + " : " + values.get(attribute));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void posixAttr(Path path){
        try {
            PosixFileAttributeView posixView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
            PosixFileAttributes posixAttrs = posixView.readAttributes();

            if (posixAttrs.owner().getName().equals("admin")){
                posixView.setPermissions(PosixFilePermissions.fromString("rwxrwxrwx"));
            } else {
                posixView.setPermissions(PosixFilePermissions.fromString("rwxr-x---"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args) throws IOException {
        Path path = Paths.get("/home/dan/Documents/OCP/chapter8/class_files.txt");
        AccessAttributes aa = new AccessAttributes();
        aa.getFileAttrs(path);
        aa.changeAttr(path);
        aa.modifyDateAttr(path);
    }
}
