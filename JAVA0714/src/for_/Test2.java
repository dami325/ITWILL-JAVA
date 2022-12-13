package for_;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 정수 n을 입력받아 n층의 별 계단을 출력
		// n = 5 인 경우
		// 
		// 	**
		//   **
		//    **
		//     **
		//      **
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int space = 0;
		
		for(int i = 0; i < n; i++) {	// 줄수
			
			// 공백
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			// 별
			System.out.println("**");
			
			space++;
			
		}
		
		
		
		
		
	}

}
