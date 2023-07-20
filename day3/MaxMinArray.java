package week1.day3;

import java.util.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores [] = {98,87,78,67,54};
		Arrays.sort(scores);//Arrays in Accending order
		for (int i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
			
		}
		System.out.println("The Minimum Value in the Array"+scores[0]);
		System.out.println("The Maximum Value in the Array"+scores[scores.length-1]);

	}

}
