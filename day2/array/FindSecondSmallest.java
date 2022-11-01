package week1.day2.assignment.array;
//Assignment 6
import java.util.Arrays;
public class FindSecondSmallest {
	public static void main(String[] args) {
		int a[]={23,45,67,32,89,22};
		System.out.println("The Array Input is");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println("\nThe Second Smallest Number in the Array is: "+a[1]);

	}

}
