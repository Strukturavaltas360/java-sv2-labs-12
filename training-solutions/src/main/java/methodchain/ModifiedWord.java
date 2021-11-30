package methodchain;

public class ModifiedWord {

    public String modify(String word) {
        String s = word.substring(2,3);
        return word.toUpperCase().substring(0,1).concat("x").concat((s.toUpperCase()).concat("y"));
    }

}
