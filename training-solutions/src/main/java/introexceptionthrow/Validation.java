package introexceptionthrow;

public class Validation {

    public void validateName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A név üres vagy null!");
        }
    }

    public void validateAge(String ageString) {
        if (ageString.length() ==0) {
            throw new IllegalArgumentException("Üres String az életkor helyett!");
        }

      for (int i=0;i<ageString.length();i++) {
            if (!Character.isDigit(ageString.charAt(i))) {
                throw new IllegalArgumentException("Az életkornak megadott érték nem szám!");
            }
        }

        if (Integer.parseInt(ageString) > 120) {
            throw new IllegalArgumentException("Az életkornak 0 és 120 között kell lennie!");

        }

    }
}
