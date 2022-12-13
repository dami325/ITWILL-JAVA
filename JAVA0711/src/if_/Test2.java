package if_;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * int형 정수 2개가 있으면 아래와 같이 출력
		 * ex) int n1 = 5, n2 = 7
		 * 	   => "홀수 + 홀수 = 짝수"
		 * 
		 * ex2) int n1 = 4, n2 = 5
		 * 		=> "짝수 + 홀수 = 홀수"
		 * */
		
		int n1 = 5, n2 = 7;
		
		if(n1 % 2 == 0) { // n1 이 짝수
			
			if(n2 % 2 == 0) { // n2가 짝수
				System.out.println("짝수 + 짝수 = 짝수");
			} else { // n2가 홀수
				System.out.println("짝수 + 홀수 = 홀수");
			}
			
		} else { // n1이 홀수
			
			if(n2 % 2 == 0) { // n2가 짝수
				System.out.println("홀수 + 짝수 = 홀수");
			} else { // n2가 홀수
				System.out.println("홀수 + 홀수 + 짝수");
			}
			
		}
		
		
		
		
		
		
	}

}
