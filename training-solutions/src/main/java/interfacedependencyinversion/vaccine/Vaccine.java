package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public interface Vaccine {

    List<Person> getVaccinationList();

    void generateVaccinationList(List<Person> registrated);

}
