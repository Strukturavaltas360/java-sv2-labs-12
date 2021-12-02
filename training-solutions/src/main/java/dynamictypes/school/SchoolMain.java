package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {

        School school1 = new School("Jókai",181);
        School school2 = new PrimarySchool("Kodolányi",65);
        School school3 = new SecondarySchool("Kereskedelmi",48);

        System.out.println(school1);
        System.out.println(school2);
        System.out.println(school3);

    }
}

