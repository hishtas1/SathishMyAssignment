package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateList {

	public static void main(String[] args) {
		System.out.println("USING LIST");
		String text= "We learn java basics as part of java sessions in java week1";
		System.out.println("String                      :"+text);
		String[] testArray=text.split(" ");
		List<String> list1 = new ArrayList<String>(Arrays.asList(testArray));
		System.out.println("String to List              :"+list1);
		for (int i = 0; i < list1.size(); i++) {
			for (int j = i+1; j < list1.size(); j++) {
				String a=list1.get(i), b=list1.get(j);
				if(a.equals(b)) {
					list1.remove(j);
				}
			}		
		}
		System.out.println("Duplicate is Removed in List:"+list1);
		System.out.println("USING SET");
		System.out.println("String                     :"+text);
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(testArray));
		System.out.println("Duplicate is Removed in Set:"+set );
		
	}
}
	
			

