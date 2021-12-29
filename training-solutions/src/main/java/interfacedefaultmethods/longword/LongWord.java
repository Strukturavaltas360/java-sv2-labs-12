package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> lines = readFromFile(path);
        StringBuilder resultSB = new StringBuilder(lines.get(lines.size() - 1));
        for (int i = lines.size() - 2; i >= 0; i--) {
            resultSB.insert(0, lines.get(i).charAt(0));
        }
        return resultSB.toString();
    }
}
