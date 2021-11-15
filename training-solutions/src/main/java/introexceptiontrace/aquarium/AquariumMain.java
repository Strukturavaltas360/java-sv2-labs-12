package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish1 = new Fish("Vöröstorkú sügér","red");
        Fish fish2 = new Fish("Vitorláshal","white");
        Fish fish3 = new Fish("Ramirezi","brown");
        Fish fish4 = new Fish("Papagáj sügér","golden");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        aquarium.addFish(fish4);

        System.out.println(aquarium.getNumberOfFish());

    }
}
// Az Aquarium osztály 15. sorában, mert null értékű az osztály típusú változónk (List<Fish> ornamentalFish)