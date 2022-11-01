package week1.day2.assignment;
//Assignment 2
public class Palindrome {
	public static void main(String[] args) {
		int a,temp,rn=0,num=34343;
		temp=num;
		for(int i=1; num>0;i++) {
			a=num%10;
			rn=(rn*10)+a;
			num=num/10;
		}
		if (temp==rn) {
			System.out.println(temp+ " is a PALINDROME");
		} else {
			System.out.println(temp+ " is not a PALINDROME");
		}
	}
	
}
