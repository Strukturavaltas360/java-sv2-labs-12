package controlselection.month;

import java.util.Locale;

public class DayInMonth {

    public int DaysofMonths(int year, String month){

        switch (month.toLowerCase()) {
            case "január" :
            case "március" :
            case "május" :
            case "július" :
            case "augusztus" :
            case "október" :
            case "december" :
            {return 31;}

            case "április" :
            case "június" :
            case "szeptember" :
            case "november" :
            {return 30;}

            case "február" : {
                if (year>1582 && (year%4 ==0 && year%100 !=0 || year%400==0)) {
                    return 29;
                } else {
                    return 28;
                }
            }
        }
        return 0;
    }
}
