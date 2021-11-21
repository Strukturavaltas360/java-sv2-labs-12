package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {


    public static void main(String[] args) {
        List<String> routeToKaposvar = Arrays.asList("Szentlőrinc","Kacsóta","Nagypeterd","Botykapeterd","Szigetvár","Szentlászló","Boldogasszonyfa","Bőszénfa");

        try {
            Files.write(Paths.get("roadmap.txt"),routeToKaposvar);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
