package Builder;

public class Main {
    public static void main(String[] args){
        Dicrector directorObj1 = new Dicrector(new EngineerStudent());
        Dicrector directorObj2 = new Dicrector(new MbaStudent());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }
}
