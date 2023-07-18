package week1.day2;

public class Mobile {
	
	public void sendSMS()
	{
		System.out.println("From oppo");
	}

	public long makeCall(long pnumber) 
	{
		return pnumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mobile phone =new Mobile();
         phone.sendSMS();
         long mnumber ;
         mnumber = phone.makeCall(984213657);
         System.out.println(mnumber);
         System.out.println(phone.makeCall(950042890));
	}        

	

}
