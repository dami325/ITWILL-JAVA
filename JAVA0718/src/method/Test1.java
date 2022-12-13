package method;

public class Test1 {

	public static void main(String[] args) {
		// 1. 매개변수 (X), 리턴 (X) 메서드 호출
		// "Hellow, World!" 문자열 10번 반복 출력하는 hello() 메서드 호출
		hello();
		System.out.println("----------------------");
		
		// 2. 매개변수 (O), 리턴 (X) 메서드 호출
		// "안녕하세요" 와 반복횟수도 전달하여, 전달한 만큼 반복하여 출력하는 hello2() 메서드 호출
		hello2("안녕하세요", 7);
		System.out.println("----------------------");
		// 3. 매개변수 (X), 리턴 (O) 메서드 호출
		// 1 ~ 10 까지 정수의 합(55)을 계산하여 리턴하는 메서드 sum() 호출 후 결과 출력
//		int result = sum();
//		System.out.println(result);
		System.out.println(sum());
//		System.out.println(55); 과 동일한 코드
		
		// 4. 매개변수 (O), 리턴 (O) 메서드 호출
		// 1 ~ 전달받은 매개변수 까지의 합을 리턴하는 메서드 sum2() 호출 후 결과 출력\
		int a = 1000;
		int sum = sum2(a);
		System.out.println("1 ~ 100 까지 정수의 합: " + sum);
		
		// 5. 리턴(X) 경우 return문
		sum3(100);
		
	}
	
	// 1. 매개변수 (X), 리턴 (X) 메서드 호출
	// "Hellow, World!" 문자열 10번 반복 출력하는 hello() 메서드 호출
	public static void hello() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " : Hellow, World!");
		}
	}
	
	// 2. 매개변수 (O), 리턴 (X) 메서드 호출
	// "안녕하세요" 와 반복횟수도 전달하여, 전달한 만큼 반복하여 출력하는 hello2() 메서드 호출
	public static void hello2(String msg, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + msg);
		}
	}
	
	// 3. 매개변수 (X), 리턴 (O) 메서드 호출
	// 1 ~ 10 까지 정수의 합(55)을 계산하여 리턴하는 메서드 sum() 호출 후 결과 출력
	public static int sum() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	// 4. 매개변수 (O), 리턴 (O) 메서드 호출
	// 1 ~ 전달받은 매개변수 까지의 합을 리턴하는 메서드 sum2() 호출 후 결과 출력
	public static int sum2(int limit) {
		int sum = 0;
		for(int i = 1; i <= limit; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 5. 리턴(X) 경우 return문
	public static void sum3(int limit) {
		int sum = 0;
		for(int i = 1; i <= limit; i++) {
			sum += i;
		}
		
		System.out.println("return 전 : " + sum);
		
		if(sum > 100) return;
		
		System.out.println("return 후 : " + sum);
		
	}
	
	
	
	
	

}
