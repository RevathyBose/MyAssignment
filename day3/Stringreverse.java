package week1.day3;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String s ="revathy";
	    System.out.println(s.charAt(3));
	    System.out.println();
	    char [] c=s.toCharArray();
	    for (int i=0;i<s.length();i++)
	    {
	    	System.out.print(s.charAt(i));
	    }
	    System.out.println();

	    for (int j=s.length()-1;j>=0;j--)
	    {
	    	//System.out.print(s.charAt(j));
	    	System.out.print(c[j]);
	    }

	}

}
