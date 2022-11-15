package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArrayList {

	public static void main(String[] args) {
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> listA = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			listA.add(a[i]);
		}
		System.out.println("Array to List: \n"+listA);
		List<Integer>duplicate=new ArrayList<Integer>();
		for (int i = 0; i < listA.size(); i++) {
			for (int j = i+1; j < listA.size(); j++) {
				int b=listA.get(i), c=listA.get(j);
				if (b==c) {
					duplicate.add(listA.get(i));
				}
			}			
		}
		System.out.println("Duplicate Element in List\n"+duplicate);
	}
}