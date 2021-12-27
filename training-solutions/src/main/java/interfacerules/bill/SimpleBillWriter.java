package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sbResult = new StringBuilder();
        for (String s : billItems) {
            sbResult.append(splitToString(s));
        }
        return sbResult.toString();
    }

    public String splitToString(String s) {
        String[] temp = s.split(";");
        return temp[0] + ", " + temp[2] + " * " + temp[1] +" = "+ multiplied(temp[2], temp[1]) + " Ft\n";
    }

    private int multiplied(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        return intA * intB;
    }
}
