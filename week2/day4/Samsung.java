package week2.day4;

public class Samsung extends AndroidTV implements Android {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Samsung tv=new Samsung();
      tv.Cablechannels();
      tv.OpenApp();
      tv.openApp();
      tv.watchVideo();
      		 
	}

	public void OpenApp() {
		// TODO Auto-generated method stub
	 System.out.println("APP is Opened in samsung TV");
	}

	public void watchVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video is playing  in samsung TV");
	}

	
	@Override
	public void Cablechannels() {
		// TODO Auto-generated method stub
	
		 System.out.println("cable channe is watching in samsung TV");
	}

}
