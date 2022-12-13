package ex01_04;

public class Ex4_Q2 {

	public static void main(String[] args) {
		// 123p
		
		// Q2)
		// 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요.
		// 단, continue문을 사용
		for(int dan = 2; dan < 10; dan++) {
			
			if(dan % 2 == 1) continue;
			
			System.out.println("< " + dan + "단 >");
			for(int i = 1; i < 10; i++) {
				
				System.out.println(dan+" * " + i + " = " + (dan*i));
			}
			System.out.println();
		}
		
		
		
	}

}
