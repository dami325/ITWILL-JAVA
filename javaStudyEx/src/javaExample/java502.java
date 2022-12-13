package javaExample;
import java.util.Random;

public class java502 {

	public static void main(String[] args) {
		/*	 	0~ 9 사이의 난수를 100개 발생시키고 각 숫자의 빈도수를 센 다음 그래프를 그리는 예제
		 * 		nextInt(int n)는 0부터 n 사이의 정수를 반환한다(주의! 단 n은 범위에 포함되지 않음)
		 * 
		 * 
		 */
		Random r = new Random();
		int[] num = new int[100];
		int[] count = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] = (int)(Math.random()*10));
//			num[i] = r.nextInt(10);         //동일
		}
		for(int i = 0; i < num.length; i ++) {
			count[num[i]]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(i +": 의 갯수" + printGraph('*', count[i]) + count[i]);
		}
		
		
		
		
		
	}
	
	public static String printGraph(char ch, int value) {
		char[] carr = new char[value];
		
		for(int i = 0; i < value; i++) {
			carr[i] = ch;
		}
		
		return new String(carr);
	}

}
