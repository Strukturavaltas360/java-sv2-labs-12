package enumtype.position;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class PositionMain {

    public static void main(String[] args) {



        Position [] positions = Position.values();
        System.out.println(Arrays.toString(positions));
        System.out.println(Arrays.toString(Position.values()));
        System.out.println(Position.values()[2]);
        System.out.println(Position.JUNIOR_IT_ARCHITECT.getSalary());

        System.out.println(Position.valueOf("JUNIOR_IT_ARCHITECT").getBenefit());

        Position pos = Position.BUSINESS_ANALYST;
        String proba = pos.name();

        int indexOfPos = pos.ordinal();

        System.out.println(proba + " indexe: " + indexOfPos);


        System.out.println(Position.values().length);



        for (Position pos2: Position.values()) {
            System.out.println(pos+"    \t\t "+pos.getSalary()+"\t\t"+pos.getBenefit());
        }
    }

}
