
public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 변수 (Variable)
		 * - 자바에서 사용되는 데이터를 저장하는 메모리 공간
		 * - 한 번에 하나의 데이터만 저장 가능
		 *   => 언제든 다른 데이터로 대체될 수 있다. (변할 수 있다.)
		 * - 변수를 사용하기 위해선 변수 선언이 먼저 진행되어야 함
		 * - 변수에 데이터를 저장하는 것을 변수 초기화라고함  
		 * 
		 * 
		 * */
		
//		int a;
//		int b;
//		a = 1;
//		System.out.println(a + 1);
//		System.out.println(b); // 반드시 초기화 후에 사용해야함
//		a = 2;
//		System.out.println(a + 1);
		
		// 선언과 초기화를 동시에
//		int a = 10;
//		int b = 20;
		
		// 동시에 여러개 변수를 선언
//		int a, b;
//		a = 10;
//		b = 20;
		
		// 동시에 여러개 변수를 선언과 동시에 초기화
		int a = 10, b = 20, c = a;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a + b);
		
		a = b;
		b = c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		String name;
		name = "차동원";
		System.out.println(name);
		
//		name = 10;
//		a = "차동원";
		
		
		
	}
}
