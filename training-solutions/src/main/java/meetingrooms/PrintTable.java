package meetingrooms;

import java.util.List;
import java.util.Locale;

public class PrintTable {
    private final String DEFAULT_COLORSCHEME = "\u001B[39;49m";
    private final String FRAME_COLORSCHEME = "\u001B[30;43m";
    private final String ROW_EVEN_COLORSCHEME = "\u001B[39;49m";
    private final String ROW_ODD_COLORSCHEME = "\u001B[30;47m";

    public String upToWidth(String line, int width) { // kiegészíti a szöveget szóközökkel a táblázat szélességéig
        StringBuilder sb = new StringBuilder(line);
        for (int i = line.length(); i < width-2; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public String toUppercase (String text) { //Nagybetűkké alakítja a paraméterként kapott stringet, de ha van a szövegben idézőjel, az idézetet változatlanul hagyja

            String resultString ="";
            int i = text.indexOf("'");
            if ( i > 0) {
                String s1 = text.substring(0,i+1);
                int j = text.indexOf("'",i+1);
                String s2 = text.substring(i+1,j);
                String s3 = text.substring(j);
                resultString = s1.toUpperCase() + s2 + s3.toUpperCase();
            } else {
                return text.toUpperCase();
            }
        return resultString ;
    }


    // A paraméterként kapott szöveget stringbuilderrel a width szélességű karakterlánc közepén adja vissza. Elé és mögé szóközöket tesz.

    public String centerText(String textToCenter, boolean toUppercaseBoolean, int width){
        StringBuilder resultSB = new StringBuilder(textToCenter);
        if (toUppercaseBoolean) {
            resultSB = new StringBuilder(toUppercase(textToCenter));    // Ha a toUppercaseBoolean paraméter true, akkor a szöveg idézeten kívüli részét nagybetűssé alakítja
        }
        if (resultSB.length()%2 != 0) {
            resultSB.append(" ");
        }

        int padding = (width - textToCenter.length()) / 2;
        if (textToCenter.contains("\u001B")) {  // ha van színséma megadva a szövegben (aláhúzás, bold), módosítani kell a paddingot, mert nem kezeli jól a string hosszát.
            padding += 7;
        }
        for (int i = 1; i <= padding; i++) {
            resultSB.insert(0," ");
            resultSB.append(" ");
        }
        return resultSB.toString();
    }

    //// Kiírja a táblázat  fejlécét és plusz egy opcionális fejlécet, a megadott szélességben
    public void printHeading( String heading, String heading2, int width) {
        System.out.println(FRAME_COLORSCHEME + centerText("", false, width) + DEFAULT_COLORSCHEME);
        if (!heading2.equals("")) {
            System.out.println(FRAME_COLORSCHEME + centerText(heading2,true, width) + DEFAULT_COLORSCHEME);
            System.out.println(FRAME_COLORSCHEME + centerText("", false,  width) + DEFAULT_COLORSCHEME);
        }

        System.out.println(FRAME_COLORSCHEME + centerText(heading, false, width) + DEFAULT_COLORSCHEME);
        System.out.println(FRAME_COLORSCHEME + centerText("", false, width) + DEFAULT_COLORSCHEME);

    }

    // Lábléc kiírása
    public void printFooter(int width) {
        System.out.println(FRAME_COLORSCHEME + centerText("", false, width) + DEFAULT_COLORSCHEME);
    }

    //Fejléc és lábléc között kiírja a keretszegélyek között soronként váltakozó színsémával a paraméterben kapott string lista elemeit.
    public void printRows(String heading, String heading2, List<String > lines, int width) {

        printHeading(heading, heading2, width);

        for (int i = 0; i <= lines.size()-1; i++) {
            if (i % 2 == 0) {
                System.out.println(FRAME_COLORSCHEME + " " + ROW_EVEN_COLORSCHEME + lines.get(i) + FRAME_COLORSCHEME + " " + DEFAULT_COLORSCHEME);
            } else {
                System.out.println(FRAME_COLORSCHEME + " " + ROW_ODD_COLORSCHEME + lines.get(i) + FRAME_COLORSCHEME + " " + DEFAULT_COLORSCHEME);
            }
        }
        printFooter(width);
    }
}
