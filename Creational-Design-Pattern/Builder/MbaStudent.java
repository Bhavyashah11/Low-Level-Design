package Builder;
import java.util.*;
public class MbaStudent extends StudentBuilder {
    
    @Override
    public StudentBuilder setSubjects(){
    List<String> subject = new ArrayList<>();
    subject.add("Marketing");
    subject.add("HR");
    subject.add("Finance");
    super.subjects = subject;
    return this;
    }
}
