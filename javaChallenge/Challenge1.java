package javaChallenge;
public class Challenge1 {
	public static void main(String[] args) {
		//Given a string consisting of words and spaces, return the length of the last word in the string.
		String[] line={"Hello World","fly me to the moon","luffy is still joyboy"};
		for (int i = 0; i < line.length; i++){
			System.out.println("The String "+(i+1)+" is '"+line[i]+"'");
			String  a=line[i];
			String word[]=a.split(" ");
			String b=word[word.length-1];
			System.out.println("The last Word is '"+b+"' in "+(word.length-1)+" Index");
			char[] lword=b.toCharArray();
			System.out.println("The Length of the Word is "+(lword.length));
		 }
	}
}