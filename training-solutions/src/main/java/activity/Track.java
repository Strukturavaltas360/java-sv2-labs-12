package activity;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Track {

    List<TrackPoint> trackPoints = new ArrayList<>();

    public void loadFromGpx(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                Coordinate newCoordinate = null;
                String line = scanner.nextLine();
                if (line.strip().startsWith("<trkpt")) {
                    newCoordinate = new Coordinate(Double.parseDouble(line.substring(15, 25)), Double.parseDouble(line.substring(32, 42)));
                }
                if (line.strip().startsWith("<ele")) {
                    double newEle = Double.parseDouble(line.substring(9, 14));
                    TrackPoint newTrackPoint = new TrackPoint(newCoordinate, newEle);
                    trackPoints.add(newTrackPoint);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file");
        }
    }

}
