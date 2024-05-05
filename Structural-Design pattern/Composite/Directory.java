package Composite;

import java.util.*;

public class Directory implements FileSystem{
 String directoryname;
 List<FileSystem> fileSystem ;

 Directory(String name){
    this.fileSystem = new ArrayList<>();
    this.directoryname = name;
 }

 public void add(FileSystem fs){fileSystem.add(fs);}

 public void ls(){
    System.out.println("Directory Name : " + directoryname);
    for (FileSystem obj : fileSystem){
        obj.ls();
    }
 }
}
