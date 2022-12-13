package if_;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 1. 정수형 변수 num1에 대한 양수, 음수, 0을 판별
		
		int num1 = -4;
		if(num1 > 0) {
			System.out.println("num1은 양수!");
		} else if(num1 < 0) {
			System.out.println("num1은 음수!");
		} else {
			System.out.println("num1은 0!");
		}
		
		// 2. 정수형 변수 num2에 대한 홀수, 짝수, 0을 판별
		int num2 = 3;
		
		if(num2 == 0) { // 0
			System.out.println("0");
		} else if(num2 % 2 == 0) { // 짝수
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 3. 문자 ch가 대문자 -> 소문자, 소문자 -> 대문자 
		//    아니면 "ch는 영문자가 아닙니다!" 출력 
		char ch = 'Z';
		String result = "";
		if('A' <= ch && ch <= 'Z')		result = "ch = " + (ch += 32);
		else if('a' <= ch && ch <= 'z')	result = "ch = " + (ch -= 32);
		else							result = "ch는 영문자가 아닙니다!";
		
		System.out.println(result);
		
		/*
		 * 학생 점수(score)에 대한 학점(grade) 판별
		 * A학점: 90 ~ 100점
		 * B학점: 80 ~ 89점
		 * C학점: 70 ~ 79점
		 * D학점: 60 ~ 69점
		 * F학점: 0 ~ 59점
		 * 
		 * "X학점" 라고 출력
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String grade = "";
		
//		if(score >= 90) 		grade = "A학점";
//		else if(score >= 80)	grade = "B학점";
//		else if(score >= 70)	grade = "C학점";
//		else if(score >= 60)	grade = "D학점";
//		else					grade = "F학점";
		
		grade = score >= 90 ? "A" : 
				score >= 80 ? "B" :
				score >= 70 ? "C" :
				score >= 60 ? "D" : "F"; 
		
		grade += "학점";		
				
		System.out.println(grade);
		
		
		
		
		
		
		
	}

}
