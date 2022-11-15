package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		System.out.println("Elements in the Array:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		Arrays.sort(data);
		System.out.println("\nElements in the Array After Sorting:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		List<Integer>listA=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++){
			listA.add(data[i]);
		}
		System.out.println("\nArray is Converted into List\n"+listA);
		System.out.println("The Second Smallest Number in the List is:\n"+listA.get(1));
		}
}