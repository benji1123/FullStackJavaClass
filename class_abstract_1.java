/*
Abstract Class
*/
public abstract class Watch {
	public void turnOn() {
		System.out.println("ON");
	}
	public abstract void getTime();		
}

/*
Class
*/
public class Pebble extends Watch {
	@Override
	public void getTime() {
		System.out.println("9:00PM");		
	}
}


/*
Demo
*/
public class Main {
	public static void main(String[] args) {
		Pebble p = new Pebble();
		p.getTime();
		p.turnOn();
	}
}
/*  Output: 
 *  9:00PM
 *  ON 
 */
