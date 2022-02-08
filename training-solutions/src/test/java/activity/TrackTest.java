package activity;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {

    @Test
    void testFileReader() {
        Path path = Path.of("src/test/Resources/track.gpx");
        Track track = new Track();
        track.loadFromGpx(path);
    }

}