package javaExample;

public class java250 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			numArr[i] = (int)(Math.random()*10);
		}
		
		
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		
		
		
	}

	
	static void printArr(int[] numArr) {
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d", numArr[i]);
		}
		System.out.println();
	}
}


