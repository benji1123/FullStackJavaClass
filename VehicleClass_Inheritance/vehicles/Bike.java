package vehicles;
import parent.Vehicle;

public class Bike extends Vehicle{
	private String handle = "default";

	public Bike() {
		super();
	}

	// params include those of Vehicle superclass
	public Bike(String handle, int wheels, int seats, int fuelTank, int engine, String lights) {
		super(wheels, seats, fuelTank, engine, lights); // pass data to superclass
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	@Override // override default toString(), which print OBJ's address
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getEngine()=" + getEngine() + ", getLights()=" + getLights()
				+ "]";
	}
	
	// priority of child.run() > parent.run()
	public void run() {
		System.out.println("running bike");
	}
}