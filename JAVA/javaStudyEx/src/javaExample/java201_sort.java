package javaExample;

public class java201_sort {

	public static void main(String[] args) {
		//버블정렬하기(Bubble sort) 오름차순
		int[] numArr = new int[10];
		
		
		// 임의의 숫자 0~9 배열에 저장
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		
		
		
		
		for(int i = 0; i < numArr.length-1; i++) {
			
			boolean changed = false;
			
			for(int j = 0; j < numArr.length-1-i; j++) {
				
				if(numArr[j] > numArr[j+1]) {
					
					int cup 	= numArr[j+1];
					numArr[j+1] = numArr[j];
					numArr[j]   = cup;
					
					changed 	= true;
				}
			}
			 if (!changed) break; // 전체for문 종료
				
			 
			 for(int j = 0; j < numArr.length; j++) { // 출력문;
				 
				 System.out.print(numArr[j]);
			 }
			 System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
