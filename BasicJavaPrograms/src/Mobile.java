
public class Mobile {

	private String sim;
	private String memoryCard;
	private String mobileUniqueNumber;
	private String mobileScreteCode;
	private String mobileApps;
	
	public static void makeCall(){
		System.out.println("Making call from Mobile");
	}
	
	public void playMusic(){
		System.out.println("Playing music");
	}
	
	public void playGames(){
		System.out.println("Playing Games");
	}
	
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile();
		mobile1.playGames();
		mobile1.playMusic();
		//mobile1.makeCall();
		//The static method makeCall() from the type Mobile should be accessed in a static way
		
		makeCall();
	}
	
	
}

class MobileDemo{
	
	public static void main(String[] args) {
		Mobile.makeCall();
	}
}
