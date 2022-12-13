package for_;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * for문을 사용하여 구구단 2 ~ 9단 까지 모두 출력
		 * 
		 * < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * 2 * 9 = 18
		 * 
		 * < 3단 >
		 * ...
		 * 
		 * < 9단 >
		 * ...
		 * 9 * 9 = 81
		 * 
		 * */
		
		// Alt + Shift + R (변수명 바꾸기)
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("< " + dan + "단 >");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		
		
	}

}
