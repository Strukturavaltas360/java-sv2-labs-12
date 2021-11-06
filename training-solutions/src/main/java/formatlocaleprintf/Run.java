package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    List<Double> kilometers;
    String nameOfRunner;

    public Run(String nameOfRunner) {
        this.nameOfRunner = nameOfRunner;
        this.kilometers = new ArrayList<>();
    }

    public void addRun(double km) {
        kilometers.add(km);
    }

    public String printFormattedRunText() {
        double sumOfRun =0;
        for (double runs: kilometers) {
            sumOfRun += runs;
        }

        String text = String.format("Kedves \u001B[33;1m%s\u001B[39;0m! A mai dátum: \u001B[36;1m%s\u001B[39;0m. Ezen a héten ez a(z) \u001B[39;49;7m%d.\u001B[39;0m futásod. Összesen \u001B[32;1m%.1f\u001B[39;0m km-t futottál (ebből most \u001B[34;1m%.1f\u001B[39;0m km-t). Csak így tovább!"
                ,nameOfRunner,LocalDate.now().toString(),kilometers.size(),sumOfRun,kilometers.get(kilometers.size()-1));
        return text;
    }

    public static void main(String[] args) {

        Run pisti = new Run("Futó István");
        pisti.addRun(1.4);
        System.out.println(pisti.printFormattedRunText());
        pisti.addRun(45.4);
        System.out.println(pisti.printFormattedRunText());
        pisti.addRun(15.);
        System.out.println(pisti.printFormattedRunText());
        pisti.addRun(5.9);
        System.out.println(pisti.printFormattedRunText());
        pisti.addRun(25.2);
        System.out.println(pisti.printFormattedRunText());
    }
}
