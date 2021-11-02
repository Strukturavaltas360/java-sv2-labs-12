package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints){
        Scanner sc = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();

        boolean first = true;
        while (sc.hasNextInt()) {
            int intNumber = sc.nextInt();
            if (intNumber>100) {
              if (first == false) {
                  sb.append(", ");
              }
              sb.append(intNumber);
              first = false;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("101;23;23232;4;1;343;8787;99"));
        System.out.println(intScanner.convertInts("23232"));
        System.out.println(intScanner.convertInts("10;23;32;4;1;43;87;99"));
        System.out.println(intScanner.convertInts("99"));
        System.out.println(intScanner.convertInts(""));

    }


}
