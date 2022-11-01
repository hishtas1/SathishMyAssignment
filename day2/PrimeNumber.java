package week1.day2.assignment;
//Assignment 1
public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;
		boolean flag=false;
		int half=n/2;
		if (n==0||n==1) {
			flag=true;
		} else {
			for (int i = 2; i <= half; i++) {
				if (n%i==0) {
					flag=true;
					break;
					
				}
			}
		}
		if (flag==true) {
			System.out.println(n+" is not a PRIME NUMBER");
		} else {
			System.out.println(n+" is a PRIME NUMBER");
		}
	}
}

