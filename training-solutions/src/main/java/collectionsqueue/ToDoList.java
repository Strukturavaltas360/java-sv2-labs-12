package collectionsqueue;

import java.sql.Array;
import java.util.*;

public class ToDoList {
    private List<ToDo> todos = new ArrayList<>();

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo t : todos) {
            if (t.isUrgent()) {
                result.addFirst(t);
            } else {
                result.addLast(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<ToDo> lista = Arrays.asList(new ToDo("valami", true),
                new ToDo("valami1", true),
                new ToDo("valami2", false),
                new ToDo("valami3", false),
                new ToDo("valami4", true),
                new ToDo("valami5", false),
                new ToDo("valami6", true),
                new ToDo("valami7", false));

        ToDoList toDoList = new ToDoList(lista);
        Deque<ToDo>  todos = toDoList.getTodosInUrgencyOrder();
        System.out.println(todos);
        System.out.println(todos.pop());

    }
}
