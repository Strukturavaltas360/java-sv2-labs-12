package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        for (University univ : University.values()) {
            System.out.println(univ + "  \t" + univ.getName());
        }
    }
}
