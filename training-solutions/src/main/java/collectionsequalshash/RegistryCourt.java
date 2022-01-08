package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Edo","3343433-33-3"));
        companies.add(new Company("Ada","65543433-13-9"));
        companies.add(new Company("Bata","334124433-31-1"));
        companies.add(new Company("Alexandra","33343-53-3"));

        System.out.println(companies.contains(new Company("Bata","334124433-31-1")));
        System.out.println(companies.contains(new Company("Ada","65543433-13-9")));
    }
}
