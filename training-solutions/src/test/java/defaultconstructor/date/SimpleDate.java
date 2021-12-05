package defaultconstructor.date;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Error in date parameters! " + year+ ", "+month+", "+day);
        }
    }

    private boolean isCorrect(int year, int month, int day) {
        return year >= 1900 && month > 0 && month <= 12 && day > 0 && day <= calculateMonthLength(year, month);
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private int calculateMonthLength(int year, int month) {
        switch (month) {
//            case 1,3,5,7,8,10,12: {
//                return 31;
//            }
            case 4,6,9,11: {
                return 30;
            }
            case 2: {
                if (!isLeapYear(year)) {
                    return 28;
                } else {
                    return 29;
                }
            }
        }
        return 31;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
