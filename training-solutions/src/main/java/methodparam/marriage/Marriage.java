package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        man.addRegisterDate(new RegisterDate("Házasságkötés", LocalDate.now()));
        woman.addRegisterDate(new RegisterDate("Házasságkötés", LocalDate.now()));
    }
}
