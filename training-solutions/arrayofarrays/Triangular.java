package arrayofarrays;

public class Triangular {

    public int[][] triangularMatrix(int size) {

        int [][] a = new int[size][];

            for (int i=0; i<size; i++) {
                a[i]= new int[i+1];
                for (int j=0 ;j<=i ;j++) {
                    a[i][j]=i;
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
                
            }
            return a;
        }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        triangular.triangularMatrix(9);
    }

}
