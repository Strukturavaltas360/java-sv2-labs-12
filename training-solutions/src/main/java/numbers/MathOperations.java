package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mennyi lesz (6+5)*(7-2)/8 eredménye? ");
        double input = scanner.nextDouble();
        System.out.print(Math.abs(input-6.875)<0.0001 ? "A kapott megoldás helyes (±0.0001 eltérés engedélyezett)." : "A kapott megoldás hibás! Legalább 0.0001-gyel eltér a helyes eredménytől.");
    }
}
