package polimorfizm_practice;

public class Smart_TV extends TV{

	int channelCount=200;
	
	public void play() {
		System.out.println("Playing Smart TV");
	}
	
	public int getChannelCount(){
		return channelCount;
	}
	
	public static void printStatic() {
		System.out.println("SmartTV static");
	} 
	public static void main(String[] args) {
		TV s1=new Smart_TV();
	
	    System.out.println(s1.channelCount);
		System.out.println(s1.getChannelCount());
		s1.play();
	    s1.printStatic();
	    System.out.println("=================================");
	    Smart_TV t1=(Smart_TV)s1;
	    System.out.println(t1.channelCount);
	    System.out.println(t1.getChannelCount());
	    t1.play();
		t1.printStatic();
		
	    
	    
	}
}
