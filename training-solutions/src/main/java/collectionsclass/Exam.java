package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    List<ExamResult> examResults = new ArrayList<>();

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> ordered = getExamResults();
        Collections.sort(ordered);
        Collections.reverse(ordered);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.min(places, ordered.size()); i++) {
            result.add(ordered.get(i).getName());
        }
        return result;
    }

    public List<ExamResult> getExamResults() {
        return new ArrayList<>(examResults);
    }
}
