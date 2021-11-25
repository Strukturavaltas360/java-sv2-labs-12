package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    List<Person> personList;

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        for (Person actualPerson: personList) {
            if (actualPerson.getAge() < 14) {
                studentList.add(new Student(actualPerson.getName(),actualPerson.getAddress()));
            }
        }
        return studentList;
    }
}
