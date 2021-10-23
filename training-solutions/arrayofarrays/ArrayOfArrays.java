package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int [] row: a) {
            for (int col: row) {
                System.out.print(col+" ");
            }
                System.out.println();
        }
    }

    public static void main(String[] args) {

        int [][] a = new int[4][3];

        for (int i=0; i< a.length;i++) {
            for (int j=0; j<a[i].length;j++)
            a[i][j] = j;
        }
        ArrayOfArrays aOA = new ArrayOfArrays();
        aOA.printArrayOfArrays(a);

    }
}


