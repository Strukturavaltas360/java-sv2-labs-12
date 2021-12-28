package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public final static long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

    public void flyTo(Point position) {
        this.position = position;
        path.add(position);
    }

    public void liftTo(long altitude){
        Point target = new Point(position.getX(), position.getY(), altitude);
        path.add(target);
        this.position = target;
    }

    public void moveTo(Point position) {
        walkTo(position);
    }

    public void fastMoveTo(Point position) {
        Point flyingPosition= new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(ALTITUDE);
        flyTo(flyingPosition);
        liftTo(0);
    }


    public void rotate(int angle) {
        this.angle = angle;

    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    @Override
    public List<Point> getPath() {
        return new ArrayList<>(path);
    }



}
