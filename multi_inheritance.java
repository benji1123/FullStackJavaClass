/*
Interface
Tablet.java
*/
public interface Tablet {
	default void getModel() {
		System.out.println("Samsung");
	}
}

/*
Interface
PaperWeight.java
*/
public interface PaperWeight {
	default void getModel() {
		System.out.println("Pebble");
	}
}

/*
Class
GalaxyTab.java
*/
public class GalaxyTab implements Tablet, PaperWeight {
	public void getModel() {
		Tablet.super.getModel();
		PaperWeight.super.getModel();
	}
}

/*
Demo
			Output: 
			Samsung
			Pebble 
*/
public class Main {
	public static void main(String[] args) {
		Tablet tab = new GalaxyTab();
		tab.getModel();
	}
}