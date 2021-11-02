package array;

public class ArrayMain {

    public static void main(String[] args) {
        String [] days = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println("A hét második napja (hu): " + days[1] +" "+ days.length);

        int [] arrayOfPowers = new int[5];
            arrayOfPowers[0] =1;
            for (int i=1; i<arrayOfPowers.length; i++) {
                arrayOfPowers[i] = arrayOfPowers[i-1]*2;
            }
            for (int item : arrayOfPowers) {
                System.out.print(item+ " ");
            }

            System.out.println();

            boolean [] arrayOfBoolean = new boolean[6];
            arrayOfBoolean[0] = false;

            for (int i = 1; i<arrayOfBoolean.length; i++) {
                arrayOfBoolean[i]=!(arrayOfBoolean[i-1]);
            }

            for (boolean item: arrayOfBoolean) {
                System.out.print(item+" ");
            }

    }
}
