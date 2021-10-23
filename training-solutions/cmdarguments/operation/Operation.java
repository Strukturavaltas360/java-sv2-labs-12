package cmdarguments.operation;

public class Operation {

    public static void main(String[] args) {

//        delete minden egyéb 2 add megint valami list

        Boolean b;

        for (String word: args) {

            b = false;

            if (word.equals("/list")) {
                System.out.println("Listázás");
                b = true;
            }
            if (word.equals("/delete")) {
                System.out.println("Törlés");
                b = true;
            }
            if (word.equals("/add")) {
                System.out.println("Hozzáadás");
                b = true;
            }
            if (b == false) {
                System.out.println("Ismeretlen művelet");
            }

        }
    }
}
