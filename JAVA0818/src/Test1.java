import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * 4
		 * 6	2
		 * 9	3	1
		 * 19	10	7	?
		 * 위와같은 규칙을 좀더 일반화하여 각행의 제일 첫번째 숫자들만 주어지면 N크기의 모든
		 * 격자판 정보를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력예시)
		 * 4
		 * 4
		 * 6
		 * 9
		 * 19
		 * 출력예시
		 * 4
		 * 6	2
		 * 9	3	1
		 * 19	10	7	6
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][];
		
		// 2차원 배열 만들기
		// 2차원 배열 첫번째 열에 입력받은 데이터 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			arr[i][0] = sc.nextInt();
		}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
			}
		}
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// 향상된 for문
		for(int[] a : arr) {
			for(int num : a) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
