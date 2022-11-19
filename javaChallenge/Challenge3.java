package javaChallenge;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
//removing all non-alphanumeric characters, it reads the same forward and backward
//Alphanumeric characters include letters and numbers
public class Challenge3 {
	public static void main(String[] args) {
		String[] a= {"A man, a plan, a canal: Panama","race a car"};
		for (int i = 0; i < a.length; i++) {
			String givenString=a[i];
			System.out.println("Given Text:\n"+givenString);
			String lowerCase=givenString.toLowerCase();
			String removeNonAplha=lowerCase.replaceAll("[^a-zA-Z0-9]","");
			System.out.println("After Modification:\n"+removeNonAplha);
			String reverse=""; 
				for (int j = removeNonAplha.length()-1; j >=0 ; j--) {
					reverse=reverse+removeNonAplha.charAt(j);
				}
			if(removeNonAplha.equals(reverse)) {
				System.out.println(removeNonAplha+" and "+reverse+" are palindrome");
			}else {
				System.out.println(removeNonAplha+" and "+reverse+" are not palindrome");
			}
		}
	}
}
