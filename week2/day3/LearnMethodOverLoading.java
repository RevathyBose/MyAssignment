package week2.day3;

public class LearnMethodOverLoading {
	
	public void empdetails()
	{
   System.out.println("Completedetails");
}
public void empdetails(String name)
{
	System.out.println(name);
}
public long empdetails(String name,long phoneno)
{
	System.out.println(name);
	return phoneno;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethodOverLoading emp = new LearnMethodOverLoading();
		emp.empdetails();
		emp.empdetails("revathy");
		emp.empdetails("kanchana", 950042890);
}
}