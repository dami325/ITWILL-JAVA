package review;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 파스칼에 삼각형
		// 크기 N을 입력받고 N크기의 파스칼 삼각형을 출력 하시오
		
		// 입력 예시) 6
		// 출력 예시)
		// 1
		// 1 1
		// 1 2 1
		// 1 3 3 1
		// 1 4 6 4 1
		// 1 5 10 10 5 1
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] pascal = new int[n][];

		// 1. 계단형식 2차원 배열 만들기
//		int index = 1;
//		for(int[] arr : pascal) {
//			arr = new int[index];
//			index++;
//		}
		for(int i = 0; i < pascal.length; i++) {
			// 향상된 for문 동작 방식
//			int[] arr = pascal[i];
//			arr = new int[i+1];
			pascal[i] = new int[i+1];
		}
		

		// 2. 데이터 넣기
		for(int i = 0; i < pascal.length; i++) {
			for(int j = 0; j < pascal[i].length; j++) {
				// 첫번째 열 이거나 i == j 일경우 1 저장
//				if(j == 0 || i == j) {
//					pascal[i][j] = 1;
//				} else {
//					pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
//				}
				
				// 삼항연산자
				pascal[i][j] = (j == 0 || i == j) ? 1 : pascal[i-1][j] + pascal[i-1][j-1];
			}
			
		}
		
		
		// 3. 데이터 출력
		// 향상된 for문
		// => index값이 필요하면 사용 X
		// => 배열의 모든 요소를 읽기만 할때 적합함
		for(int[] arr : pascal) {
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
