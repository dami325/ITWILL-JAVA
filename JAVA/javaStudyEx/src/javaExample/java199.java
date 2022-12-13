package javaExample;

public class java199 {

	public static void main(String[] args) {
			//배열 섞기 로또
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < ball.length; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
		
	}

}
