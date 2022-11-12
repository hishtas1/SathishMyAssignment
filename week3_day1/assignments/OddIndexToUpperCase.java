package week3.day1.assignments;
public class OddIndexToUpperCase{
	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 1; i < charArray.length; i=i+2) {
			charArray[i] = Character.toUpperCase(charArray[i]);
		}
		System.out.println(charArray);
	}
}
