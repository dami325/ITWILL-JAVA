package array;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * 학생 5명의 점수를 배열 score에 저장하고
		 * 각 학생 점수의 총점과 평균을 계산하여 출력
		 * 
		 * < 출력 예시 >
		 * 1번 학생: 80점
		 * 2번 학생: 100점
		 * 3번 학생: 50점
		 * 4번 학생: 90점
		 * 5번 학생: 77점
		 * ----------------
		 * 총점: 397점
		 * 평균: 79.4점
		 * 
		 * < 추가 항목 >
		 * 1. 학생 이름을 저장하는 배열 names를 생성하여
		 *    이순신, 홍길동, 강감찬, 김태희, 전지현 문자열 5개를 지정한 후
		 *    학생 번호 대신 이름을 출력
		 * 2. 학생 점수 중 최고점수와 최저점수를 찾아 출력   
		 * 
		 * < 출력 예시 >
		 * 최고 점수: 100점
		 * 최저 점수: 50점
		 * 
		 * */
		
		int[] score = {80, 100, 50, 90, 77};
		String[] names = {"이순신", "우영우", "동그라미", "김희선", "김태희"};
		
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.println(names[i] + ": " + score[i] + "점");
			total += score[i];
		}
		double avg = (double)total / score.length;
		System.out.println("----------------");
		System.out.println("총점: " + total + "점");
		System.out.println("평균: " + avg + "점");
		
		int max = 0;
		int min = 100;
		// 일반 for문
//		for(int i = 0; i < score.length; i++) {
//			if(max < score[i]) {
//				max = score[i];
//			}
//			
//			if(min > score[i]) {
//				min = score[i];
//			}
//		}
		
		// 3항상연산자
//		for(int i=0; i < score.length; i++) {
//			
//			max = max < score[i] ? score[i] : max;
//			min = min > score[i] ? score[i] : min;
//			
//		}
		
		// 변수 선언
//		for(int i=0; i < score.length; i++) {
//			
//			int num = score[i];
//			max = max < num ? num : max;
//			min = min > num ? num : min;
//			
//		}
		
		// 향상된 for문
		for(int num : score) {
			max = max < num ? num : max;
			min = min > num ? num : min;
		}
		
		System.out.println("최고 점수: " + max + "점");
		System.out.println("최저 점수: " + min + "점");
		
		
		// 향상된 for문 (for-each문)
//		String[] class1 = {"김윤진", "차동원", "소지섭"};
//		for(int i=0; i < class1.length; i++) {
//			String name = class1[i];
//			System.out.println(name + "이 상담받았습니다!");
//		}
//		
//		for(String name : class1) {
//			System.out.println(name + "이 상담받았습니다!");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
