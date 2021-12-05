package defaultconstructor.date;

public class SimpleDateFormatter {

    CountryCode cd;

    public SimpleDateFormatter() {
        cd = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(cd, simpleDate);
    }


    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        switch (countryCode) {
            case HU: {
                return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
            }
            case US: {
                return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
            }
        }
        return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
    }
}
