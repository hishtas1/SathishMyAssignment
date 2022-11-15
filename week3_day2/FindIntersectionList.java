package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		System.out.println("USING LIST");
		List<Integer>insersection=new ArrayList<Integer>();
		List<Integer>listA=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			listA.add(a[i]);	
		}
		List<Integer>listB=new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			listB.add(b[i]);	
		}
		System.out.println("List A      : "+listA);
		System.out.println("List B      : "+listB);
		for (int i = 0; i < listA.size(); i++) {
			for (int j = 0; j < listB.size(); j++) {
				if(listA.get(i)==listB.get(j)) {
					insersection.add(listA.get(i));
				}
			}
		}
		System.out.println("Insersection: "+insersection);
	}
}
