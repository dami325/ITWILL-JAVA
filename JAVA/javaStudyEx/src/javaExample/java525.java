package javaExample;
import java.math.BigDecimal;

public class java525 {

	public static void main(String[] args) {
		
		
		BigDecimal bd1 = new BigDecimal("123.456");
		BigDecimal bd2 = new BigDecimal("1.0");
		
		System.out.println(bd1);
		System.out.println(bd1.unscaledValue());
		System.out.println(bd1.scale());
		System.out.println(bd1.precision());
		
		System.out.println(bd2);
		System.out.println(bd2.unscaledValue());
		
		
		
		
		
		
	}

}
