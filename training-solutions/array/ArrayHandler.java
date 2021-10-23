package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source){

        for (int i=0; i<source.length;i++) {
            source[i] = source[i]+i;
        }
    }

    public void concatenateIndexToWord(String[] source){
        for (int i = 0; i<source.length;i++) {
            source[i] = i+ " - "+ source[i];
        }
    }

    public static void main(String[] args) {

    int [] numbs = {1,2,3,4,5};
    String [] fruits = {"alma", "körte", "szilva", "meggy", "eper", "málna"};

        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.addIndexToNumber(numbs);
        arrayHandler.concatenateIndexToWord(fruits);

        for (int item: numbs) {
            System.out.println(item);
        }

        for (String item: fruits) {
            System.out.println(item);
        }

        for (int item : numbs) {
            System.out.print(item+" ");
        }
        System.out.println();

        for (String item: fruits) {
            System.out.print(item+" ");
        }

    }
}
