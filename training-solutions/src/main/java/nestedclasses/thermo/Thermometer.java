package nestedclasses.thermo;

public class Thermometer {

    private String roomName;
    private int temperature;

    private ThermometerObserver observer;

    public Thermometer(String name, int temperature) {
        this.roomName = name;
        this.temperature = temperature;
    }


    public void onTemperatureChanged() {
        if (observer != null)
            observer.handleTemperatureChange(temperature, roomName);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChanged();
    }

    public String getName() {
        return roomName;
    }

    public double getTemperature() {
        return temperature;
    }

    public ThermometerObserver getThermometer() {
        return observer;
    }
}
