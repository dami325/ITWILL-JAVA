package javaExample;

public class java169 {

	public static void main(String[] args) {

		
		
		int i = 5;
		
		// 전위형 --i 는 먼저 뺀후 조건이 맞는지 확인해본다.
		while(--i!=0) { // 4, 3, 2, 1 
			//총 4번 반복
			System.out.println(i);
		}
		System.out.println("========================");
		
		int i2 = 5;
		
		while(i2--!=0) { 
		// 후위형 i2-- 는 5로 조건문을 통과후 --가 적용되어 0까지 출력된다!.	
			System.out.println(i2);
		}
		System.out.println("=====================");
		int sum = 0;
		while(true) {
			if(sum > 1000) {
				break;
			}
		sum += ++i;
		System.out.println("i = " + i);
		System.out.println("sum = "+sum);
		
		}
		
		
	}

}
