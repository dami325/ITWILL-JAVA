package array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 도로 교통 상황이 숫자로 주어진다.
		 * 
		 * 출발 70 80 60 20 30 50 10 80 77 89
		 *           ||    ||    ||
		 *     70 60 40 50 55 65 23 44 37 88 도착
		 * 
		 * 북 쪽에서 남쪽 다리 index 번호가 주어진다.
		 * 이때, 가장 최소 시간이 소요되는 다리는 몇번 다리인지 출력하고 최소시간을 함께 출력해보자!
		 * 
		 * 출력예시) 다리번호: 6
		 * 		   최소시간: 512
		 * 
		 * 주의사항.
		 * 1. 무조건 다리를 1번 건너야함 (도착지점이 남쪽이기 때문에)
		 * 2. 다리를 여러번 건널수 없고 딱, 한번만 가능
		 * 3. 다리를 건널때에는 남쪽, 북쪽 소요시간이 같이 소요됨. (즉, 같이 합산해야함)
		 * 4. 소요시간이 같은 경우 발생하면 낮은 다리번호를 출력
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int[] north = new int[10];
		int[] south = new int[10];
		int[] bridge = new int[sc.nextInt()];
		int[] total = new int[bridge.length];

		// 북쪽 데이터 입력
		for(int i = 0; i < north.length; i++) {
			north[i] = sc.nextInt();
		}
		
		// 남쪽 데이터 입력
		for(int i = 0; i < south.length; i++) {
			south[i] = sc.nextInt();
		}
		
		// 다리 데이터 입력
		for(int i = 0; i < bridge.length; i++) {
			bridge[i] = sc.nextInt();
		}
		
		// 계산
		for(int i=0; i < bridge.length; i++) {
			total[i] = sum(north, south, bridge[i]);
		}
		
		for(int i=0; i<total.length; i++) {
			System.out.println(total[i]);
		}
		
//		int minIndex = 0;
//		int min = Integer.MAX_VALUE;
//		for(int i=0; i < total.length; i++) {
//			if(min > total[i]) {
//				min = total[i];
//				minIndex = i;
//			}
//		}
//		System.out.println("다리번호: " + bridge[minIndex]);
//		System.out.println("최소시간: " + min);
	}
	
	public static int sum(int[] north, int[] south, int 다리번호) {
		int sum = 0;
		for(int j = 0; j <= 다리번호; j++) {
			sum += north[j];
		}
		for(int j = 다리번호; j < south.length; j++) {
			sum += south[j];
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
