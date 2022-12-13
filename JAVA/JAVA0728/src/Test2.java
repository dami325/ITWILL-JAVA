import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 기억력 테스트
		// N 개의 숫자를 먼저 말해준다.
		// M 개의 질문을 받아 그 숫자가 있었는지 판별하시오.
		// 있으면 1 없으면 0을 출력
		// 입력예시)
		//			5
		//			2 52 23 55 100
		//			4
		//			5 2 55 99
		// 출력예시)
		//			0 1 1 0
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 크기 N을 입력
		int[] target = new int[N];	// N 크기의 배열 생성
		for(int i = 0; i < target.length; i++) {
			target[i] = sc.nextInt();	// 배열에 각요소에 입력받은 정수를 저장
		}
		
		int M = sc.nextInt();	// 크기 M을 입력
		int[] nums = new int[M];// M 크기의 배열 생성
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt(); // 배열에 각요소에 입력받은 정수를 저장
		}
		
//		int[] target = {2, 52, 23, 55, 100};
//		int[] nums = {5, 2, 55, 99};
		for(int i = 0; i < nums.length; i++) {
			System.out.print(existsNum(target, nums[i]) ? "1 " : "0 ");
		}
	} // main() 메서드 끝
	
	public static boolean existsNum(int[] target, int num) {
		for(int i = 0; i < target.length; i++) {
			if(num == target[i]) {	// 찾음
				return true;
			}
		}
		return false;
	}
	
	
	

}
