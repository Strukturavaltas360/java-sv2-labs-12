package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee geza = new Employee("Kis Géza","minőségellenőr",520000);
        Employee bela = new Employee("Ács Béla","minőségellenőr",560000);

        System.out.println(geza);
        System.out.println(bela);
    }
}
