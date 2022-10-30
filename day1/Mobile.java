package week1.day1;
//Assignment 2
public class Mobile {
	public void makeCall() {
		String mobileModel = "SAMSUNG A53";
		float mobileWeight = 189.12f;
		System.out.println(mobileModel);
		System.out.println(+mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 33000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}
	public static void main(String[] args) {
	Mobile object = new Mobile();
	object.makeCall();
	object.sendMsg();
	}
}
