package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank(0);

    @Test
    void testModifyAngle() {

        tank.modifyAngle(60);
        assertEquals(60,tank.getAngle());
    }

    @Test
    void testModifyAngleOutOfRange(){
        tank.modifyAngle(40);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(60));
        assertEquals("Canon angle is out of range [-80 - +80]", exception.getMessage());

    }
}