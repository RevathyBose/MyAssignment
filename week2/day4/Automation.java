package week2.day4;

public class Automation extends MultipleLanguage implements Language,TestingTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a=new Automation();
		a.phython();
		a.Java();
		a.Selenium();
		a.Ruby();
  
	}

	@Override
	public void Ruby() {
		// TODO Auto-generated method stub
		System.out.println("Automation Language is Ruby");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Automation Tool is Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Automation Language is Java");
		
	}

}
