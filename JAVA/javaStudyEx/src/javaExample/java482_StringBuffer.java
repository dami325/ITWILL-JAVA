package javaExample;


public class java482_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb3); // 모두 같은 주소를 가르키고 있음 결과값 동일
		
		System.out.println(sb.deleteCharAt(10));
		System.out.println(sb.delete(3, 6));
		System.out.println(sb.insert(3, "abc")); // 3번째 인덱스에 "abc" 추가
		System.out.println(sb.replace(6,  sb.length(), "END")); // 6번째 인덱스부터 마지막 까지 "END"로 변경
		
		System.out.println(sb.capacity()); // 스트링 버퍼의 길이
		System.out.println(sb.length()); // 문자열의 길이
		
		
	}

}
