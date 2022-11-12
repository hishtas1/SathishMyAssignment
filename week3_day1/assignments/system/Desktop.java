package week3.day1.assignments.system;

public class Desktop extends Computer {
	public void desktopSize(){
		System.out.println("Desktop Size: 16 Inches");
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
