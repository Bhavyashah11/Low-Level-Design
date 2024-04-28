package Builder;
import java.util.*;

public class Dicrector {

    StudentBuilder studentBuilder;
    Dicrector (StudentBuilder sb){this.studentBuilder =sb;}
    
    public Student createStudent(){
        if(studentBuilder instanceof EngineerStudent){
            return createEngStudent();
        
        }
        else if( studentBuilder instanceof MbaStudent){
            return createMbaStudent();
        }
        return null;
    }

    private Student createMbaStudent() {
        return studentBuilder.setRollNo(1).setAge(22).setName("sj").setSubjects().build();
    }

    private Student createEngStudent() {
        return studentBuilder.setAge(23).setName("Bhavya").setSubjects().build();
    }
}
