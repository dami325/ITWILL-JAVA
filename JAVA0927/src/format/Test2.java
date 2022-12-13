package format;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		int money = 128000;
		// 정수 128000을 128,000원 형식으로 변경하여 출력
		String pattern = "#,###원";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
		
		// 문자열 "128,000원" 을 정수 128000으로 변경하여 출력
//		long parsedMoney = (long)df.parse(strMoney);
//		int parsedMoney = Math.toIntExact((long)df.parse(strMoney));
		int parsedMoney = df.parse(strMoney).intValue();
		
		System.out.println(parsedMoney);
		
	}

}
