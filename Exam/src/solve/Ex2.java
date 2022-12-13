package solve;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		// 1. 입장료(pee)는 정수이며, 초기 입장료 50000원 변수에 저장
		// 2. 나이(age)는 정수이며, 1 ~ 100 사이의 임의의 값을 변수에 저장
		// 3. 입장료 할인 조건에 따른 입장료(pee) 계산하여 나이와 입장료 출력.
		//	1) 나이가 5세 미만이거나 65세 이상일 경우 50% 할인
		//	2) 나이가 5세 이상이고, 19세 이하일 경우 30% 할인
		// 	3) 위의 모든 조건이 만족하지 않으면 할인 없음
		
		int pee = 50000;
		int age = new Random().nextInt(100) + 1;
		
		if(age < 5 || age >= 65) {	// 5세 미만이거나 65세 이상일 경우
			pee *= 0.5;
		} else if(age >= 5 && age <= 19) {
			pee *= 0.7;
		}
		
		System.out.println("나이가 " + age + "세 이므로 입장료는 " + pee + "원 입니다.");
		
		
		
		
		
		
		
		
		
	}

}
