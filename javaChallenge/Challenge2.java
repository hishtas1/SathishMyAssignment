package javaChallenge;
//Given a non-negative integer x, compute and return the square root of x.
public class Challenge2 {
	public static void main(String[] args) {
		int x[]= {2,8};
		for (int i = 0; i < x.length; i++) {
			int a=x[i];
			for (int j = 0; ; j++) {
				int c=j*j;
				if (c>a) {
					System.out.println("Square Root of "+a+" is "+(j-1)+ " without Decimal Point");
					break;
				}
			}
		}
		/*for (int i = 0; i < x.length; i++) {
			double squareroot = Math.pow(x[i], 0.5);
			System.out.println("Square Root of "+x[i]+" is "+squareroot);			
		}
		for (int i = 0; i < x.length; i++) {
			double squareroot = Math.pow(x[i], 0.5);
			System.out.println("Square Root of "+x[i]+" is "+String.format("%.2f",squareroot));
	
		}*/

	}
}

