package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="I am a software tester ";
		String words[]=sentence.split("");
		//System.out.println(words.length);
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		if(i%2==0)
			{
				char[] charArray=words[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}
			}
			else {
	//			System.out.print(words[i]);
			}
		}
	}

}
