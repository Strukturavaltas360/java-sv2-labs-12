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
        for (ActivityType actual : ActivityType.values()) {
            double sum = 0;
            for (Activity activity : activities) {
                if (activity.getType() == actual) {
                    sum += activity.getDistance();
                }
            }
            result.add(new Report(actual, sum));
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
