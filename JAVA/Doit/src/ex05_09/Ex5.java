package ex05_09;

public class Ex5 {

	public static void main(String[] args) {
		// 168p
		
		// Q1) 정답: 생성자
		// 클래스를 생성할 때 호출하는 XXX는 멤버변수를 초기화하는데 사용합니다.
		
		// Q2) 정답: 인스턴스(객체), 인스턴스 변수 (필드, 속성)
		// 클래스를 생성하여 메모리에 있는 상태를 XXX라 하고 멤버변수를
		// 다른말로 XXX 라고 합니다.
		
		// Q3) 정답: 메서드
		// XXX는 일반 함수에 객체 지향의 개념을 추가하여, 클래스 내부에 선언하고
		// 클래스 멤버변수를 사용하여 클래스 기능을 구현합니다.
		
		// Q4)
		/*
		 * < MyDate 클래스 완성하기 >
		 * - day, month, year 변수는 private으로 선언합니다.
		 * - 각 변수의 get, set 메서드를 public 으로 만듭니다.
		 * - 모든 멤버변수를 초기화하는 MyDate 생성자를 만듭니다.
		 * - isValid() 메서드를 만들어 날짜가 유효한지 확인합니다.
		 *   => 복잡한 윤년까지 계산하지 말고, 2월은 28일 까지이며
		 *      1, 3, 5, 7, 8, 10, 12월은 31일 까지
		 *      4, 6, 9, 11월은 30일 인지만 검사한다.
		 * - main 메서드에서 생성한 MyDate 날짜가 유효한지 확인합니다.     
		 * */
		
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());		// false
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());		// true
		
		MyDate date3 = new MyDate(-10, 5, 1999);
		System.out.println(date3.isValid());
	}

}

class MyDate {
	private int day;
	private int month;
	private int year;
	
	public boolean isValid() {
		
		boolean result = true;
		
		if(day < 1) {
			return false;
		}
		
//		1, 3, 5, 7, 8, 10, 12: 31일 까지
//		4, 6, 9, 11: 30일 까지
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day > 31) result = false;
			break;
		case 4: case 6: case 9: case 11:
			if(day > 30) result = false;
			break;
		case 2:
			if(day > 28) result = false;
			break;
		}
		
		return result;
	}
	
	public MyDate(int day, int month, int year) {
//		if(day <= 0) day = 1;
//		if(month <= 0) month = 1;
//		if(year <= 0) year = 1;
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}
	
//	public void setDay(int day) {
//		this.day = day;
//	}

	public int getMonth() {
		return month;
	}

//	public void setMonth(int month) {
//		this.month = month;
//	}

	public int getYear() {
		return year;
	}

//	public void setYear(int year) {
//		this.year = year;
//	}
	
	
	
	
}








