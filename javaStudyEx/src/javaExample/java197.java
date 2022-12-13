package javaExample;

public class java197 {

	public static void main(String[] args) {
		// =============최대값과 최소값 ===================
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
			
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		// =============섞기 =======================
		int[] numArr = new int[10];
		
		for (int i =0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 100; i ++) {
			int n = (int)(Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			
		}
		
		for(int i : numArr) {
			System.out.print(i + " ");
		}
		
	}

}
