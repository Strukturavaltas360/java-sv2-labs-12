package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Earl Grey",10);
        HerbalTea herbalTea = new HerbalTea("lipton",8);

        System.out.println(tea.getName()+": "+tea.getPrice());
        System.out.println(herbalTea.getName()+": "+herbalTea.getPrice());
    }
}
