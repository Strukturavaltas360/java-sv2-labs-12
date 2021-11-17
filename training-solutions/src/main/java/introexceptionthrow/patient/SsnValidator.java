package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn){

        if (ssn.length() != 9) {
            return false;
        }
        int checksum = 0;
        int sum = 0;
        try {
            for (int i = 0; i < ssn.length(); i++) {
                if (i % 2 == 0) {
                    sum += 3 * Integer.parseInt(ssn.substring(i,i+1));
                } else {
                    sum += 7 * Integer.parseInt(ssn.substring(i,i+1));
                }
                checksum = Integer.parseInt(ssn.substring(8,9));
            }
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return sum % 10 != checksum;
    }
}

