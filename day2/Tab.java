package week1.day2;

public class Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile phone =new Mobile();
		phone.sendSMS();
		long pnumber ;
		pnumber=phone.makeCall(98421);
		System.out.println(pnumber);

	}

}
