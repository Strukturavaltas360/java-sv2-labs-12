package cmdarguments.verse;

public class VerseMain {

    public static void main(String[] args) {

        for (String word:args) {
            System.out.println(word);
        }

        for (int i= args.length-1; i>=0; i--) {
            System.out.print(args[i]+" ");
        }
    }
}
