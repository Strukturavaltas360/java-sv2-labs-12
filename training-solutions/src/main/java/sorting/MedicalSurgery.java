package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MedicalSurgery {

    List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> result = new ArrayList<>(patients);
        result.sort(new PatientComparator());
        return result;
    }
}
