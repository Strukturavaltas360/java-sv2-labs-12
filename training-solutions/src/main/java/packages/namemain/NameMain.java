package packages.namemain;

import packages.prefix.Prefix;
import packages.firstname.FirstName;
import packages.lastname.LastName;


public class NameMain {

    public static void main(String[] args) {

        Prefix prefix = new Prefix("Dr.");
        FirstName firstName = new FirstName("Molnár");
        LastName lastName = new LastName("Péter");


        System.out.println(prefix.getPre()+" "+firstName.getFirst()+" "+lastName.getLast());

    }
}
