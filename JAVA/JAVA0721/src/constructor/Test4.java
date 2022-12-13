package constructor;

/*
 * 은행계좌 (Account3) 클래스 정의
 * 
 * 기본생성자, 계좌번호 생성자, 계좌번호와 예금주명 생성자
 * 계좌번호와 예금주명 현재잔고를 전달받는 생성자 정의
 * => this()를 사용하여 모든멤버변수를 초기화하는 생성자만 초기화를 담당하도록 수정
 * */
class Account3 {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account3() {
		this("111-1111-111", "우영우", 100000);
	}
	
	public Account3(String accountNo) {
		this(accountNo, "우영우", 100000);
	}
	
//	public Account3(String ownerName) {
//		this("111-1111-111", ownerName, 100000);
//	}
	
	public Account3(String accountNo, String ownerName) {
		this(accountNo, ownerName, 100000);
	}
	
//	public Account3(String ownerName, String accountNo) {
//		this(accountNo, ownerName, 100000);
//	}
	
	public Account3(String accountNo, int balance) {
		this(accountNo, "우영우", 100000);
	}
	
	public Account3(int balance, String ownerName) {
		this("111-1111-111", ownerName, 100000);
	}

	// 모든멤버변수 초기화를 전담
	public Account3(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void showInfo() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금주명: " + ownerName);
		System.out.println("현재잔고: " + balance);
	}
}


public class Test4 {

	public static void main(String[] args) {

		Account3 acc = new Account3();
		acc.showInfo();
		System.out.println("-----------------------");
		
		Account3 acc2 = new Account3("222-2222-222");
		acc2.showInfo();
		System.out.println("-----------------------");
		
		Account3 acc3 = new Account3("333-3333-333", "소지섭");
		acc3.showInfo();
		System.out.println("-----------------------");
		
		Account3 acc4 = new Account3("555-5555-555", "김태희", 9999999);
		acc4.showInfo();
		System.out.println("-----------------------");
		
		Account3 acc5 = new Account3("777-7777-777", 99999999);
		acc5.showInfo();
		System.out.println("-----------------------");
		
		Account3 acc6 = new Account3(888888, "차동원");
		acc6.showInfo();
		System.out.println("-----------------------");
	}

}
