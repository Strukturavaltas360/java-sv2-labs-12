package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sbResult = new StringBuilder();
        for (String s : billItems) {
            sbResult.append(splitToString(s));
        }
        System.out.println(sbResult.toString());
        return sbResult.toString();
    }

    public String splitToString(String s) {
        String[] temp = s.split(";");
        return temp[0] + "; darabszám: " + temp[2] + ", egységár: " + temp[1] +", összesen: " + multiplied(temp[2], temp[1]) + " Ft\n";
    }

    private int multiplied(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        return intA * intB;
    }
}