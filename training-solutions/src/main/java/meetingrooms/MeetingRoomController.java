package meetingrooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {
    private static final List<String>  MENUITEMS = Arrays.asList("[1] Tárgyaló rögzítése","[2] Tárgyalók sorrendben","[3] Tárgyalók visszafele sorrendben","[4] Minden második tárgyaló","[5] Területek",
            "[6] Keresés pontos név alapján","[7] Keresés névtöredék alapján","[8] Keresés terület alapján","[9] Kilépés");

    private static final String  FRAME_COLORSCHEME = "\u001B[30;43m";
    private static final String LINEINPUT_COLORSCHEME = "\u001B[33;49m";

    Office office = new Office();
    PrintTable printTable = new PrintTable();

    // A menü string elemeit feltölti szóközökkel a táblázathoz megfelelő hosszúságra egy új lsitába, és átadja ezt az új listát a printRows metódusnak kiírásra, 2 fejléccel.
    public void printMenu(){
        List<String> printMenuItems = new ArrayList<>();
        System.out.println();
        for (String actuel : MENUITEMS) {
            printMenuItems.add(printTable.upToWidth("          " + actuel,70));
        }
        printTable.printRows("M E N Ü","TÁRGYALÓ NYILVÁNTARTÁS", printMenuItems,70);
    }

    // A metódus bekéri a paraméterként kapott értéket, ha az int, akkor visszadja, ha nem, újra kéri.
    public int getAnIntFromScanner(Scanner sc, String text) {
        System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + text);
        int result;
        for ( ; ; ) {
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                break;
            } else {
                System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + " A megadott érték nem egész szám! " + text);
                sc.next();
            }
        }
        return result;
    }

    // Bekéri a tárgyaló nevét, de ha már létezik, vagy esetleg üres stringet kapott, akkor újra kéri.
    public String getNameFromScanner(Scanner sc, String text) {
        System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + text);
        String result;
        for ( ; ; ) {
            result = sc.nextLine();
            if (!office.isExist(result) && !result.equals("")) {
                return result;
            } else {
                if (result.equals("")){
                    System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + " A megadott névnek legalább egy karakterből kell állnia! " + text);
                } else {
                    System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + " Van már ilyen nevű tárgyaló!" + text);
                }
            }
        }
    }

    // A metódus további metódushívásokkal bekéri az új tárgyaló nevét, szélességét és hosszúságát, majd hozzáadja a listához.
    public void readOffice(){
        Scanner scanner = new Scanner(System.in);

        String newName = getNameFromScanner(scanner," Add meg az új tárgyaló nevét: ").trim();
        int width = getAnIntFromScanner(scanner," Add meg az új tárgyaló szélességét (egész méterben): ");
        int length = getAnIntFromScanner(scanner," Add meg az új tárgyaló hosszúságát (egész méterben): ");

        office.addMeetingRoom(new MeetingRoom(newName, length, width));
        System.out.print(FRAME_COLORSCHEME + " A tárgyaló sikeresen rögzítve! " + LINEINPUT_COLORSCHEME);
        System.out.println();
    }

    // A metódus bekéri a választott menüpontot, és ha az 1-9 közé esik, visszaadja.
    // Ha nem 1-9 közé esik, akkor jelzi, hogy nincs ilyen menüpont, és újra kéri.
    public int getSelectedMenuItem(){
        Scanner scanner = new Scanner(System.in);
        int selectedMenuItem;
        for ( ; ; ) {
            System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + " Válassz a menüből! [1-9]: ");
            String s = scanner.nextLine();
            if ((s.length() == 1) && (s.charAt(0) >= '1') && (s.charAt(0) <='9')) {
                selectedMenuItem = Integer.parseInt(s);
                break;
            } else {
                System.out.println(FRAME_COLORSCHEME + " Nincs ilyen menüpont! " + LINEINPUT_COLORSCHEME);
            }
        }
        return selectedMenuItem;
    }

    public void runMenu(){

        // néhány induló adat a tesztekhez
        office.addMeetingRoom(new MeetingRoom("0 Felsőszint nagykedvenc",10,4));
        office.addMeetingRoom(new MeetingRoom("1 Másodikon kistárgyaló",5,5));
        office.addMeetingRoom(new MeetingRoom("2 Pici lyuk a másodikon",3,2));
        office.addMeetingRoom(new MeetingRoom("3 Negyediken felújítás alatt",6,7));
        office.addMeetingRoom(new MeetingRoom("4 Harmadikon hosszúkás",11,3));
        office.addMeetingRoom(new MeetingRoom("5 Ötödiken nagytárgyaló",12,8));
        office.addMeetingRoom(new MeetingRoom("6 Negyediken vidám és napos",7,4));
        office.addMeetingRoom(new MeetingRoom("7 Földszinti nyomasztó",7,8));
        office.addMeetingRoom(new MeetingRoom("8 Mélyföldszinti vallató kamra",5,4));
        office.addMeetingRoom(new MeetingRoom("9 CEOnak tágas penthousefeelinggel",8,9));

        Scanner scanner = new Scanner(System.in);

        boolean exit= false;
        do {
            printMenu();

            switch (getSelectedMenuItem()) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + " Add meg a keresett tárgyaló nevét: ");
                    String meetingRoomName = scanner.nextLine().trim();
                    office.printMeetingRoomsWithName(meetingRoomName);
                    break;
                case 7:
                    System.out.print(FRAME_COLORSCHEME + " " + LINEINPUT_COLORSCHEME + " Add meg az ismert szótöredéket a keresett tárgyaló nevéből: ");
                    String meetingRoomNamePart = scanner.nextLine();
                    office.printMeetingRoomContains(meetingRoomNamePart);
                    break;
                case 8:
                    int minArea = getAnIntFromScanner(scanner,"A keresett tárgyaló minimális alapterülete m²-ben? ["+office.getMinAndMax()+"]: "); // Kis segítségként megnézi, miylen intervallumban érdemes keresni
                    scanner.nextLine();
                    office.printAreasLargerThan(minArea);
                break;
                case 9:
                    exit = true;
            }
        } while (!exit);
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
