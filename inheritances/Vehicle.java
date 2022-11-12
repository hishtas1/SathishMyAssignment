package week3.day1.inheritances;

public class Vehicle {
	public void applyHorn() {
		System.out.println("Apply Horn");
	}
	public void applyBrake() {
		System.out.println("Apply Break");
	}

	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		obj.applyBrake();
		obj.applyHorn();

	}

}
