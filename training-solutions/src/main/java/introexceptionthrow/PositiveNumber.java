package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addj meg egy pozitiv számot! ");
        String s = sc.nextLine();
        for (int i = 0;i<s.length();i++) {
            if (!Character.isDigit(s.charAt(i))) {
                throw new IllegalArgumentException("A '"+s+"' nem pozitív egész szám!");
            }
        }
    }
}
