package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();


    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok:\n\n");
        for (Flight fl : flights) {
            if (fl.status == Status.DELETED)
                sb.append(fl.flightNumber+"  \t"+fl.getStatus()+"\n");
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        Flight flightToBerlin = new Flight("B 22323", Status.ACTIVE);
        Flight flightToFlorida = new Flight("FL 1013", Status.ACTIVE);
        Flight flightToPukhet = new Flight("TH 191", Status.DELETED);
        Flight flightToBTokyo = new Flight("TYO 6523", Status.ACTIVE);
        Flight flightToDubai = new Flight("DB 323", Status.DELETED);
        Flight flightToMoskva = new Flight("MSKW 191", Status.DELETED);
        Flight flightToLondon = new Flight("LO 6523", Status.ACTIVE);
        Flight flightToParis = new Flight("PAR 323", Status.DELETED);

        airport.addFlight(flightToBerlin);
        airport.addFlight(flightToDubai);
        airport.addFlight(flightToFlorida);
        airport.addFlight(flightToBTokyo);
        airport.addFlight(flightToPukhet);
        airport.addFlight(flightToMoskva);
        airport.addFlight(flightToLondon);
        airport.addFlight(flightToParis);

        System.out.println(airport.getDeletedFlights());
    }
}