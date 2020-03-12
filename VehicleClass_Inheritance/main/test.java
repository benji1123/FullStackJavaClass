package main;
import vehicles.Bike;

public class test{
	
	public static void main(String[] args) {
		Bike gt = new Bike();
		gt.setHandle("red");
		System.out.println(gt);
		gt.run();
	}
}