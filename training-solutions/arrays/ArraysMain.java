package arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int [] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int [][] multiplicationTable = new int [size][size];
            for (int i=0; i<size;i++) {
                for (int j=0;j<size;j++) {
                    multiplicationTable[i][j]=(i+1)*(j+1);
                }
            }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day,anotherDay);
    }

    public int min (int a, int b) {
        return (a < b ? a : b);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {

        int min = min(day.length, anotherDay.length);
        return Arrays.equals(Arrays.copyOfRange(day,0,min), Arrays.copyOfRange(anotherDay,0,min));
    }

    public boolean wonLottery(int[] winnerNumbers, int[] playedNumbers) {

        int [] copyOfWinnerNumbers = Arrays.copyOf(winnerNumbers, winnerNumbers.length);
        int [] copyOfPlayedNumbers = Arrays.copyOf(playedNumbers, playedNumbers.length);

        Arrays.sort(copyOfWinnerNumbers);
        Arrays.sort(copyOfPlayedNumbers);

        return Arrays.equals(copyOfWinnerNumbers, copyOfPlayedNumbers);
    }

    public static void main(String[] args) {
        ArraysMain arrayOfDays = new ArraysMain();
        System.out.println(arrayOfDays.numberOfDaysAsString());

        ArraysMain mTable = new ArraysMain();
        System.out.println(mTable.multiplicationTableAsString(7));

        ArraysMain temperatureV = new ArraysMain();
        boolean b;
        b = temperatureV.sameTempValues(new double[] {11.5, 10.3, 13.2, 12.1}, new double[] {11.5, 10.3, 13.2, 12.1});
        System.out.println(b);

        ArraysMain temperatureVDL = new ArraysMain();
        b = temperatureVDL.sameTempValuesDaylight(new double[] {10.3, 13.2, 12.1, 10.2, 10.9}, new double[] {10.3, 13.2, 12.1, 10.2});
        System.out.println(b);

        System.out.println();
        ArraysMain lotto = new ArraysMain();
        int [] wNumbers = {1,2,3,5,4};
        int [] pNumbers = {5,4,3,2,11};
        System.out.println(lotto.wonLottery(wNumbers, pNumbers));

        System.out.println(Arrays.equals(wNumbers,new int[] {1,2,3,5,4} ));
        System.out.println(Arrays.equals(pNumbers,new int[] {5,4,3,2,11} ));

    }
}
