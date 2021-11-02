package introconstructor;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static void main(String[] args) {
        Task taskNow = new Task("Bevásárlás","Aldiból eztmegazt, Sparból valami mást is");
        taskNow.setDuration(49);
        taskNow.start();
        System.out.println(taskNow.getStartDateTime()+"  |  "+taskNow.getTitle()+"  |  "+taskNow.getDescription()+"  |  Tervezett időtartam: "+taskNow.getDuration()+" perc");
    }

    public void start() {
        startDateTime = LocalDateTime.now();
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }
}
