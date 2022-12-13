package javaExample;
import java.util.StringTokenizer;

public class java514 {

	public static void main(String[] args) {
//		String source = "100,200,300,400";
//		StringTokenizer st = new StringTokenizer(source, ",");
//		
//		int countTokens = st.countTokens(); 
//		System.out.println("토큰수: " + countTokens);
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
//		countTokens = st.countTokens();
//		System.out.println("토큰수: " + countTokens);
		
		String expression = "x=100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(expression, "-+/*=)(", true);
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
		
		
		
	}

}
