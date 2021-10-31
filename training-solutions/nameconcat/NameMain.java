package nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name n1 = new Name("Kovács","Béla","József",Title.MR);
        Name n2 = new Name("Kovács","Béla","József",Title.DR);
        Name n3 = new Name("Molnár","","Aranka",Title.MRS);

        System.out.println("|HU| " + n1.concatNameHungarianStyle());
        System.out.println("|EN| " + n2.concatNameWesternStyle());
        System.out.println("|EN| " + n3.concatNameWesternStyle());
    }
}
