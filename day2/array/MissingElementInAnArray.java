package week1.day2.assignment.array;
//Assignment 7
import java.util.Arrays;
public class MissingElementInAnArray {
	public static void main(String[] args) {
        int[] a={1,2,3,4,7,6,8};
        Arrays.sort(a);
        System.out.println("The Array Input is");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		int n=a.length+1;
		int sum=n*(n+1)/2;
		int b=0;
		for(int i=0;i<a.length;i++) {
			b+=a[i];
		}
		int missing=sum-b;
        System.out.println("\nMissing number from Array is: "+missing);
    }
}