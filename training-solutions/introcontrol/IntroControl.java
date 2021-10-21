package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number >= 10) {
            number -= 10;
            return number;
        } else {
            return number;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
              return "zero";
           }  else {
              return "not zero";
           }
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
                return "Hello Joe";
        }
                    else {
                        return "";
        }

        }
    public int calculateBonus(int sale) {
        if (sale>=1000000) {
            return sale/10;
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (next >= prev) {
            return next-prev;
        } else {
            return (10000-prev)+next;
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(i<max ? i+", " : i+".\r\n");
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i= min; i<=max; i++) {
            System.out.print(i<max ? i+", " : i+".\r\n");
        }
    }


}
