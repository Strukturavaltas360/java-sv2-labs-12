package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {

        Winner winner = new Winner();

        try {
            String person = winner.getWinner();
            System.out.println(" The winner is... : "+ person);
        }
        catch (NullPointerException npe) {
            System.out.println("Nem létező személy!");
        }
    }
}
