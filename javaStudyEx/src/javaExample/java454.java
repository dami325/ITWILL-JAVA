package javaExample;


public class java454 {

	public static void main(String[] args) {
//		int i = 127;
//		
//		String toBinaryString = Integer.toBinaryString(i);
//		String toOctalString = Integer.toOctalString(i);
//		String toHexString = Integer.toHexString(i);
//		
//		
//		System.out.println("2진수 변환 " + toBinaryString);
//		System.out.println("8진수 변환 " + toOctalString);
//		System.out.println("16진수 변환 " + toHexString);
//		
//		int i2 = Integer.parseInt(toBinaryString,2);
//		System.out.println(i2);
//		
//		System.out.println();
		
		
		String str = "AABBAABB";
		
		String str2 = str.replace("BB", "bb");
		System.out.println(str2);
		
		String str3 = str.replaceAll("BB", "bb");
		System.out.println(str3);
	}

}
