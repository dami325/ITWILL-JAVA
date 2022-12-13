package switch_case;

import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * 학생 점수(score)에 대한 학점(grade) 판별
		 * A학점: 90 ~ 100점
		 * B학점: 80 ~ 89점
		 * C학점: 70 ~ 79점
		 * D학점: 60 ~ 69점
		 * F학점: 0 ~ 59점
		 * 
		 * 그 외: "점수입력 오류!"
		 * 
		 * */
		
		int score = 100;
		
		String grade = "";
		
		if(score >= 0 && score <= 100) {
			
			// switch - case
			switch (score/10) {
			case 10:	
			case 9:		grade = "A학점";	break;
			case 8: 	grade = "B학점";	break;
			case 7:		grade = "C학점";	break;
			case 6: 	grade = "D학점";	break;
			default: 	grade = "F학점";	break;
			}
			
		} else {
			grade = "점수 입력 오류!";
		}
		
		System.out.println(grade);
		
		
		System.out.println("-----------------------------------");
		
		/*
		 * 등급을 정수형 변수로 관리하여
		 * 해당 등급에 따른 할인 금액을 계산
		 * 		- 등급(grade2): 1(일반 회원), 2(VIP회원), 3(VVIP회원)
		 *      - 할인율(pee): 일반회원(5%), VIP회원(15%), VVIP회원(30%)
		 * 
		 * */
		
		// if문과 switch-case문을 사용하여 등급에 따른 할인율을 적용하여 결재 금액 계산 후 출력
		// ex) 결재 금액 : XXX원
		// 회원 등급이 아닐 경우 "회원 등급 오류!" 라고 출력
		
		// if문
		int grade2 = 3;
		int pee = 50000;
		
		String result = "";
//		if(grade2 == 1) {
//			result += (pee * 0.95) + "원";
//		} else if(grade2 == 2) {
//			result += (pee * 0.85) + "원";
//		} else if(grade2 == 3) {
//			result += (pee * 0.7) + "원";
//		} else {
//			result = "회원 등급 오류!";
//		}

		// 삼항연산자
//		result  = grade2 == 1 ? "결재 금액 : " + (pee * 0.95) + "원" 	:
//				  grade2 == 2 ? "결재 금액 : " + (pee * 0.85) + "원" 	:
//			      grade2 == 3 ? "결재 금액 : " + (pee * 0.7) + "원" 	: "회원 등급 오류!";
		
		
		
		// switch - case
		switch (grade2) {
		case 1:
			result = "결재 금액 : " + (pee * 0.95) + "원";
			break;
		case 2:
			result = "결재 금액 : " + (pee * 0.85) + "원";
			break;
		case 3:
			result = "결재 금액 : " + (pee * 0.7) + "원";
			break;
		default:
			result = "회원 등급 오류!";
			break;
		}
		
		System.out.println(result);
		
		
		
		
		
	}

}
