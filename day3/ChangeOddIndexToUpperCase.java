package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
	    char [] c=test.toCharArray();
	    for (int i=0;i<c.length;i++) {
	    	if ((i%2)==1) {
	    		char s;
	    		c[i]=Character.toUpperCase(c[i]);
	    	    		
	    	}
	    	System.out.print(c[i]);
	    }

	}

}
