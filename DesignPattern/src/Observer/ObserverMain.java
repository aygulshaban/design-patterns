package Observer;

import java.util.Random;

public class ObserverMain {

	public static void main(String[] args) {
		
		final Weather weather = new Weather();

	    final DisplayForecast displayForecast = new DisplayForecast();
	    weather.registerObserver(displayForecast);
	    final DisplayStatistics displayStatistics = new DisplayStatistics();
	    weather.registerObserver(displayStatistics);

	    final Random random = new Random();
	    for (int i = 0; i < 5; i++) {
	        weather.setMeasurements(random.nextFloat(), random.nextFloat(), random.nextFloat());
	        System.out.println("***************************************");
	    }
		
	}

}
