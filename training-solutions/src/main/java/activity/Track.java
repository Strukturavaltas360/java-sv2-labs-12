package activity;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Track {

    List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        Coordinate maxLat =
                trackPoints.stream()
                        .map(trackPoint -> trackPoint.getCoordinate())
                        .sorted(Comparator.comparing(Coordinate::getLatitude).reversed())
                        .findFirst()
                        .orElseThrow(()-> new IllegalArgumentException("empty list"));

        Coordinate maxLong =
                trackPoints.stream()
                        .map(trackPoint -> trackPoint.getCoordinate())
                        .sorted(Comparator.comparing(Coordinate::getLongitude).reversed())
                        .findFirst()
                        .orElseThrow(()-> new IllegalArgumentException("empty list"));

        return new Coordinate(maxLat.getLatitude(),maxLong.getLongitude());
    }

    public Coordinate findMinimumCoordinate() {
        Coordinate minLat =
        trackPoints.stream()
                .map(trackPoint -> trackPoint.getCoordinate())
                .sorted(Comparator.comparing(Coordinate::getLatitude))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("empty list"));

        Coordinate minLong =
        trackPoints.stream()
                .map(trackPoint -> trackPoint.getCoordinate())
                .sorted(Comparator.comparing(Coordinate::getLongitude))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("empty list"));

        return new Coordinate(minLat.getLatitude(),minLong.getLongitude());
    }

    public double getDistance() {
        double distance = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            distance += trackPoints.get(i + 1).getDistanceFrom(trackPoints.get(i));
        }
        return distance;
    }

    public double getFullDecrease() {
        List<Double> elevations = trackPoints.stream()
                .map(TrackPoint::getElevation)
                .collect(Collectors.toList());

        double fullDecrease = 0.0;
        for (int i = 0; i < elevations.size() - 1; i++) {
            if (elevations.get(i + 1) < elevations.get(i)) {
                fullDecrease += elevations.get(i) - elevations.get(i + 1);
            }
        }
        return fullDecrease;
    }

    public double getFullElevation() {
        List<Double> elevations = trackPoints.stream()
                .map(TrackPoint::getElevation)
                .collect(Collectors.toList());

        double fullElevation = 0.0;
        for (int i = 0; i < elevations.size() - 1; i++) {
            if (elevations.get(i + 1) > elevations.get(i)) {
                fullElevation += elevations.get(i + 1) - elevations.get(i);
            }
        }
        return fullElevation;
    }

    public double getRectangleArea() {
        Coordinate min = findMinimumCoordinate();
        Coordinate max = findMaximumCoordinate();

        return (max.getLatitude()-min.getLatitude())*(max.getLongitude()- min.getLongitude());
    }

    public void loadFromGpx(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            Coordinate newCoordinate = null;
            while (scanner.hasNextLine()) {
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

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }
}
