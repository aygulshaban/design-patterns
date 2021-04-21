package Observer;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Observarable{
	
	private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public Weather() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
