package constructor;

/*
 * 은행계좌 (Account) 클래스 정의
 * - 멤버변수
 * 		1) 계좌번호(accountNo, 문자열)
 * 		2) 예금주명(ownerName, 문자열)
 * 		3) 현재잔고(balance, 정수)
 * 
 * - 생성자 모든 멤버변수(필드, 속성)를 전달받은 값으로 초기화 해주는 생성자 
 * */
class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		this.accountNo = "333-3333-333";
		this.ownerName = "소지섭";
		this.balance = 1000000;
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		System.out.println("this: " + this);
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
}


public class Test1 {

	public static void main(String[] args) {

		Account acc = new Account("111-1111-111", "홍길동", 100000);
		System.out.println(acc);
		System.out.println("계좌번호: " + acc.accountNo);
		System.out.println("예금주명: " + acc.ownerName);
		System.out.println("현재잔고: " + acc.balance);
		
		System.out.println("---------------------------------------");
		Account acc2 = new Account("222-2222-222", "우영우", 100000);
		System.out.println(acc2);
		
		Account acc3 = new Account();
		System.out.println("계좌번호: " + acc3.accountNo);
		System.out.println("예금주명: " + acc3.ownerName);
		System.out.println("현재잔고: " + acc3.balance);
//		new Account("444-4444-444");
		
	}

}
