package solve;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		// [문항2] 다음 중 키워드(예약어)에 해당하는 것을 모두 고르시오.
		// return, For, 자바, switch, void
		// 정답: return, switch, void
		
		// [문항3] 다음에서 설명하는 변수를 선언하고 초기화 하시오.
		// 2. 실수 3.14 를 저장하는 변수 dNum
//		double dNum = 3.14f;
//		float dNum = 3.14f;
		
		// [문항4] 논리 연사 중
		// "피연산자의 값이 모두 true 인 경우에만 결과값이 true"
		// 정답: &&
		
		// [문항5] 정수형 변수 3개를 저장 가능한 배열 arr을 선언하고,
		// 임의의 정수 3개로 초기화하는 코드를 '한 문장' 으로 작성하시오.
		int[] arr = new int[] {1, 2, 3};
		
		// [문항11] 레퍼런스 형변환을 적용하려 한다. 이 때, 인스턴스가 어떤 클래스의 하위 타입인지
		// 를 판별하기 위해 사용하는 연산자는 무엇인가??
		// 정답: instanceof
		
		// [문항12] 1 ~ 10 사이의 난수를 발생시키는 코드
//		Random r = new Random();
//		System.out.println(r.nextInt(10) + 1); 
//		System.out.println(new Random().nextInt(10) + 1);
		
		// [문항13]
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		// a. u = (Unit)ac;
		// b. u = ac;
		// c. GroundUnit gu = (GroundUnit)u;
		// d. AirUnit au = ac;
		// e. t = (Tank)u;
		// f. GroundUnit gu = t;
	}
}
class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}













// [문항9]
// 조건1. Manager 클래스는 Employee 클래스가 갖는 사원명(name), 연봉(salary)은 물론,
//		 새로운 멤버변수인 부서명(depart)을 갖는다.
// 조건2. 사원 정보(사원명, 연봉, 부서명)를 리턴하는 메서드 getManager()를 갖는다.
class Employee {
	String name;	// 사원명
	int salary; 	// 연봉
	
	public String getEmployee() {
		return name + " " + salary;
	}
}

class Manager extends Employee {
	String depart;

	public String getManager() {
		return getEmployee() + " " + depart;
	}
}








