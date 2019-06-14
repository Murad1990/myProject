package polimorfizm_practice;

public class TV {
	int channelCount=100;
	
	public static void printStatic() {
		System.out.println("TV static");
	} 
	
	public int getChannelCount(){
		return channelCount;
	}
	
	public void play() {
		System.out.println("Playing TV");
	}
}
