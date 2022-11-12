package week3.day1.assignments.student;
import week3.day1.assignments.department.Department;
public class Student extends Department {
	public void studentName() {
		System.out.println("Name: SATHISH S");
	}
	public void studentID() {
		System.out.println("ID No.: 2016PECEE199");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName();
		student.studentID();
		student.departmentName();	
		student.collegeName();
		student.collegeCode();
		student.collegeRank();			
	}
}
