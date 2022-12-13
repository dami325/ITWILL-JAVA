package array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * n 개의 숫자가 입력되면
		 * n 개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오!
		 * 
		 * 입력예시)
		 * 5
		 * 1 2 3 4 5
		 * 출력예시)
		 * 1 2 3 4 5
		 * 2 3 4 5 1
		 * 3 4 5 1 2
		 * 4 5 1 2 3 
		 * 5 1 2 3 4 
		 * 
		 * */
		// -------------------------------------------------
//		int[] arr= {1, 2, 3, 4, 5};
//		
////		arr[0] = arr[1];	// 1 <- 2
////		arr[1] = arr[2];	// 2 <- 3
////		arr[2] = arr[3];	// 3 <- 4
////		arr[3] = arr[4];	// 4 <- 5
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			// 출력
//			for(int j=0; j < arr.length; j++) {
//				System.out.print(arr[j] + " ");
//			}
//			System.out.println();
//			
//			// rotation
//			int temp = arr[0];	// 배열의 첫번째 요소를 임시변수에 저장
//			for(int j = 0; j < arr.length - 1; j++) {
//				arr[j] = arr[j+1];
//			}
//			arr[arr.length - 1] = temp;	// 마지막 요소에 임시변수 temp 에 저장된 데이터를 저장
//			
//		}
		
		// ---------------------------------------
		// 메서드 버전
//		int[] arr= {1, 2, 3, 4, 5};

		// 5번 반복
//		for(int i = 0; i < arr.length; i++) {	
//			printArray(arr);
//			rotation(arr);
//		}
		
		// ---------------------------------------
		// 배열크기 * 2 버전
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열의 크기
		
		int[] arr = new int[n*2];
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			arr[i+n] = num;
		}
		
		for(int i = 0; i < n; i++) {	// 행반복
			
			// 출력
			print(i, i+n, arr);
			
//			for(int j = i; j < n + i; j++) {
//				System.out.print(arr[j] + " ");
//			}
//			System.out.println();
			
		}
		
		
		
		
	}	// main() 메서드 끝
	
	public static void print(int startIndex, int endIndex, int[] arr) {
		
		for(int i=startIndex; i < endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	// 배열확인용 출력
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// 배열 rotation
	public static void rotation(int[] arr) {
		int temp = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
	
	
	
	
	
	
	
	

}
