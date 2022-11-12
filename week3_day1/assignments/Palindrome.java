package week3.day1.assignments;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String input="madam";
		char[] charArray = input.toCharArray();
		String rev="";  
	    for(int i=charArray.length-1;i>=0;i--){  
	        rev+=charArray[i];  
	    }
	    char[] charArray1 = input.toCharArray();
		char[] charArray2 = rev.toCharArray();
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println(input+" and "+rev+" are palindrome");
		}else {
			System.out.println(input+" and "+rev+" are not palindrome");
		}
	
	}

}
