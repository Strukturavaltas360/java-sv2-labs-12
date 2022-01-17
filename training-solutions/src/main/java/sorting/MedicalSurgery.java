package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MedicalSurgery {

    List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> result = getPatients();
        result.sort(new PatientComparator());
        return result;
    }
}
