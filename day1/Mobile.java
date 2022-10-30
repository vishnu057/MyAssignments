package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="pixel6a";
	    float mobileWeight=200f;	
	    System.out.println("Make a call");
	}
	public void sendMsg() {
		boolean fullCharged=false;
		int mobileCost=39000;
		
		System.out.println("Send a Message");
	
	}
	
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my Mobile");
	}

}
