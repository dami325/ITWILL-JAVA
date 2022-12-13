package solve;

public class Ex4 {

	public static void main(String[] args) {
		// 1. "admin" (변수명 id)
		String id = "admin";
		String msg = "아이디가 일치하지 않습니다.";
		if(id.equalsIgnoreCase("ADMIN")) { // "ADMIN".equalsIgnoreCase(id);
			msg = "아이디가 일치합니다";
		}
		System.out.println(msg);
		
		// 2. "901010-1234567" (변수명 jumin)
		String jumin = "901010-1234567";
		System.out.println(jumin.split("-")[1].charAt(0)); 
		
		// 3. "아이티윌 부산 교육센터" (변수명 company)
		String company = "아이티윌  부산 교육센터";
		System.out.println(company.substring(5, 7));
		System.out.println(company.split(" ")[1]);
		
		System.out.println(company.trim().replace(" ", "").substring(4, 6)); 
		
	}

}
