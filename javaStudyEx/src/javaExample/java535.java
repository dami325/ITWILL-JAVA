package javaExample;

public class java535 {

	public static void main(String[] args) {
		
		String date1 = "201508";
		String date2 = "201405";
		
		
		int month1 = Integer.parseInt(date1.substring(0,4)) * 12
					+Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0,4)) * 12
					+Integer.parseInt(date2.substring(4));
		
		System.out.println("2014년 5월//2015년도 8월 차이 : "+Math.abs(month1-month2) + " 개월");
		
		
		
	}

}
