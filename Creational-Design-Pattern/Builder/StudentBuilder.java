package Builder;

import java.util.*;

public abstract class StudentBuilder {
    int rollno;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNo(int r){
        this.rollno=r;
        return this;
    }

    public StudentBuilder setAge(int a){
        this.age=a;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name=name;
        return this;
    }

    public StudentBuilder setMotherName(String name){
        this.motherName=name;
        return this;
    }
    public StudentBuilder setFatherName(String name){
        this.fatherName=name;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
