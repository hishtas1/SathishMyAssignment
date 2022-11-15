package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArrayList {

	public static void main(String[] args) {
		System.out.println("USING LIST");
		int[] a={1,2,3,4,7,6,8};
		Arrays.sort(a);
		List<Integer>listA=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			listA.add(a[i]);	
		}
		System.out.println(listA);
		int n=listA.size()+1;
		int sum=n*(n+1)/2;
		int b=0;
		for (int i = 0; i < listA.size(); i++) {
			int c=listA.get(i);
			b+=c;
		}
		int missing = sum - b;		
		System.out.println("\nMissing number from Array is: "+missing);
	}

}
