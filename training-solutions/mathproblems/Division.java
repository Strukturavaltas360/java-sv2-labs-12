package mathproblems;

public class Division {

    public void getDivisors(int number) {
        System.out.print("A "+number+" osztói: ");
        for (int i = 1; i<= number;i++) {
            System.out.print(number%i ==0 ? i+" | "  : "");
        }
    }

    public static void main(String[] args) {
        Division div = new Division();
        div.getDivisors(72);
    }

}
