package Composite;

public class File implements FileSystem {
    String filename;
    File(String fs) {this.filename = fs;}

    public void ls(){
        System.out.println("File Name is " + filename);
    }
}
