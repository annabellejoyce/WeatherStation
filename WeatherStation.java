import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.function.*;

public class WeatherStation {

	private String city;
	private ArrayList<Measurement> measurements;

	//constructor 
	public WeatherStation(String city) {
		this.city = city;
		this.measurements = new ArrayList<Measurement>();
	}
	
	public String getCity() {
		return this.city;
	}

	//method to add new measurements to list
	public void addMeasurement(int time, double temperature) {
		this.measurements.add(new Measurement(time, temperature));
	}
	
	//return the list
	public ArrayList<Measurement> getMeasurements() {	
		return this.measurements;
	}

	// return optional double object which may/may not contain a double value
	public OptionalDouble averageTemperature(int startTime, int endTime) {
		
		//checks the measurements that are between the given times
		Predicate<Measurement> measurementTimes = m -> m.getTime() > startTime && m.getTime() < endTime;
		
		OptionalDouble averageTemperature = getMeasurements().stream()
			.filter(measurementTimes)
			.mapToDouble(m -> m.getTemperature())
			.average();
		return averageTemperature;
	}
}
