package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client1 = new Client();

        client1.setName("Nemecsek Ernő");
        client1.setAddress("Budapest, Rákos u. 2.");
        client1.setYear(1875);

        System.out.println("Ügyfél adatai:");
        System.out.println("Név: "+client1.getName()+ "  | Lakcím: "+client1.getAddress()+"  | Születési év: " + client1.getYear());

        client1.migrate("Budapest, Pál u. 1.");
        System.out.println("Lakcímváltozási kérelmét rögzítettük. A megadott új lakcím: "+ client1.getAddress());
    }
}
