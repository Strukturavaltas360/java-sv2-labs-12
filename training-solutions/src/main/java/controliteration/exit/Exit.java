package controliteration.exit;

import java.util.Scanner;

public class Exit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String exitKey  = "";

        do {
            System.out.println("\u001B[43m");
            System.out.println("\u001B[30;43;1m\t\t\t\t\t\t                                            Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            System.out.println("\u001B[43m");
            exitKey  = scanner.nextLine();

        } while (!exitKey.equals("x"));

    }
}
