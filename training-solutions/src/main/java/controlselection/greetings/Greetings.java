package controlselection.greetings;

public class Greetings {

    public String sayHiaSTimeOfDay (int hour, int minute) {
        int sumMinutes = hour*60+minute;
        if (sumMinutes >= 300 &&sumMinutes<540) {
            return "Jó reggelt!";
        }
        if (sumMinutes >=540  &&sumMinutes<1110) {
            return "Jó napot!";
        }
        if (sumMinutes >=1110 && sumMinutes<1200) {
            return "Jó estét!";
        } else {
            return "Jó éjt!";
        }
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.sayHiaSTimeOfDay(9,0));
    }

}
