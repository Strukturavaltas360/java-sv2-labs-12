package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        List<String> classLongNames = new ArrayList<>();
        List<String> classShortNames = new ArrayList<>();

        for (String name : students) {
            if (name.length() <= 10) {
                classShortNames.add(name);
            } else {
                classLongNames.add(name);
            }
        }
        System.out.println("Rövid neves csoport:" + classShortNames);
        System.out.println("Hosszú neves csoport:" + classLongNames);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Kovács Zsófia","Joó Máté Gergő","Élő Luca","Fás Máté","Figder Milán","Fehér Melissza","Gábriel Nóra","Gombos Zalán",
                "Gondár Alíz","Horváth Karina Hanna","Hoós Zita","Horváth Maja","Horváth Félix","Kis Máté","Horváth Hermina","Kloó Iza","Kiss Éva","Kovács Adél Csenge");

        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}
