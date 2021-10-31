package stringbasic;

public class Student {
        private Person person;
        String neptunNumber;
        String educationID;
        String accessCode;

    public Student(Person person, String neptunNumber, String educationID) {
        this.person = person;
        this.neptunNumber = neptunNumber;
        this.educationID = educationID;
    }

    @Override
    public String toString() {
        return  person +
                "\t| "+ "neptunNumber: " + neptunNumber + "\t| educationID: " + educationID + "\t| accessCode: " + accessCode + "\n";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunNumber() {
        return neptunNumber;
    }

    public void setNeptunNumber(String neptunNumber) {
        this.neptunNumber = neptunNumber;
    }

    public String getEducationID() {
        return educationID;
    }

    public void setEducationID(String educationID) {
        this.educationID = educationID;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
}
