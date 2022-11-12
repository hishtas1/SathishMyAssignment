package week3.day1.inheritances;

public class BMW extends Car{
	public void applyABS() {
		System.out.println("Apply ABS");
	}

	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.applyBrake();
		obj.applyHorn();
		obj.applyABS();

	}

}
