package stringbasic;

import java.util.Arrays;

public class UniversityMain {

    public static void main(String[] args) {

        University university = new University();

        Person bela = new Person("Béla","bela@gmail.com","2783628746238", "239487249724","334334444");
        Person lajos = new Person("Lajos","lali@gmail.com","2783628734348", "224972323224","9998011984");
        Person ica = new Person("Ica","ica@gmail.com","2783628746238", "239487249724","334334444");
        Person vica = new Person("Vica","ica@gmail.com","2783628746238", "239487249724","334334444");

        Student st = new Student(bela,"669966","112211");
        university.addStudent(st);

        Student st1 = new Student(lajos,"988787","9898989");
        university.addStudent(st1);

        Student st3 = new Student(ica,"911787","98989890");
        university.addStudent(st3);
        Student st4 = new Student(vica,"911787","98989890");
        university.addStudent(st4);

        st4.setAccessCode("17661");
        System.out.println(university.getStudentList());

        System.out.print("Is the same person: "+ st1.getPerson().getName()+" and "+st4.getPerson().getName()+"?   ");
        System.out.println(university.areEqual(st1,st4));
        System.out.print("Is the same person: "+ st3.getPerson().getName()+" and "+st4.getPerson().getName()+"?   ");
        System.out.println(university.areEqual(st3,st4));
    }
}
