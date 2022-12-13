package javaExample;

public class java303 {
	static {
		System.out.println("static 초기화블록{ } 호출됨");
		//한번만 호출됨
	}
	
	
	
	{
		System.out.println("인스턴스 초기화블록 { } 호출됨");
		//인스턴스 생성마다 호출됨
	}
	
	
	
	public java303() {
		System.out.println("생성자 호출됨");
		//인스턴스 생성마다 호출됨
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
//		System.out.println("메인 메서드 bt생성전");
		java303 bt = new java303();
//		System.out.println("메인 메서드 bt생성후");
//		
//		System.out.println("=======================");
//		
//		System.out.println("메인 메서드 bt2생성전");
		java303 bt2 = new java303();
//		System.out.println("메인 메서드 bt2생성후");
		
	}

}
