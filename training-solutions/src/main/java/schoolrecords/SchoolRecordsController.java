package schoolrecords;

import java.util.*;

public class SchoolRecordsController {


    private static final String FRAME_COLORSCHEME = "\u001B[30;43m";
    private static final String LINE_INPUT_COLORSCHEME = "\u001B[33;49m";
    private static final List<String> MENUITEMS = Arrays.asList(
            "[1] Diákok nevének listázása",
            "[2] Diák név alapján keresése",
            "[3] Diák létrehozása",
            "[4] Diák név alapján törlése",
            "[5] Diák feleltetése",
            "[6] Osztályátlag kiszámolása",
            "[7] Tantárgyi átlag kiszámolása",
            "[8] Diákok átlagának megjelenítése",
            "[9] Diák átlagának kiírása",
            "[10] Diák tantárgyhoz tartozó átlagának kiírása",
            "[11] Kilépés");

    private ClassRecords classRecords;
    private PrintToConsol printToConsol;
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
        tutors.add(new Tutor("Bús Gabriella ", Arrays.asList(geology, biology, literature, grammar, english)));
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.classRecords = new ClassRecords("First Grade", new Random());
        schoolRecordsController.printToConsol = new PrintToConsol();
        schoolRecordsController.initSchool();
        schoolRecordsController.runMenu();
    }

    public void runMenu() {
        boolean exit = false;
        do {
            printMenu();
            switch (getSelectedMenuItem()) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    findStudent();
                    break;
                case 3:
                    readStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    repetitionStudent();
                    break;
                case 6:
                    classAverage();
                    break;
                case 7:
                    classAverageBySubject();
                    break;
                case 8:
                    studyResultByName();
                    break;
                case 9:
                    studentAverage();
                    break;
                case 10:
                    studentAverageBySubject();
                    break;
                case 11:
                    exit = true;
            }
        } while (!exit);
    }

    public void studentAverageBySubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Melyik diákot keressük? ");
        String findName = scanner.nextLine().trim();
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Melyik tantárgy átlagát számoljuk? ");
        String subjectString = scanner.nextLine().trim();
        Subject foundSubject = getSubject(subjectString);
        Student foundStudent = classRecords.findStudentByName(findName);
        double average = foundStudent.calculateSubjectAverage(foundSubject);
        String averageStringInCenter = printToConsol.centerText(Double.toString(average), 64);
        printToConsol.printRow(foundStudent.getName() + " átlaga " + foundSubject.getSubjectName() + " tantárgyból", averageStringInCenter, 66);
    }

    public void studentAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Melyik diákot keressük? ");
        String findName = scanner.nextLine().trim();
        Student foundStudent = classRecords.findStudentByName(findName);
        double average = foundStudent.calculateAverage();
        String averageStringInCenter = printToConsol.centerText(Double.toString(average), 54);
        printToConsol.printRow(findName + " összátlaga", averageStringInCenter, 56);
    }

    public void studyResultByName() {
        List<String> results = new ArrayList<>();
        List<StudyResultByName> studyResult = classRecords.listStudyResults();
        for (StudyResultByName s : studyResult) {
            results.add(printToConsol.upToWidth("    " + s.getStudentName() + ": " + s.getStudyAverage(), 46));
        }
        printToConsol.printRows("Diákok átlagai", null, results, 46);
    }

    public void classAverageBySubject() {
        List<String> averages = new ArrayList<>();
        for (Subject s : subjects) {
            String average = Double.toString(classRecords.calculateClassAverageBySubject(s));
            averages.add(printToConsol.upToWidth("         " + s.getSubjectName() + ": " + average, 36));
        }
        printToConsol.printRows("Tantárgyi átlagok", null, averages, 36);
    }

    public void classAverage() {
        String averageString = Double.toString(classRecords.calculateClassAverage());
        int studentNumber = classRecords.getNumberOfStudents();
        int numberOfMarks = classRecords.getNumberOfMarks();
        String averageStringInCenter = printToConsol.centerText(averageString, 54);
        printToConsol.printRow("Osztályátlag (" + studentNumber + " diák, " + numberOfMarks + " osztályzata alapján)", averageStringInCenter, 56);
    }

    public void repetitionStudent() {
        Student studentForRepetition = classRecords.repetition();
        Scanner scanner = new Scanner(System.in);
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " " + studentForRepetition.getName() + " osztályzata: ");
        String mark = scanner.nextLine().trim();
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Tantárgy megnevezése: ");
        String subjectText = scanner.nextLine().trim();
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Az oktató megnevezése: ");
        String tutorText = scanner.nextLine().trim();

        Tutor tutor = getTutor(tutorText);
        Subject subject = getSubject(subjectText);
        if (tutor.tutorTeachingSubject(subject)) {
            Mark markToRepetition = new Mark(MarkType.valueOf(mark), subject, tutor);
            studentForRepetition.grading(markToRepetition);
            System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Rögzítés SIKERES!");
        } else {
            System.out.println(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " " + tutor.getName() + " nem tanítja a(z) " + subject.getSubjectName() + " tárgyat! - Rögzítés SIKERTELEN!");
        }
    }

    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Melyik diákot szeretnénk törölni? ");
        String findName = scanner.nextLine().trim();
        try {
            Student foundStudent = classRecords.findStudentByName(findName);
            classRecords.removeStudent(foundStudent);
            System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " " + foundStudent.getName() + " nevű diákot töröltük a naplóból!");
        } catch (IllegalArgumentException iae) {
            System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " SIKERTELEN! " + findName + " nevű diákot nem tudtuk törölni a naplóból!");
        } catch (IllegalStateException ise) {
            System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " SIKERTELEN! " + findName + " nevű diákot nem tudtuk törölni a naplóból!");
        }

    }

    public void findStudent() {
        List<String> studentRepresentation = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Melyik diákot keressük? ");
        String findName = scanner.nextLine().trim();
        Student foundStudent = classRecords.findStudentByName(findName);

        int indexOfColon = foundStudent.toString().indexOf(":") + 1;
        String representation = foundStudent.toString().substring(indexOfColon);
        String[] temp = representation.split(",");
        for (String s : temp) {
            studentRepresentation.add(printToConsol.centerText(s.trim(), 80));
        }
        printToConsol.printRows(foundStudent.getName() + " osztályzatai", null, studentRepresentation, 82);
    }

    public void listStudents() {
        String[] temp = classRecords.listStudentNames().split(",");
        List<String> students = new ArrayList<>();
        for (String s : temp) {
            students.add(printToConsol.centerText(s.trim(), 40));
        }
        printToConsol.printRows("Diákok nevének listája", null, students, 42);

    }

    public void readStudent() {
        initStudents();
        Scanner scanner = new Scanner(System.in);
        System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Add meg az új diák nevét: ");
        String newName = scanner.nextLine().trim();
        if (classRecords.addStudent(new Student(newName))) {
            System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " " + newName + " nevű diákot rögzítettük a naplóban!");
        } else {
            System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Ilyen nevű diák már létezik!");
        }
    }

    public int getSelectedMenuItem() {
        Scanner scanner = new Scanner(System.in);
        int selectedMenuItem = 0;
        do {
            System.out.print(FRAME_COLORSCHEME + " " + LINE_INPUT_COLORSCHEME + " Válassz a menüből! [1-11]: ");
            String s = scanner.nextLine();
            try {
                selectedMenuItem = Integer.parseInt(s);
            } catch (IllegalArgumentException iae) {
                selectedMenuItem = 0;
            } finally {
                if (selectedMenuItem <= 0 || selectedMenuItem > 11) {
                    System.out.println(FRAME_COLORSCHEME + " Nincs ilyen menüpont! " + LINE_INPUT_COLORSCHEME);
                }
            }
        } while (selectedMenuItem <= 0 || selectedMenuItem > 11);
        return selectedMenuItem;
    }

    public void printMenu() {
        List<String> printMenuItems = new ArrayList<>();
        System.out.println();
        for (String actual : MENUITEMS) {
            printMenuItems.add(printToConsol.upToWidth("          " + actual, 70));
        }
        printToConsol.printRows("M E N Ü", "ELEKTRONIKUS OSZTÁLYNAPLÓ NYILVÁNTARTÁS", printMenuItems, 70);
    }

    private void initStudents() {
        classRecords.addStudent(new Student("Galagonyás Márta"));
        classRecords.addStudent(new Student("Kiss Jutka"));
        classRecords.addStudent(new Student("Borbély Béla"));
    }

    private Tutor getTutor(String tutorText) {
        for (Tutor t : tutors) {
            if (tutorText.equals(t.getName())) {
                return t;
            }
        }
        throw new IllegalStateException("No such tutor!");
    }

    private Subject getSubject(String subjectText) {

        for (Subject s : subjects) {
            if (subjectText.equals(s.getSubjectName())) {
                return s;
            }
        }
        throw new IllegalStateException("No such subject!");
    }

}

