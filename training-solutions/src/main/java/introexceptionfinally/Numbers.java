package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Adj meg egy számot! (páros számra kilép) ");
            try {
                number = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Sorry, it wasn't a number!", nfe);
            }
            finally {
                System.out.println("End of round");
            }

        } while (!(number% 2  == 0));

    }
}