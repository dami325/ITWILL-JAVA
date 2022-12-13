package constructor;


class DefaultPerson {
	
	String name;
	
	// 생성자를 아무것도 정의하지 않으면 컴파일러에 의해 자동으로 기본생성자가 생성됨
	// => 기본생성자 : 파라미터없음, 중괄호 블록 내에 아무코드도 없음
	//				=> 아무것도 전달받지 않으며, 아무작업도 수행하지 않음
	public DefaultPerson() {}
}

class DefaultPerson2 {
	String name;
	
	public DefaultPerson2 () {
		System.out.println("DefaultPerson2() 생성자 호출됨!!");
		name = "홍길동";
	}
}

class ParameterPerson {
	String name;

	public ParameterPerson(String newName) {
		System.out.println("ParameterPerson(String) 생성자 호출됨!!");
		name = newName;
	}
}

class ParameterPerson2 {
	
	String name;
	int age;
	boolean isHungry;
	
//	public ParameterPerson2(String newName, int newAge, boolean newIsHungry) {
//		System.out.println("ParameterPerson2(String, int, boolean) 생성자 호출됨!!");
//		name = newName;
//		age = newAge;
//		isHungry = newIsHungry;
//	}
	
	// Alt + Shift + S -> O
	public ParameterPerson2(String name, int age, boolean isHungry) {
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
}



public class Ex1 {

	public static void main(String[] args) {
		DefaultPerson dp = new DefaultPerson();
		System.out.println("DefaultPerson의 name : " + dp.name);
		System.out.println("---------------------------------");
		
		DefaultPerson2 dp2 = new DefaultPerson2();
		System.out.println("DefaultPerson2의 name : " + dp2.name);
		System.out.println("---------------------------------");
		
		ParameterPerson p = new ParameterPerson("소지섭");
		System.out.println("ParameterPerson의 name : " + p.name);
		System.out.println("---------------------------------");
		
		ParameterPerson2 p2 = new ParameterPerson2("우영우", 20, true);
		System.out.println("ParameterPerson2의 name: " + p2.name);
		System.out.println("ParameterPerson2의 age: " + p2.age);
		System.out.println("ParameterPerson2의 isHungry: " + p2.isHungry);
		
		// 기존에 파라미터를 전달받는 생성자를 정의해 놓은 경우
		// 컴파일러가 기본 생성자를 자동으로 생성하지 않으므로
		// 기본 생성자 호출 코드가 존재하는 경우 오류 발생!
//		new DefaultPerson();
//		new DefaultPerson2();
//		new ParameterPerson();
//		new ParameterPerson2();
		
		
		
	}

}
