package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfbirth) {
        SsnValidator ssnValidator = new SsnValidator();

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A név nem lehet üres!");
        }
        if (yearOfbirth < 1900) {
            throw new IllegalArgumentException("1900 előtt született személy nem valid");
        }

        if (!ssnValidator.isValidSsn(socialSecurityNumber)) {
            throw new IllegalArgumentException("Hibás TAJ szám!");
        }

        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        try {
            Patient patient = new Patient("Péter", "121212128", 1903);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        Patient firstPatient = new Patient("Kiss József", "123456788", 1954);

        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());

        Patient secondPatient = new Patient("", "123456788", 1954);

        System.out.println(secondPatient.getName());
        System.out.println(secondPatient.getSocialSecurityNumber());
        System.out.println(secondPatient.getYearOfBirth());

        Patient thirdPatient = new Patient("Kiss József", "123456789", 1954);

        System.out.println(thirdPatient.getName());
        System.out.println(thirdPatient.getSocialSecurityNumber());
        System.out.println(thirdPatient.getYearOfBirth());

        Patient fourthPatient = new Patient("Kiss József", "123456788", 1888);

        System.out.println(fourthPatient.getName());
        System.out.println(fourthPatient.getSocialSecurityNumber());
        System.out.println(fourthPatient.getYearOfBirth());
    }
}
