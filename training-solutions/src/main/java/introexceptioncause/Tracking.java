package introexceptioncause;

import java.io.IOException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class Tracking {

    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();

        List<String> TrackPointLines = trackPoints.readFile();

        List<String> trackPointHeights =trackPoints.getHeightDatasFromList(TrackPointLines);

        List<Integer> heights = null;
        try {
            heights = trackPoints.getIntegerFromString(trackPointHeights);
        }
        catch (IllegalArgumentException iae) {
            System.out.println("Not a number");
        }

        List<Integer> heightDifferences = trackPoints.getDifferences(heights);
        trackPoints.printHeightDatas(heightDifferences);

    }
}
