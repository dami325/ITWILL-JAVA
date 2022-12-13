package ref_casting;

public class Test1 {

	public static void main(String[] args) {
		// 업캐스팅과 다운캐스팅 연습
		// 서브클래스(스마트폰) 타입 인스턴스 생성
		스마트폰 갤럭시노트 = new 스마트폰();
		갤럭시노트.전화();
		갤럭시노트.문자();
		갤럭시노트.카톡();
		
		// 슈퍼클래스(핸드폰) 타입 인스턴스 생성
		핸드폰 어머니폰 = new 핸드폰();
		어머니폰.전화();
		어머니폰.문자();
		
		System.out.println("-----------------------------------");
		
		// 업캐스팅 (스마트폰 -> 핸드폰)
		// 스마트폰(갤럭시노트)을 어머니께 드리는 경우
		어머니폰 = 갤럭시노트;
		어머니폰.전화();	// 핸드폰에서 사용 가능한 기능
		어머니폰.문자();	// 핸드폰에서 사용 가능한 기능
//		어머니폰.카톡();	// 핸드폰에서 사용 불가능한 기능!
		
		// 만약, 동생의 스마트폰(아이폰)을 어머니께 드리는 경우
		스마트폰 아이폰 = new 스마트폰();
		어머니폰 = 아이폰;
		어머니폰.전화();
		어머니폰.문자();
//		어머니폰.카톡();
		
		System.out.println("---------------------------");
		
		// 다운캐스팅 (핸드폰 -> 스마트폰)
		// 어머니께 새 스마트폰을 사드렸을 경우
		어머니폰 = new 스마트폰();
		어머니폰.전화();
		어머니폰.문자();
//		어머니폰.카톡();
		
		// 어머니 스마트폰을 내가 가져다 쓰는 경우
		스마트폰 내폰 = (스마트폰)어머니폰; // 자동 형변환 불가능 => 명시적 형변환 필수!
		내폰.전화();
		내폰.문자();
		내폰.카톡();
		
		System.out.println("====== 다운 캐스팅 오류 케이스 ========");
//		핸드폰 아버지폰 = new 핸드폰();
//		// 아버지 2G폰(폴더, 슬라이드) 내가 가져다 쓰는 경우
//		내폰 = (스마트폰)아버지폰;
//		내폰.전화();
//		내폰.문자();
//		내폰.카톡();
		
		System.out.println("---------------------------------------");
		A a = new G();
		a.method();
		
		
		
	}

}

class 전화기 {
	public void 전화() {
		System.out.println("전화 걸기!");
	}
}

class 핸드폰 extends 전화기 {
	public void 문자() {
		System.out.println("문자 전송!");
	}
}

class 스마트폰 extends 핸드폰 {
	public void 카톡() {
		System.out.println("카독 메시지 전송!");
	}
}


// -------------------------------------------------
class A {
	public void method() {
		System.out.println("A");
	}
}
class B extends A {
	public void method() {
		System.out.println("B");
	}
}
class C extends A {
	public void method() {
		System.out.println("C");
	}
}
class D extends B {
	public void method() {
		System.out.println("D");
	}
}
class E extends B {
	public void method() {
		System.out.println("E");
	}
}
class F extends C {
	public void method() {
		System.out.println("F");
	}
}
class G extends C {
	public void method() {
		System.out.println("G");
	}
}
















