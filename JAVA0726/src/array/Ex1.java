package array;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * - 배열의 확장이 가능한 객체
		 * */
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("홍길동");
		arr.add("우영우");
		arr.add("동그라미");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		arr.add("소지섭");
		arr.add("임수향");
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// <> 안에는 기본데이터 타입을 지정할수 없음
		// => 기본데이터타입 8개와 1:1로 대응하는 Wrapper 클래스를 지정하면됨
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(10);
		arr2.add(20);
		arr2.add(0, 30);
		for(int i=0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
//		byte = Byte
//		short = Short
//		int = Integer
//		long = Long
//		char = Character
//		boolean = Boolean
//		float = Float
//		double = Double
		
		
		
		
		
	}

}
