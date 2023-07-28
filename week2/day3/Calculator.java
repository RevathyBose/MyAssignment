package week2.day3;

public class Calculator {
	
	public void add(int x,int y)
	{
	   int z;
	   z=x+y;
  
		System.out.println("Sum of two Numbers:"+z);
	}
	public int add(int x,int y,int z)
	{
		return x+y+z;
			
	}
	public void multiply(double x,double y)
	{
		
		double z=x*y;
		System.out.println("Multiply of two numbers"+z);
	}
	public void multiply(float x,float y)
	{
		
		float  z=x*y;
		System.out.println("Multiply of two numbers"+z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.add(10, 20);
        int d=c.add(10, 20,30);
		System.out.println("Add of three Number:"+d);
		c.multiply(556623.456, 56789.56);
		c.multiply(23.5f, 10.5f);
		
	}

}
