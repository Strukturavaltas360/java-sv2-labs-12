package activity;

public class ActivityWithTrack implements Activity {

    private Track track;

    private ActivityType activityType;

    public ActivityWithTrack(Track track, ActivityType activityType) {
        this.track = track;
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        double distance = 0;
        for (int i = 0; i < track.trackPoints.size()-1; i++) {
            distance += track.trackPoints.get(i+1).getDistanceFrom(track.trackPoints.get(i));
        }
        return distance;
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }
}
