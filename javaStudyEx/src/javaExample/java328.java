package javaExample;

public class java328 {

	public static void main(String[] args) {
		
		FinalTest finalTest = new FinalTest(10, 20);
		
		System.out.println(finalTest);
		
		FinalTest finalTest2 = new FinalTest(20, 30);
		
		System.out.println(finalTest2);
	}

}

final class FinalTest{
	final int MAX_SIZE;
	final int MAX;
	
	public FinalTest(int a, int b) {
		this.MAX_SIZE = a;
		this.MAX = b;
	}

	@Override
	public String toString() {
		String result = "a : " + MAX_SIZE + " b : " + MAX;
		
		return result; 
	}
	
	
	
}