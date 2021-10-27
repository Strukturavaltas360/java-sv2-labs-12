package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colorsOfCapsule = new ArrayList<>();

    public void addLast(String color){
        colorsOfCapsule.add(color);
    }

    public void addFirst(String color){
        colorsOfCapsule.add(0,color);
    }

    public void removeLast(){
        colorsOfCapsule.remove(colorsOfCapsule.size()-1);
    }

    public void removeFirst(){
        colorsOfCapsule.remove(0);
    }

    public List<String> getColors() {
        return colorsOfCapsule;
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        capsules.addFirst("kék");
        capsules.addFirst("piros");
        capsules.addLast("zöld");
        capsules.addLast("sárga");
        capsules.addFirst("lila");

        System.out.println(capsules.getColors());

        capsules.removeLast();
        capsules.removeFirst();
        System.out.println(capsules.getColors());

    }

}
