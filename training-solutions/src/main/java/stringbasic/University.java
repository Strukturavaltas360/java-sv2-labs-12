package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        if (student.getEducationID().equals(anotherStudent.getEducationID()) && student.getNeptunNumber().equals(anotherStudent.getNeptunNumber())){
            return true;
        }
        return false;
    }
}
