package operators;

public class HeadingNorth {


    public int getNumberOfNewDirections(){
        int degrees = 0;
        int numberOfNewDirections = 0;
        for (int i=1; degrees<360; i++) {
            degrees += i*10;
            numberOfNewDirections =i;
        }
        return numberOfNewDirections;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();

        System.out.println(headingNorth.getNumberOfNewDirections());
        }
}
