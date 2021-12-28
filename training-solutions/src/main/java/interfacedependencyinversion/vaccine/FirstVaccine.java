package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return List.copyOf(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        for (Person p : registrated) {
            if (p.getPregnancy() == Pregnancy.YES) {
                vaccinationList.add(0, p);
            }
            if (p.getAge() > 65) {
                vaccinationList.add(vaccinationList.size(), p);
            }
        }
        List<Person> temp = new ArrayList<>(registrated);
        temp.removeAll(vaccinationList);
        vaccinationList.addAll(temp);
    }
}
