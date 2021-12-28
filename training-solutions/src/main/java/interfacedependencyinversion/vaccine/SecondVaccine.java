package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return List.copyOf(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        for (Person p : registrated) {
            if (isValidForVaccine(p)) {
                if (p.getAge() <= 65) {
                    vaccinationList.add(0, p);
                } else {
                    vaccinationList.add(vaccinationList.size(), p);
                }
            }
        }
    }

    private boolean isValidForVaccine(Person p) {
        if (p.getPregnancy() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
            return true;
        }
        return false;
    }
}
