package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        for (Activity actual: activities) {
            if (actual.getType() != ActivityType.BASKETBALL) {
                Report newReport = new Report(actual.getType(),actual.getDistance());
                result.add(newReport);
            }
        }
        return result;
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity.getType() != ActivityType.BASKETBALL)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity.getType() == ActivityType.BASKETBALL)
                .count();
    }


}
