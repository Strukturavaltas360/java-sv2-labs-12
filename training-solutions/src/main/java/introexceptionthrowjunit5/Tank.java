package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public Tank(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }
    public void modifyAngle(int angleNumber) {
        this.angle += angleNumber;
        if (angle<-80 ||angle >80) {
            throw new IllegalArgumentException("Canon angle is out of range [-80 - +80]");
        }
    }
}
