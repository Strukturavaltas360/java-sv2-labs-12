package operators;

public class Operators {

    public boolean isEven(int n) {
        return (n%2 ==0) ? true : false;
    }

    public String getResultOfDivision(int number, int divisor){
        return number + " / " + divisor+" = " + number/divisor+ ", maradék: "+number%divisor; //“16 / 3 = 5, maradék: 1”
    }

    public String isNull(String s) {
        return s == null ? "null értékű" : "nem null értékű";
    }

    public boolean isEmpty(String s){
        if (s==null || "".equals(s)) {
            return true;
        }
        return false;
    }

}
