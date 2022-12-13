package array;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * n개의 숫자가 입력되면, 다음과 같이 크기를 비교한 후 양식에 맞춰 출력하시오.
		 * 예를 들어, 1, 2, 3, 2, 1 이라는 숫자가 입력되면
		 * 
		 * 첫 번째 1과 나머지 2, 3, 2, 1을 비교하면 < < < = 를 출력한다.
		 * 두 번째 2와 나머지 1, 3, 2, 1을 비교하면 > < = > 를 출력한다.
		 * 세 번째 3과 나머지 1, 2, 2, 1을 비교하면 > > > > 를 출력한다.
		 * 
		 * 1: < < < =
		 * 2: > < = >
		 * 3: > > > >
		 * 4: > = < >
		 * 5: = < < <
		 * 
		 * */
		
		int[] arr = {1, 2, 3, 2, 1};
		
		for(int i = 0; i < arr.length; i++) {
			
			int target = arr[i];
			String result = i+1 + ": ";
			
			for(int j = 0; j < arr.length; j++) {
				
				int num = arr[j];
				
				if(i == j)	continue;
				
				if(target < num)		result += "< ";
				else if(target > num)	result += "> ";
				else					result += "= ";
				
			}
			System.out.println(result);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
