package Prototype;


public class Prototype {
    public static void main(String[] args){
        ProtoTypeStudent student = new ProtoTypeStudent(1,"Bhavya",3);
        ProtoTypeStudent studentClone = student.createClone();
        System.out.println(studentClone.name);
    }
}

