package activity;

public class ActivityWithTrack implements Activity {

    private ActivityType activityType;

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }
}
