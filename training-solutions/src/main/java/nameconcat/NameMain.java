package nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name n1 = new Name("Kovács","Béla","József",Title.MR);
        Name n2 = new Name("Molnár","","Aranka");
        Name n3 = new Name("Somogyi","B","Martina",Title.MS);

        System.out.println("|HU| " + n1.concatNameHungarianStyle());
        System.out.println("|EN| " + n1.concatNameWesternStyle());
        System.out.println("|HU| " + n2.concatNameHungarianStyle());
        System.out.println("|EN| " + n2.concatNameWesternStyle());
        System.out.println("|HU| " + n3.concatNameHungarianStyle());
        System.out.println("|EN| " + n3.concatNameWesternStyle());


    }
}
