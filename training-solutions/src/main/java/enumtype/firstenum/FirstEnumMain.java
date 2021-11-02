package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

//        for (Continent continent: Continent.values()) {
//            System.out.println(continent);
//        }

        System.out.println(Continent.AFRICA);
        System.out.println(Continent.AMERICA);
        System.out.println(Continent.ASIA);
        System.out.println(Continent.AUSTRALIA);
        System.out.println(Continent.EUROPE);

        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("PACIFIC"));

        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.DEFENDER.name());
        System.out.println(Football.MIDFIELDER.name());
        System.out.println(Football.STRIKER.name());



    }
}
