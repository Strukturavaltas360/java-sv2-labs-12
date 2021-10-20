package stringtype.registration;

import java.util.Scanner;

public class Registration {


    public static void main(String[] args) {

        String username;
        String password1;
        String password2;
        String email;

        Scanner sc = new Scanner(System.in);
        UserValidator uservalidator = new UserValidator();
//
//        username = sc.nextLine();
//        System.out.println(username);
//        System.out.println(uservalidator.isValidUserName(username));
//
//        password1 = sc.nextLine();
//        password2 = sc.nextLine();
//
//        System.out.println(password1);
//        System.out.println(password2);
//        System.out.println(uservalidator.isValidPassword(password1,password2));

        email = sc.nextLine();
        System.out.println(email);
        System.out.println(uservalidator.isValidEmail(email));

    }
}
