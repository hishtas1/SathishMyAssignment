package week3.day1.inheritances;

public class Bajaj extends Auto{
	public void applyKickStart() {
		System.out.println("Apply Kick Start");
	}
public static void main(String[] args) {
	Bajaj obj=new Bajaj();
	obj.applyBrake();
	obj.applyHorn();
	obj.applyKickStart();
}
}
