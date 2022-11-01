package week1.day2.assignment.array;
//Assignment 8
public class FibonacciSeries {
	public static void main(String[] args) {
		int range=8, firstNum=0, secNum=1, sum;
		System.out.println(firstNum+ "\n" +secNum);
		for(int i=1;i<=(range-2);i++) {
			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
		}
	}
}

