package javaExample;
import java.util.Arrays;

public class java191 {

	public static void main(String[] args) {
			
		int[] iArr = {100, 95, 80, 70, 60};
		System.out.println(Arrays.toString(iArr));
		System.out.println(iArr);
		
		//char배열은 예외적으로 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력됨
		char[] chArr = {'a','b','c','d',};
		System.out.println(chArr);
	}

}
