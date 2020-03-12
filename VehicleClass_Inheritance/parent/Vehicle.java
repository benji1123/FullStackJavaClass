package parent;

public class Vehicle{
	private int wheels;
	private int seats;
	private int fuelTank;
	private int engine;
	private String lights;	// private variables are not inherited by subclasses
	
	public Vehicle() {
		this.wheels = 0;
		this.seats = 0;
		this.fuelTank = 0;
		this.engine = 0;
		this.lights = "None";
	}
	
	public Vehicle(int wheels, int seats, int fuelTank, int engine, String lights) {
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.engine = engine;
		this.lights = lights;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public String getLights() {
		return lights;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}	
	
	public void run() {
		System.out.println("running vehicle");
	}
}