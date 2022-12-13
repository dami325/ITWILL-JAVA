
public class Ex1 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(plus(5)); 
	}

	public static int plus(int n) {
		if(n == 0) return 0;
		return n += plus(n-1);
	}
}
