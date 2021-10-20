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
        isUsernameOk=uservalidator.isValidUserName(username);
        System.out.println(isUsernameOk);

        System.out.println("Kérlek add meg a jelszavadat!");
        password1 = sc.nextLine();
        System.out.println("Kérlek ismételd meg jelszavadat!");
        password2 = sc.nextLine();

        isPasswordOk=uservalidator.isValidPassword(password1,password2);
        System.out.println(isPasswordOk);

        System.out.println("Kérlek add meg az emailcímed!");
        email = sc.nextLine();
        isEmailOk=uservalidator.isValidEmail(email);
        System.out.println(isEmailOk);

    }
}
