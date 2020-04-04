/*
Interface
Tablet.java
*/
public interface Tablet {
	public String getModel();
	public int getPrice();
}

/*
Class
GalaxyTab.java
*/
public class GalaxyTab implements Tablet {
	private String model;
	private int price;

	@Override
	public String getModel() {
		return "Samsung";
	}
	@Override
	public int getPrice() {
		return 500;
	}
}

/*
Demo
*/
public class Main {
	public static void main(String[] args) {
		Tablet tab = new GalaxyTab();
		System.out.println(tab.getModel());
	}
}