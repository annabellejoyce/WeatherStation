import java.util.Random;

public class WeatherStationTester {
	
	public static void main(String[] args) {
		
		// create new WeatherStation instance
		WeatherStation galway = new WeatherStation("Galway");
		
		// random to generate some temperatures to add to measurements list
		Random rand = new Random();
		
		// 0 - 23 times, get a random temperature up to 10
		for(int i = 0; i < 24; i++) {
			galway.addMeasurement(i, rand.nextDouble() * 10);
		}
		
		//print all measurements
		for(Measurement m : galway.getMeasurements()) {
			System.out.print(m.toString());
		}
		
		// get double from the averageTemperature method
		double sampleAverage = galway.averageTemperature(2, 10).getAsDouble();
		
		System.out.print("Average Temperature at " + galway.getCity() + " between 2 and 10 is: " + sampleAverage);
		
	}


}
