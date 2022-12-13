package static_;

public class Ex6 {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
		m1.attack();
		m2.attack();
		m3.attack();
		
		Marine.upgrade++;
		
		m1.attack();
		m2.attack();
		m3.attack();
		
		Marine m4 = new Marine();
		m4.attack();
		
		m1.attack();
		m2.attack();
		m3.attack();
		m4.attack();
		m1.attack();
		m2.attack();
		System.out.println("---------------");
		Marine.upgrade++;
		m3.attack();
		m4.attack();
		m1.attack();
		m2.attack();
		m3.attack();
		m4.attack();
		
		
	}

}

class Marine {
	static int upgrade = 0;
	
	int hp;
	int demage = 5;
	
	public void attack() {
		System.out.println("demage: " + (demage + upgrade));
	}
	
	
	
	
}



