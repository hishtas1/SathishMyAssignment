package week3.day2.assignments.abstraction;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation automation = new Automation();
		System.out.println("Methods Inside MultipleLanguage Abstract Class");
		automation.Python();
		automation.Ruby();
		System.out.println("Methods Inside Language Interface");
		automation.Java();
		System.out.println("Methods Inside TestTool Interface");
		automation.Selenium();
	}
	public void Selenium() {
		System.out.println("SELENIUM");	
	}
	public void Java() {
		System.out.println("JAVA");	
	}
	@Override
	public void Ruby() {
		System.out.println("RUBY");		
	}
}
