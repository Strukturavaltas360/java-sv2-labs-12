package collectionsiterator;

import java.time.LocalDateTime;
import java.util.*;

public class HomeSchooling {

    List<OnlineLesson> lessons = new LinkedList<>();

    public List<OnlineLesson> getLessons() {
        return new ArrayList<>(lessons);
    }

    public void addNewLesson(OnlineLesson lesson) {
        int position = lessons.size();
        int index = 0;
        while (index < lessons.size() - 1) {
            if (lessons.get(index).getStartTime().isBefore(lesson.getStartTime()) && lessons.get(index + 1).getStartTime().isAfter(lesson.getStartTime())) {
                position = index + 1;
            }
            index++;
        }
        lessons.add(position, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson actual = iterator.next();
            if (title.equals(actual.getLessonTitle())) {
                result.add(actual);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson result = iterator.next();
            if (result.getStartTime().isEqual(startTime)) {
                iterator.remove();
            }
        }
    }

}
