
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * final을 붙일 수 잇는 대상과 그 의미
		 * 
		 * 변수 - 상수 (한번 저장된 값을 변경할 수 없다)
		 * 메서드 - 오버라이딩을 할 수 없다. 
		 * 클래스 - 상속을 통해 클래스에 새로운 멤버 추가 불가능 
		 *         (물려받는것 가능, 물려주는것 불가능)
		 * 
		 * */
		
		/*
		 * 예외(Exception)
		 * try ~ catch ~ finally
		 * */
		
		/*
		 * 문자열에 대해 대소문자 구별하지 않고 알파벳이 같은지 확인하는 메서드
		 * */
		String str = "abc";
		System.out.println(str.equals("ABC"));
		System.out.println(str.equalsIgnoreCase("ABC"));
		
		/*
		 * 개발자가 생성한 인스턴스를 사용하다 더이상 참조할 필요가 없다고 판단되면
		 * JVM에 포함되어 있는 '이것' 에 의해 자동으로 메모리에서 제거 됩니다.
		 * G.C (Garbage Collector) 가비지 컬렉터
		 * */		
	}

}
