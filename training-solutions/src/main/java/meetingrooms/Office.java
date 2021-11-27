package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();
    PrintTable printTable = new PrintTable();
    private static final String UNDERLINED_AND_BOLD_COLORSCHEME = "\u001B[4;1m";
    private static final String NOT_UNDERLINED_AND_BOLD_COLORSCHEME = "\u001B[24;22m";


    public void printNames(){
        List<String> resultList = new ArrayList<>();

        for (MeetingRoom actual: meetingRooms) {
            resultList.add(printTable.upToWidth("       " + actual.getName(), 60));
        }
        printTable.printRows("Tárgyalók rögzítési sorrendben","", resultList, 60);
    }

    public void printNamesReverse() {
        List<String> resultList = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            resultList.add(printTable.upToWidth("       " + meetingRooms.get(i).getName(), 60)); // balra zárva
        }
        printTable.printRows("Tárgyalók visszafele sorrendben", "",resultList, 60);
    }

    public void printEvenNames() {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i <= meetingRooms.size()-1; i += 2) {
            resultList.add(printTable.centerText(meetingRooms.get(i).getName(), false, 58)); // középre igazítva
        }
        printTable.printRows("Minden második tárgyaló","", resultList, 60);
    }

    //A metódus a részletes kiírásokhoz készíti a MeetingRoom lista elemeihez egy stringet. Az elemek a nekik megadott szélesség közepére kerülnek..
    public String addPositionedMeetingRoomLine(MeetingRoom meetingRoom, int widthName, int widthWidth, int widthLength, int widthArea) {
        String nameToCenter = printTable.centerText(meetingRoom.getName(), false, widthName);
//        String nameToCenter = printTable.upToWidth("        " + meetingRoom.getName(), widthName+2);  //  balra zárva
        String widthToCenter = printTable.centerText((meetingRoom.getWidth()+ "m"), false, widthWidth);
        String lengthToCenter = printTable.centerText((meetingRoom.getLength()+"m"), false, widthLength);
        String areaToCenter = printTable.centerText((meetingRoom.getArea()+"m²"),false, widthArea);
        return (nameToCenter + widthToCenter + lengthToCenter + areaToCenter);
    }

    // A metódus fejlécet állít össze a részletes kiírásokhoz
    public String getHeaderForLongTable() {
        return  printTable.centerText("Tárgyaló neve", false, 50) + printTable.centerText("Szélesség", false, 16) +
                printTable.centerText("Hosszúság", false, 16) + printTable.centerText("Terület", false, 16);
    }

    public void printAreas(){
        List<String> resultList = new ArrayList<>();
        for (MeetingRoom actual: meetingRooms) {
            resultList.add(addPositionedMeetingRoomLine(actual,50,16,16,16));
        }
        printTable.printRows(getHeaderForLongTable(),"A rendszerben lévő tárgyalók részletes adatai", resultList,100);
    }

    //  A paraméterként kapott nevű tárgyalókat listába rakja és meghívja a kiíró metódust.
    public void printMeetingRoomsWithName(String name){
        List<String> resultList = new ArrayList<>();
        for (MeetingRoom actual: meetingRooms) {
            if (actual.getName().equals(name)) {
                resultList.add(addPositionedMeetingRoomLine(actual, 50,16,16,16));
            }
        }
        printTable.printRows(getHeaderForLongTable(),"Keresés eredménye a(z) '" + name + "' elnevezésű tárgyalókra", resultList,100);
    }

    //A kapott szövegben kiemel egy részletet aláhúzással és vastagítással.
    public String getHighLightedPartinText(String originalText, String lowerCasedText, String lowerCasedPart) {
        int startIndex = lowerCasedText.indexOf(lowerCasedPart);
        int endIndex = startIndex + lowerCasedPart.length();
        return originalText.substring(0,startIndex) + UNDERLINED_AND_BOLD_COLORSCHEME + originalText.substring(startIndex,endIndex)
                + NOT_UNDERLINED_AND_BOLD_COLORSCHEME + originalText.substring(endIndex);
    }

    // A metódus a kapott szövegrészletet tartalmazó tárgyalókat betűmérettől függetlenül leválogatja, egy metódushívással kiemeli a szövegben a szótöredéket,
    // és pozicionáltan beleteszi egy új listába.
    // Meghívja a kiíró metódust.

    public void printMeetingRoomContains(String part) {
        List<String> resultList = new ArrayList<>();

        String lowerCasedPart = part.toLowerCase();
        for (MeetingRoom actuelRoom: meetingRooms) {
            String lowerCasedActualName = actuelRoom.getName().toLowerCase();
            if (lowerCasedActualName.contains(lowerCasedPart)) {
                String s = getHighLightedPartinText(actuelRoom.getName(), lowerCasedActualName, lowerCasedPart);
                MeetingRoom newMRoom = new MeetingRoom(s, actuelRoom.getLength(), actuelRoom.getWidth());
                resultList.add(addPositionedMeetingRoomLine(newMRoom,50,16,16,16));
            }
        }
        printTable.printRows(getHeaderForLongTable(),"Keresés eredménye az elnevezésükben a(z) '" + part +
                "' szótöredéket tartalmazó tárgyalókra", resultList, 100);
    }

    // A metódus a kapott méretnél nagyobb területű tárgyalókat leválogatja és pozicionálja egy új listába, majd meghívja a kiíró metódust.
    public void printAreasLargerThan(int area){
        List<String> resultList = new ArrayList<>();
        for (MeetingRoom actual : meetingRooms) {
            if (actual.getArea()>area){
                resultList.add(addPositionedMeetingRoomLine(actual,50,16,16,16));
            }
        }
        printTable.printRows(getHeaderForLongTable(), "A "+area+" m²-nél nagyobb tárgyalók listája", resultList,100);
    }

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    // A metódus lekérdezi, hogy a paraméterként kapott nevű tárgyaló létezik-e már a listában. (új tárgyaló rögzítéséhez info)
    public boolean isExist(String name) {
        for (MeetingRoom actual: meetingRooms) {
            if (actual.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // A metódus visszaadja a legkisebb és legnagyobb alapterületű tárgyalók méretét
    public String getMinAndMax() {
        int max= 0;
        int min = meetingRooms.get(0).getArea();
        for (MeetingRoom actuel: meetingRooms) {
            if (actuel.getArea()>max) {
                max = actuel.getArea();
            }
            if (actuel.getArea()<min) {
                min = actuel.getArea();
            }
        }
        return min+" - "+max;
    }
}
