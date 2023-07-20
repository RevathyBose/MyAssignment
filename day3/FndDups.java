package week1.day3;

import java.util.Arrays;

public class FndDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,7,7,5,2,9,6,4};
		int b[]=new int[9];
	    Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if (a[i]==a[i+1])
			{
				System.out.println(a[i]);
			}
			
		}
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
			  if (a[i]==a[j])
					  {
					  System.out.println(a[i]);
					  }
			}
		}
		}

	}

