package week2.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FindInterscetion {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	    int[] a={3,2,11,4,6,7,8,10};
		int[] b={1,2,8,4,9,7,9,10};
		int n=a.length;
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		for (int i=0;i<n;i++)
		{
			list1.add(a[i]);
		}
		for (int j=0;j<b.length;j++)
		{
			list2.add(b[j]);
		}
		System.out.println(list1);
		System.out.println(list2);
		//comparing and find the matching elements in the List
        for (int i=0;i<list1.size();i++)
        {
        	for (int j=0;j<list2.size();j++)
        	{
        		if (list1.get(i)==list2.get(j))
        		{
        			System.out.println(list1.get(i));
        		}
        	}
        }


		
	}

}
