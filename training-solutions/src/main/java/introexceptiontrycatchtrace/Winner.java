package introexceptiontrycatchtrace;

import java.util.*;

public class Winner {

    List<String> names = new ArrayList(Arrays.asList("Péter", "Sára",null,"Johanna","László","Soma","Szonja"));

    public String getWinner(){
        Random random = new Random();
        int i = random.nextInt(names.size());

        return names.get(i).toUpperCase();
    }


}
