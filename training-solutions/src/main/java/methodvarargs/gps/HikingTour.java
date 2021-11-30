package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    List<FieldPoint> fieldPointList = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {

        if (timeOfLogging != null) {
            for (FieldPoint actual : fieldPointsToLog) {
                actual.setTimeOfLogging(timeOfLogging);
                fieldPointList.add(actual);
            }
        } else {
            throw new IllegalArgumentException("Time of logging must not be null!");
        }
    }

    public List<FieldPoint> getFieldPointList() {
        return fieldPointList;
    }
}
