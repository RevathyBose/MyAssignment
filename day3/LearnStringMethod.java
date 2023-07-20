package week1.day3;

public class LearnStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="TestLeaf";
		String s1="testleaf";
		int n=S.length();
	    System.out.println("the Length of the string "+n);
	    if (S.equals(s1)) {
	    	System.out.println("Both are Equal");
	    }
	    	else {
	    		System.out.println("Both are not Equal");
	    	}
	    
	    if (S.equalsIgnoreCase(s1)) {
	    	System.out.println("Both are Equal");
	    }
	    	else {
	    		System.out.println("Both are not Equal");
	    	}
	    }

	}


