package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SchoolRecordsController {

    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();

    public void initSchool() {

        Subject geology = new Subject("földrajz");
        Subject math = new Subject("matematika");
        Subject biology = new Subject("biológia");
        Subject music = new Subject("zene");
        Subject physics = new Subject("fizika");
        Subject chemistry = new Subject("kémia");
        Subject physicalEducation = new Subject("testnevelés");
        Subject literature = new Subject("irodalom");
        Subject grammar = new Subject("nyelvtan");
        Subject english = new Subject("angol");
        Subject history = new Subject("történelem");

        subjects.add(geology);
        subjects.add(math);
        subjects.add(biology);
        subjects.add(music);
        subjects.add(physics);
        subjects.add(chemistry);
        subjects.add(physicalEducation);
        subjects.add(literature);
        subjects.add(grammar);
        subjects.add(english);
        subjects.add(history);

        tutors.add(new Tutor("Nagy Csilla", Arrays.asList(geology, math, physics, chemistry)));
        tutors.add(new Tutor("Hortobágyi Jenő", Arrays.asList(geology, math, physics, chemistry, biology, literature, grammar, english, physicalEducation, music)));
        tutors.add(new Tutor("Magyar Ákos", Arrays.asList(english, physicalEducation)));
        tutors.add(new Tutor("Udvaros Ágnes", Arrays.asList(music)));
        tutors.add(new Tutor("Tordai Béla", Arrays.asList(math, physics, chemistry)));
        tutors.add(new Tutor("Ág Edit", Arrays.asList(history, literature, grammar)));
        tutors.add(new Tutor("Bús Gabriella ", Arrays.asList(geology,biology, literature, grammar, english)));
    }

    public static void main(String[] args) {
        ClassRecords classRecords = new ClassRecords("First Grade", new Random());
        new SchoolRecordsController().initSchool();

    }
}

