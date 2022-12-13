package solve;

public class Ex3 {

	public static void main(String[] args) {
		// 문자 판별 조건
		//	1) 대문자 ('A' ~ 'Z')
		//	2) 소문자	 ('a' ~ 'z')
		//	3) 문자형 숫자 ('0' ~ '9')
		//	4) 위의 모든 조건이 만족하지 않으면 "기타 문자"
		
		char ch = 'R';
		String result = ch + " : ";	// R : 대문자
		if(ch >= 'A' && ch <= 'Z') {
			result += "대문자";
		} else if(Character.isLowerCase(ch)) {
			result += "소문자";
		} else if(Character.isDigit(ch)) {
			result += "숫자";
		} else {
			result += "기타문자";
		}
		
		System.out.println(result);
		
		
	}

}
