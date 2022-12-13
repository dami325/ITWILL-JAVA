
public class Test1 {

	public static void main(String[] args) {
		/*
		 * 거스름돈 계산
		 * 
		 * N이 32850일 경우
		 * 50000원 : 0개
		 * 10000원 : 3개
		 * 5000원 : 0개
		 * 1000원 : 2개
		 * 500원 : 1개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 0개
		 * 
		 * */
		
		int N = 32850;
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		int[] cnts = change(money, N);
		
		for(int i=0; i<cnts.length; i++) {
			System.out.println(money[i] + "원 : " + cnts[i] + "개");
		}
		
	}
	
//	public static int change(int money, int N) {
//		
//		int cnt = 0;
//		cnt = N / money;
//		return cnt;
//		
//	}
	
	public static int[] change(int[] money, int N) {
		int[] counts = new int[money.length];
		
		for(int i = 0; i < money.length; i++) {
			counts[i] = N / money[i];
			N %= money[i];
		}
		
		return counts;
	}
	
	
	

}
