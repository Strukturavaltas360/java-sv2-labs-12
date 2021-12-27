package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {

    private List<String> tasks = new ArrayList<>();

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (tasks.size()!=0 && nextStep()) {
        }
    }

    public List<String> getTasks() {
        return List.copyOf(tasks);
    }

    private boolean nextStep() {
            tasks.remove(tasks.size() - 1);
        return tasks.size() != 0 ? true : false;
    }
}
