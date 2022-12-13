
public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 절차(구조적) 프로그래밍 언어: C, Pascal
		 * 객체지향 프로그래밍 언어: C++, JAVA, C#
		 * */
		
		/*
		 * 키워드(예약어)
		 * - 이미 자바에 등록되어 있어 의미가 약속되어 있는 단어
		 * - 속성의 변수명, 메서드명으로 사용할 수 없음
		 * (abstract, default, goto, package, boolean
		 *  do, if, for, this, break, double, protected, else, import, case, public)
		 *  
		 * 예약어 인지 아닌지 판별하는 문제가 나옴! 
		 * */
		
		/*
		 * 변수 선언 및 초기화 문제
		 * 1) 문자열로된 자신의 이름을 저장하는 변수 선언 및 초기화
		 * 2) 문자 A를 저장하는 변수 ch를 선언 및 초기화
		 * 3) 정수 25억을 저장하는 num 변수를 선언 및 초기화
		 * */
		String name = "차동원";
//		char ch = 'A';
		long num = 2500000000L;
		
		/*
		 * 논리연산자 종류
		 * &&, ||, !, ^(XOR)
		 * &&: 모두 true일 경우 true, 하나라도 false일 경우 false
		 * ||: 모두 false일 경우 false, 하나라도 true일 경우 true
		 * ^(XOR): 좌우 다를 경우 true 좌우가 같으면 false
		 * 
		 * */
		
		/*
		 * 형변환 (원인 및 해결책)
		 * int i = 10 + 1.0;
		 *
		 * char ch = 'A';
		 * ch = ch + 2;
		 * */
		
		/*
		 * 배열 선언 및 초기화
		 * 
		 * int[] arr;
		 * int arr[];
		 * 
		 * {1, 2, 3} 선언과 초기화를 동시에 즉, 한줄로 표현할때만 사용가능
		 * arr = {1, 2, 3};
		 * arr = new int[3]; (O)
		 * arr = new int[3]{1, 2, 3}; (X)
		 * arr = new int[]{1, 2, 3}; (O)
		 * 
		 * */
		
		
		Student s = new Student();
		s.name = "차동원";
		s.score = 90;
		s.print();
	}

}


/*
 * 클래스 작성 문제
 * 
 * 클래스 이름 : Student
 * 멤버변수: 이름(문자열, name), 성적(점수, score)
 * 메서드: 이름(name)과 성적(score)를 출력하는 print() 메서드 정의 (파라미터 X, 리턴 X)
 * 
 * main() 메서드에서 객체 생성 및 초기화 후 print() 메서드 호출
 * */
class Student {
	String name;
	int score;
	
	public void print() {
		System.out.println(name + ": " + score);
	}
}
























