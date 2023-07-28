package week2.day3;

public class Students {
    public int getStudentInfo(int id)
    {
    	return id;
    }
    public void getStudentInfo(int id ,String name)
    {
    	System.out.println("Student Id :2448790");
    	System.out.println("Student name :Revathy");
    }
    public long getStudentInfo(long phonenumber ,String emailid)
    {
    	System.out.println("Student email id:revbose@yahoo.co.in");
    	return phonenumber;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Students s=new Students();
      int d=s.getStudentInfo(2448790);
      System.out.println("Student Id :"+d);
      s.getStudentInfo(2448790,"Revathy");
      long n=s.getStudentInfo(950042890l,"revbose@yahoo.co.in");
      System.out.println("Student Phone number : "+n);
      
	}

}
