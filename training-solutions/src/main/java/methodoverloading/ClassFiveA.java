package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    List<String> students = Arrays.asList("Ádám Lajos", "Ágoston Elek", "Kovách Sándor", "Alexander Béla",
            "Antoni Ferenc", "Arányi Lajos", "Árkövy József", "Arnold Csaba", "Babics Antal", "Bakay Lajos",
            "Bakody Tivadar József", "Balassa János", "Balázs Dezső", "Bálint Péter");


    public String getTodayReferringStudent(int number){
        return students.get(number-1);
    }

    public String getTodayReferringStudent(Number number) {
        return students.get(number.getValue()-1);
    }

    public String getTodayReferringStudent(String numberName){
        return students.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }

}