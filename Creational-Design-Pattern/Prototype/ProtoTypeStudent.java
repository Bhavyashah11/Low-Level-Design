package Prototype;

class ProtoTypeStudent implements ProtoTypeStudentInterface{
    private int rollNo;
    String name;
    int age;
    
    public ProtoTypeStudent(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    @Override
    public ProtoTypeStudent createClone(){

        return new ProtoTypeStudent(rollNo, name, age);
    }
}