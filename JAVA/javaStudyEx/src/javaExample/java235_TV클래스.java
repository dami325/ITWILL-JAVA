package javaExample;

public class java235_TV클래스 {

	public static void main(String[] args) {
		
		TV t;
		t = new TV();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널 : " + t.channel);
		
		

	}

}


class TV {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
	
}