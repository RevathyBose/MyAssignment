package week1.day3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++)
		{
		
			//System.out.println(arr[i]);
			if(i!=arr[i+1]) {
				System.out.println("Number not Available in the Array"+i);
						
			}
		/*		else {
					System.out.println("Number Available in the Array"+ i);
					}*/
				
		}
	}
}