package javaExample;


import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class java499_objects {

	public static void main(String[] args) {
		String[][] str2D	= new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D_2  = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		for(String[] tmp : str2D) {
			System.out.println(Arrays.toString(tmp));
		}
		
		System.out.println("===============");
		for(String[] tmp : str2D_2) {
			System.out.println(Arrays.toString(tmp));
		}
		
		System.out.println("===============");
		System.out.println(Objects.equals(str2D, str2D_2));
		
		System.out.println(Objects.deepEquals(str2D, str2D_2));
		
		System.out.println(Objects.toString(null, "비어있습니다"));// null 일 경우 오른쪽에 있는값을 대신씀
		
		Random r = new Random(1);
		System.out.println(r);
	}

}
