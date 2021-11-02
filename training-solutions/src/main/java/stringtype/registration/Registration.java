package stringtype.registration;

import java.util.Scanner;

public class Registration {


    public static void main(String[] args) {

        String username;
        String password1;
        String password2;
        String email;
        boolean isUsernameOk;
        boolean isPasswordOk;
        boolean isEmailOk;

        Scanner sc = new Scanner(System.in);
        UserValidator uservalidator = new UserValidator();

        System.out.println("Regisztráció - Kérlek, add meg a következő adatokat!");
        System.out.println("Felhasználónév:");
        username = sc.nextLine();
        isUsernameOk = uservalidator.isValidUserName(username);

        System.out.println("Jelszó (min. 8 karakter hosszú):");
        password1 = sc.nextLine();
        System.out.println("Jelszó ismét:");
        password2 = sc.nextLine();

        isPasswordOk = uservalidator.isValidPassword(password1,password2);

        System.out.println("Emailcím:");
        email = sc.nextLine();
        isEmailOk = uservalidator.isValidEmail(email);

        System.out.println();
        System.out.println(isUsernameOk ? "* Felhasználónév: OK" : "* Hibás felhasználónév");
        System.out.println(isPasswordOk ? "* Jelszó OK" : "* Hibás jelszó");
        System.out.println(isEmailOk ? "* Email OK" : "* Hibás emailcím");

        System.out.println();
        System.out.println(isEmailOk && isPasswordOk && isUsernameOk ? "Kedves "+username+", a regisztrációd sikeres volt!" : "Sajnos meg kell ismételned a regisztrációt!");

    }

}
