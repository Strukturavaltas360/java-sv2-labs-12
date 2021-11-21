package introexceptionwritefile;


import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public void writeFile(List<String> toDoList) {

        try {
            Files.write(Paths.get("ToDo.txt"), toDoList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while writing file", ioe);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();
        String toDo;

        do {
            System.out.print("Please, enter your next ToDo! (Enter 'x' to exit) ");
            toDo = scanner.nextLine();
            if (!toDo.equalsIgnoreCase("x")) {
                toDoList.add(toDo);
            }
        } while (!toDo.equalsIgnoreCase("x"));

       new ToDo().writeFile(toDoList);
    }


}
