package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();
    PrintTable printTable = new PrintTable();
    private final String UNDERLINED_AND_BOLD_COLORSCHEME = "\u001B[4;1m";
    private final String NOT_UNDERLINED_AND_BOLD_COLORSCHEME = "\u001B[24;22m";


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

    public String getHeaderForLongTable() { // A metódus fejlécet állít össze a részletes kiírásokhoz
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

    public void printMeetingRoomsWithName(String name){ //  A paraméterként kapott nevű tárgyalókat listába rakja és meghívja a kiíró metódust.
        List<String> resultList = new ArrayList<>();
        for (MeetingRoom actual: meetingRooms) {
            if (actual.getName().equals(name)) {
                resultList.add(addPositionedMeetingRoomLine(actual, 50,16,16,16));
            }
        }
        printTable.printRows(getHeaderForLongTable(),"Keresés eredménye a(z) '" + name + "' elnevezésű tárgyalókra", resultList,100);
    }

    public String getHighLightedPartinText(String originalText, String lowerCasedText, String lowerCasedPart) { //A kapott szövegben kiemel egy részletet aláhúzással és vastagítással.
        int startIndex = lowerCasedText.indexOf(lowerCasedPart);
        int endIndex = startIndex + lowerCasedPart.length();
        return originalText.substring(0,startIndex) + UNDERLINED_AND_BOLD_COLORSCHEME + originalText.substring(startIndex,endIndex)
                + NOT_UNDERLINED_AND_BOLD_COLORSCHEME + originalText.substring(endIndex);
    }

    // A metódus a kapott szövegrészletet tartalmazó tárgyalókat betűmérettől függetlenül leválogatja és pozicionáltan beleteszi egy új listába.
    // Meghívja azt a metódust, amelyik kiemeli a szövegben a szótöredéket.
    // Meghívja a kiíró metódust.

    public void printMeetingRoomContains(String part) {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i<meetingRooms.size() ; i++) {
            String tempPart = part.toLowerCase();
            String tempGetName = meetingRooms.get(i).getName().toLowerCase();

            if (tempGetName.contains(tempPart)) {
                String s = getHighLightedPartinText(meetingRooms.get(i).getName(), tempGetName, tempPart);

                MeetingRoom newMRoom = new MeetingRoom(s, meetingRooms.get(i).getLength(), meetingRooms.get(i).getWidth());
                resultList.add(addPositionedMeetingRoomLine(newMRoom,50,16,16,16));
            }
        }
        printTable.printRows(getHeaderForLongTable(),"Keresés eredménye az elnevezésükben a(z) '" + part +
                "' szótöredéket tartalmazó tárgyalókra", resultList, 100);

    }
    public void printAreasLargerThan(int area){ // A metódus a kapott méretnél nagyobb területű tárgyalókat leválogatja és pozicionálja egy új listába, majd meghívja a kiíró metódust.
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

    public boolean isExist(String name) { // A metódus lekérdezi, hogy a paraméterként kapott nevű tárgyaló létezik-e már a listában. (új tárgyaló rögzítéséhez info)
        for (MeetingRoom actual: meetingRooms) {
            if (actual.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String getMinAndMax() { // A metódus visszaadja a legkisebb és legnagyobb alapterületű tárgyalók méretét
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
