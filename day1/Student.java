package week1.day1;
//Assignment 5
public class Student {
	private void reportCard() {
		String studentName = "SATHISH";
		int rollNo = 2114;
		String collegeName = "PANIMALAR";
		short markScored = 1000;
		float cgpa = 7.99f;
		System.out.println(studentName);
		System.out.println(rollNo);
		System.out.println(collegeName);
		System.out.println(markScored);
		System.out.println(cgpa);
	}
public static void main(String[] args) {
	Student o = new Student();
	o.reportCard();
}
}
