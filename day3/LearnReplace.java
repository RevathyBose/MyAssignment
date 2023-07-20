package week1.day3;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class LearnReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Rs,2000";
		String  s1=s.replace('2', '1');
		System.out.println(s1);
        String s2=s.replaceAll(",", "");  
		System.out.println(s2);
        String s3=s2.replaceAll("[^A-z a-z]", "");
		System.out.println(s3);
        String s4=s2.replaceAll("[A-z a-z]", "");
		System.out.println(s4);
		System.out.println(s4+200);
		int n=Integer.parseInt(s4);
		System.out.println(n+200);
        String substring=s.substring(3);
        System.out.println(substring);
        String substring1=s.substring(3,7);
        System.out.println(substring1);
        boolean contains = s.contains("Rs");
		System.out.println(contains);
		String s5="Revathy";
		String s6=s5.toLowerCase();
		System.out.println(s6);
		String s7=s5.toUpperCase();
		System.out.println(s7);


	

	}

}
