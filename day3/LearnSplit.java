package week1.day3;

public class LearnSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Learning JAVA";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));

		}
		String[] split= s.split("A");
		System.out.println(split.length);
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}

	}

}
