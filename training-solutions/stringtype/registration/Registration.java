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

        System.out.println("Regisztráció");
        System.out.println("Kérlek add meg a felhasználónevedet!");
        username = sc.nextLine();
        isUsernameOk = uservalidator.isValidUserName(username);

        System.out.println("Kérlek add meg a jelszavadat! (minimum 8 karakter hosszúságú)");
        password1 = sc.nextLine();
        System.out.println("Kérlek ismételd meg jelszavadat!");
        password2 = sc.nextLine();

        isPasswordOk = uservalidator.isValidPassword(password1,password2);

        System.out.println("Kérlek add meg az emailcímed!");
        email = sc.nextLine();
        isEmailOk = uservalidator.isValidEmail(email);

        System.out.println();
        System.out.println(isUsernameOk ? "* Felhasználónév: OK" : "* A felhasználónév hiányzik");
        System.out.println(isPasswordOk ? "* Jelszó OK" : "* Hibás jelszó");
        System.out.println(isEmailOk ? "* Email OK" : "* Hibás emailcím");

        System.out.println();
        System.out.println(isEmailOk && isPasswordOk && isUsernameOk ? "Köszönjük a regisztrációt!" : "Sajnos meg kell ismételned a regisztrációt!");

    }
}
