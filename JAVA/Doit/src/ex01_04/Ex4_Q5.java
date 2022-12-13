package ex01_04;

public class Ex4_Q5 {

	public static void main(String[] args) {
		/*
		 * 			*
		 * 		   ***
		 * 		  *****
		 * 		 *******
		 * 		  *****
		 * 		   ***
		 * 		    *
		 * 
		 * */
		int line = 7;
		int star = 1;
		int space = 3;
		
		for(int i = 0; i < line; i++) {
			
			// 좌공백
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			// 별찍기
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			
			// 우공백
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			// 줄바꿈
			System.out.println();
			
			// 변수수정
			if(i < line/2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
		}
		
		
	}

}
