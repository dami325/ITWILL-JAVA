package switch_case;

public class Test2 {

	public static void main(String[] args) {
		
		// 세 정수 n1, n2, n3 중 최대값을 출력 
		// ex) "최대값 : XX"

//		int n1 = 20, n2 = 24, n3 = 40;
		
		// if - else
//		if(n1 > n2 && n1 > n3) {	// n1이 제일 클 경우
//			System.out.println("최대값 : " + n1);
//		} else if(n2 > n1 && n2 > n3) {	// n2가 제일 클 경우
//			System.out.println("최대값 : " + n2);
//		} else {
//			System.out.println("최대값 : " + n3);
//		}
		
		// 중첩 if문
//		if(n1 > n2) {	
//			
//			if(n1 > n3) {	// n1이 제일 클경우
//				System.out.println("최대값 : " + n1);
//			} else {	// n3가 제일 클 경우
//				System.out.println("최대값 : " + n3);
//			}
//			
//		} else { // n2가 n1보다 더 클 경우
//			
//			if(n2 > n3) {
//				System.out.println("최대값 : " + n2);
//			} else {
//				System.out.println("최대값 : " + n3);
//			}
//			
//		}
		
		int n1 = 50, n2 = 444, n3 = 540;
		
		int max = (n1 > n2) ? n1 	: n2;
		max 	= (max > n3)? max 	: n3;
		System.out.println("최대값 : " + max);
		
		
		
		
		
		
		
	}

}
