package arrayofarrays;

public class DailyValues {

    public int[][] getValues() {
        int[][] daysOfYear = new int[12][];
        int[] lengthMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i=0; i<12;i++) {
            daysOfYear[i]= new int[lengthMonths[i]];
        }
        return daysOfYear;
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();

        int[][] arrayToPrint = dailyValues.getValues();

        for (int[] row: arrayToPrint) {
            for (int col: row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

}
