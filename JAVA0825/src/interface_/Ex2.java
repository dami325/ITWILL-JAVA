package interface_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 인터페이스 필요성(장점)
		 * 3. 상속 관계가 없는 객체끼리의 관계 부여하여 다형성 활용 가능
		 * 
		 * */
		
		// ------- 상속 관계가 아닐 경우 나쁜(불편한) 예 ---------
		/*
		 * HandPhone 클래스와 DigitalCamera는 특정 클래스와 상속 관계가 아니므로
		 * 두 클래스의 유일한 공통클래스는 Object 클래스 뿐이다.
		 * 따라서, 업캐스팅을 통해 다형성을 적용하려면 Object 타입으로 업캐스팅해야 하며
		 * 업캐스팅 후에는 두 객체의 고유멤버 접근이 불가능하므로
		 * 다시 다운캐스팅을 통해 각 객체의 고유 멤버에 접근해야한다!
		 * 
		 * */
		Object obj1 = new HandPone();
		Object obj2 = new DigitalCamera();
		
		// => Object 타입 배열에 HandPhone, DigitalCamera 인스턴스를 업캐스팅 하여 저장
		Object[] objs = {obj1, obj2, new HandPone(), new DigitalCamera()};
		
		// 반복문을 사용하여 Object[] 배열 크기만큼 반복
		for(int i = 0; i < objs.length; i++) {
			// 배열 내의 각 객체를 꺼내서 Object 타입 변수에 저장
			Object obj = objs[i];
			if(obj instanceof HandPone) {
				HandPone hp = (HandPone)obj;
				hp.charge();
			} else if(obj instanceof DigitalCamera) {
				DigitalCamera dc = (DigitalCamera)obj;
				dc.charge();
			}
		}
		System.out.println("---------------------------------------");
		// 향상된 for문
		for(Object obj : objs) {
			if(obj instanceof HandPone) {
				HandPone hp = (HandPone)obj;
				hp.charge();
			} else if(obj instanceof DigitalCamera) {
				DigitalCamera dc = (DigitalCamera)obj;
				dc.charge();
			}
		}
		System.out.println("-----------------------------------------");
		
		// ---------- 인터페이스를 통해 상속관계가 아닌 클래스 끼리 상속 관계 부여 ----------------
		/*
		 * HandPhone2 클래스와 DigitalCamera2는 특정 클래스와 상속관계가 아니지만
		 * 두 클래스와 유일한 공통클래스는 Object 클래스 외에
		 * Chargable인터페이스를 정의하여 공통 부모로 정의하면
		 * 업캐스팅 후에도 두 객체의 고유 멤버인 charge() 메서드가
		 * 인터페이스 내의 추상메서드로 정의되어있기때문에
		 * 타입 판별없이, 다운캐스팅 없이도 공통 메서드 호출이 가능하다!!!
		 * */
		Chargeable[] objs2 = {new HandPone2(), new DigitalCamera2(), new DigitalCamera2(), new HandPone2()};
		
		for(Chargeable ch : objs2) {
			// 공통 부모인 Chargeable 인터페이스 타입으로 업캐스팅 한 뒤에도
			// 공통 메서드인 charge() 메서드에 직접 접근 가능 => instanceof 판별 필요없음
			ch.charge();
		}
		
		
		
		
	}

}
// ---------- 인터페이스를 통해 상속관계가 아닌 클래스 끼리 상속 관계 부여 ----------------
// 서로 상속관계가 없는 HandPhone과 DigitalCamera 클래스에
// 인터페이스를 통한 상속 관계를 부여하면 다형성을 확장하여 적용 가능!
interface Chargeable {
	public void charge();
}

class Phone2 {}
class HandPone2 extends Phone2 implements Chargeable {
	@Override
	public void charge() {
		System.out.println("HandPhone 충전!");
	}
}

class Camera2 {}
class DigitalCamera2 extends Camera2 implements Chargeable {
	@Override
	public void charge() {
		System.out.println("DigitalCamera 충전!");
	}
}


// ------- 상속 관계가 아닐 경우 나쁜(불편한) 예 ---------
class Phone {}
class HandPone extends Phone {
	public void charge() {
		System.out.println("HandPhone 충전!");
	}
}

class Camera {}
class DigitalCamera extends Camera {
	public void charge() {
		System.out.println("DigitalCamera 충전!");
	}
}













