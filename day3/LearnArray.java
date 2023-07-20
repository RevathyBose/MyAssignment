package week1.day3;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int scores [] = {10,20,30,40,50};
		int  [] scores1 = {60,70,80,90,100};
		int length =scores.length;
       System.out.println(scores[4]);
       System.out.println(scores[length-1]);
       //address
       System.out.println(scores);
       //print Array  elementts
       for (int i=0;i<length;i++)
       {
    	   System.out.println(scores[i]);
    	   System.out.println(scores1[i]);
       }
       //Reverse Array elements and print
       for (int i=length-1;i>=0;i--)
       {
    	   System.out.println(scores[i]);
    	   System.out.println(scores1[i]);
       }

}
}