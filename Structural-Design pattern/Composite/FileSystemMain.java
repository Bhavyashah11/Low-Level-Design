package Composite;

public class FileSystemMain {
    public static void main(String[] args) {
        Directory dir = new Directory("Movie");
        FileSystem file = new File("ABCD");
        dir.add(file); 

        Directory subDir = new Directory("Comedy Movie");
        FileSystem subDirFile = new File("Hera Pheri");
        subDir.add(subDirFile);
        dir.add(subDir);
        
        dir.ls();
    }
}
