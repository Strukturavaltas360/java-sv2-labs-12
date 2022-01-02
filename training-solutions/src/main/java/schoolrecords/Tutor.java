package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubject = new ArrayList<>();

    public Tutor(String name) {
        this.name = name;
    }

    public Tutor(String name, List<Subject> taughtSubject) {
        this.name = name;
        this.taughtSubject = taughtSubject;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject s : taughtSubject) {
            if (s.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

}
