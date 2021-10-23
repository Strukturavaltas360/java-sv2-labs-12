package arrayofarrays;

public class Triangular {

    public int[][] triangularMatrix(int size) {

        int [][] triangular = new int[size][];

            for (int i=0; i<size; i++) {
                triangular[i]= new int[i+1];
                for (int j=0 ;j<=i ;j++) {
                    triangular[i][j]=i;
                    System.out.print(triangular[i][j]+" ");
                }
                System.out.println();
            }
            return triangular;
        }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        triangular.triangularMatrix(9);
    }

}
