package util;

import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {
		String data = "Address:부산광역시 부산진구 동천로109,Floor:7층,Tel:051-803-0909";
		// 1. 각 항목별 분리 (StringTokenizer 클래스 사용)
		// 2. 각 항목에서 실제 데이터를 분리하여 출력
		
		StringTokenizer st = new StringTokenizer(data, ",");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(str, ":");
//			st2.nextToken(); // Address, Floor, Tel 항목들은 그대로 내보내기
//			System.out.println(st2.nextToken());
			
			String key = st2.nextToken();
			String value = st2.nextToken();
			System.out.println(key + " : " + value);
		}
		
		// ----------------------------------------------------------
		
		System.out.println("---------------------------");
		for(String str : data.split(",")) {
			System.out.println(str.split(":")[1]); 
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
