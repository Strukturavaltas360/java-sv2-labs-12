package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {

    List<Destination> destinations = new ArrayList<>();

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        Optional<Destination> result = Optional.empty();
        for (Destination des: destinations) {
            if (des.getDescription().contains(keyword)) {
                return Optional.of(des);
            }
        }
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm){
        Optional<Destination> result = Optional.empty();

        for (Destination des: destinations) {
            if (des.getKmFromHome() < maxKm) {
                return Optional.of(des);
            }
        }
        return Optional.empty();
    }
}
