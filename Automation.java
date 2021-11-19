package week3.day2;

public class Automation extends MultipleLanguage implements TestTool  {



	public void Java() {
System.out.println("java");		
	}

	public void Selenium() {
		System.out.println("Selenium");		

	}

	@Override
	void ruby() {
		System.out.println("Ruby");		
		
	}
	public static void main(String[] args) {
		
		Automation aut =new Automation();
		aut.ruby();
		aut.Selenium();
		aut.Java();
		aut.python();
		
		
			// TODO Auto-generated method stub

	}
}
