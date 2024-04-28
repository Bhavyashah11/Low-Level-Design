package Builder;
import java.util.*;
public class EngineerStudent extends StudentBuilder {
    
    @Override
    public StudentBuilder setSubjects(){
    List<String> subject = new ArrayList<>();
    subject.add("DSA");
    subject.add("CN");
    subject.add("DB");
    subject.add("OOPS");
    super.subjects = subject;
    return this;
    }
}
