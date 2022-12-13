package for_;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 두 정수 a ~ b 까지 3의 배수의 합
		 * 출력: "X ~ X 까지 3의 배수의합 : XX"
		 * 
		 * */
		int a = 1, b = 10;
		int sum = 0;
		for(int i = a; i <= b; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(a + " ~ " + b + " 까지 3의 배수의합 : " + sum);
		
		/*
		 * 간단 3, 6, 9 게임
		 * - 정수 1 ~ 100 까지 1씩 증가하면서 반복
		 * - 각 정수를 화면에 출력
		 * - 단, 정수의 "일의 자리가" 3, 6, 9 중 하나일 경우 숫자 대신에 "짝" 출력
		 * ex) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ... 90 91 92 짝 94 95 짝 97 98 짝 100
		 * 
		 * */
		for(int i = 1; i <= 100; i++) {
			int num = i%10;
			if(num == 3 || num == 6 || num == 9) {	// 3, 6, 9 이면 짝
				System.out.print("짝 ");
			} else { // i값을 출력
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		for(int i = 1; i <= 100; i++) {
			switch (i%10) {
			case 3:
			case 6:
			case 9:
				System.out.print("짝 ");
				break;
				
			default:
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		
		System.out.println("=====================================");
		
		// 7의 갯수를 카운트 해보자!
		// int n = 247427723;
		// 출력: "7의 갯수: XX"
		
		int n = 247427723;
		int count = 0;
		
		// while 버전
		while(n != 0) {
			if(n % 10 == 7) {
				count++;
			}
			n /= 10;
		}
		
		// for 버전
//		for(int n = 247427723; n != 0; n /= 10) {
//			if(n % 10 == 7) {
//				count++;
//			}
//		}
		
		System.out.println("7의 갯수: " + count);
		
		
		
		
		
		
		
		
	}

}
