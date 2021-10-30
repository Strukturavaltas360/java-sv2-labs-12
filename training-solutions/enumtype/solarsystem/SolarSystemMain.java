package enumtype.solarsystem;

public class SolarSystemMain {

    public static void main(String[] args) {

        for (SolarSystem solarSystem: SolarSystem.values())
            System.out.println(solarSystem +"\t\t" + solarSystem.getMoons());

    }

}
