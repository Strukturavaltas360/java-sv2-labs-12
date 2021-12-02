package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testLengthOfList() {

        PublicVehicle bus = new Bus(7,20,"Mercedes");
        PublicVehicle tram = new Tram(8,45,5);
        PublicVehicle metro = new Metro(3,82,5);

        PublicTransport publicTransport = new PublicTransport();

        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3,publicTransport.publicVehicles.size());
    }

}