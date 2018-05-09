import java.text.DecimalFormat;

public class Measurement {
	
	private int time;
	private double temperature;
	
	public Measurement(int time, double temperature) {
		this.time = time;
		this.temperature = temperature;
	}
	
	public int getTime() {
		return this.time;
	}
	
	public double getTemperature() {
		return this.temperature;
	}
	
	//returns measurements time and temperature to two decimal places
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return "Time: " + this.getTime() + ", Temperature: " + df.format(this.getTemperature()) + "\n";
	}
}
