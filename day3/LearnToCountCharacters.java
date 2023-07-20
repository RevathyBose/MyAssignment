package week1.day3;

public class LearnToCountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String s="TestLeaf";
		
		int counter=0;
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e') {
				counter++;//++ Count+1 ->0+1
			}
		}		
		
		System.out.println("The number of character e present in the String is "+counter);

	}

}
