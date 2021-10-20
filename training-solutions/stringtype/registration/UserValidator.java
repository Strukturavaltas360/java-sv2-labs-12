package stringtype.registration;

public class UserValidator {


    public boolean isValidUserName(String username){
        return username.length()>0? true : false;
    }

    public boolean isValidPassword(String password1, String password2){
        return password1.length()>=8 && password1.equals(password2) ? true : false;
    }

    public boolean isValidEmail(String email) {
        int atPosition = email.indexOf("@");
        int dotPosition = email.indexOf(".");
        return atPosition >= 1  && dotPosition > (atPosition+1) && dotPosition <= email.length()-2 ? true : false;

    }
}
