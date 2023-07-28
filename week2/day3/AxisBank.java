package week2.day3;

public class AxisBank extends BankInfo{
	
	public void deposit ()
	{
		super.deposit();
		System.out.println("RD deposit interest :10%");
	}

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		 AxisBank AB=new AxisBank();
		 AB.deposit();
		 AB.Fixed();
		 AB.Saving();
	}
	

}
